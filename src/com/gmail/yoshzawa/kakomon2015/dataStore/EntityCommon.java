package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

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

	public final void put() throws NoSuchFieldException
	{
		String kindName = getKind();
		String[] fieldName = getFields();
		String id = getId();

		Entity entity = getNewEntity(kindName, id);
		Class<? extends EntityCommon> cls = getClass();
		try {

			for (String s : fieldName) {
				Field f = cls.getDeclaredField(s);
				f.setAccessible(true);
//				if(f.getType().equals(Integer.TYPE))
//				{
//					entity.setProperty(s, (Integer)f.getInt(this));
//				} else 
//				{
					entity.setProperty(s, f.get(this));
//				}
			}
			DatastoreService dss = DatastoreServiceFactory
					.getDatastoreService();
			dss.put(entity);
		} catch (SecurityException e) {
			throw new NoSuchFieldException();
		} catch (IllegalArgumentException e) {
			throw new NoSuchFieldException();
		} catch (IllegalAccessException e) {
			throw new NoSuchFieldException();
		}
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
	 * アノテーションのついたクラスのクラス名を取得 参考：
	 * http://www.ne.jp/asahi/hishidama/home/tech/java/annotation.html
	 * 
	 * @return EntityKindアノテーションのついたクラス名
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
	 * アノテーションのついたフィールドのフィールド名一覧を取得 参考：
	 * http://www.ne.jp/asahi/hishidama/home/tech/java/annotation.html
	 * 
	 * @return EntityFieldアノテーションのついたフィールドのリスト
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
