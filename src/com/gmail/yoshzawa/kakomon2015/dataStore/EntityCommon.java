package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

/**
 * @author t.yoshizawa
 *
 */
public class EntityCommon {

	@EntityField
	String id;

	private Entity getNewEntity(String kindName, String id) {
		Key key = KeyFactory.createKey(kindName, id);
		Entity entity = new Entity(key);
		return entity;
	}

	public final void put() throws NoSuchFieldException {
		String kindName = getKind();
		String[] fieldNames = getFields();
		String id = getId();

		Entity entity = getNewEntity(kindName, id);
		Class<? extends EntityCommon> cls = getClass();
		setFields(entity, cls, fieldNames);
		setProperty(entity, "id", getId());
		DatastoreService dss = DatastoreServiceFactory.getDatastoreService();
		dss.put(entity);
	}

	private void setFields(Entity entity, Class<? extends EntityCommon> clazz,
			String[] fieldNames) throws NoSuchFieldException {
		for (String s : fieldNames) {
			setField(entity, clazz, s);
		}
	}

	private void setField(Entity entity, Class<? extends EntityCommon> clazz,
			String fieldName) throws NoSuchFieldException {
		try {
			Field f = clazz.getDeclaredField(fieldName);
			f.setAccessible(true);
			setProperty(entity, fieldName, f.get(this));
		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new NoSuchFieldException(fieldName);
		}
	}

	void setProperty(Entity entity, String fieldName, Object obj) {
		entity.setProperty(fieldName, obj);
	}

	public static Entity get(Class<? extends EntityCommon> clazz, String id) {

		String kindName = getKind(clazz);

		Key key = KeyFactory.createKey(kindName, id);
		DatastoreService dss = DatastoreServiceFactory.getDatastoreService();
		try {
			Entity e;
			e = dss.get(key);
			return e;
		} catch (EntityNotFoundException e1) {
			return null;
		}
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * http://www.ne.jp/asahi/hishidama/home/tech/java/annotation.html
	 * 
	 * @return EntityKind
	 */
	public String getKind() {
		Class<? extends EntityCommon> cls = getClass();
		return getKind(cls);
	}

	public static String getKind(Class<? extends EntityCommon> cls) {
		Annotation[] as = cls.getDeclaredAnnotations();

		if (checkAnnotation(as, EntityKind.class) == true) {
			return cls.getName();
		}
		return null;
	}

	/**
	 * 
	 * http://www.ne.jp/asahi/hishidama/home/tech/java/annotation.html
	 * 
	 * @return EntityField
	 */
	public String[] getFields() {

		Set<String> fSet = new HashSet<String>();
		Class<? extends EntityCommon> cls = getClass();
		Field[] fs = cls.getDeclaredFields();
		for (Field f : fs) {
			Annotation[] as = f.getDeclaredAnnotations();
			if (checkAnnotation(as, EntityField.class) == true) {
				fSet.add(f.getName());
			}
		}
		String[] s = new String[fSet.size()];
		fSet.toArray(s);
		return s;
	}

	static List<Entity> getList(Class<? extends EntityCommon> clazz) {
		List<Entity> entityList = new ArrayList<>();
		DatastoreService dss = DatastoreServiceFactory.getDatastoreService();
		String className = clazz.getName();
		Query q = new Query(className);
		q.addSort("id");
		PreparedQuery preparedQuery = dss.prepare(q);
		Iterable<Entity> eList = preparedQuery.asIterable();
		for (Entity e : eList) {
			entityList.add(e);
		}
		return entityList;
	}

	static List<Entity> getListByParentId(Class<? extends EntityCommon> clazz,
			String parentKeyName, String parentKeyValue, String sortOrder) {
		List<Entity> entityList = new ArrayList<>();
		DatastoreService dss = DatastoreServiceFactory.getDatastoreService();
		String className = clazz.getName();
		Query q = new Query(className);
		Filter parentKeyFilter = new FilterPredicate(parentKeyName,
				FilterOperator.EQUAL, parentKeyValue);
		q.setFilter(parentKeyFilter);
		q.addSort(sortOrder);
		PreparedQuery preparedQuery = dss.prepare(q);
		Iterable<Entity> eList = preparedQuery.asIterable();
		for (Entity e : eList) {
			entityList.add(e);
		}
		return entityList;
	}

	private static boolean checkAnnotation(Annotation[] annotations,
			Class<? extends Annotation> clazz) {
		boolean flag = false;
		for (Annotation a : annotations) {
			Class<? extends Annotation> at = a.annotationType();
			if (at.equals(clazz)) {
				flag = true;
			}
		}
		return flag;
	}
}
