package com.gmail.yoshzawa.kakomon2015.dataStore;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class Question extends EntityCommon{
	String id;
	String examKey;
	int order;
	String name;

	public Question(String id, String examKey, int order, String name) {
		setId(id);
		setExamKey(examKey);
		setOrder(order);
		setName(name);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExamKey() {
		return examKey;
	}

	public void setExamKey(String examKey) {
		this.examKey = examKey;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void put() {
		String kindName = "Question";
		String id = getId();

		Entity entity = getEntity(kindName,id);
		entity.setProperty("id", getId());
		entity.setProperty("examKey", getExamKey());
		entity.setProperty("order", getOrder());
		entity.setProperty("name", getName());
		
		DatastoreService dss = DatastoreServiceFactory.getDatastoreService();
		dss.put(entity);
	}

	public static Question get(String id) {
		Key key = KeyFactory.createKey("Question", id);
		DatastoreService dss = DatastoreServiceFactory.getDatastoreService();
		Entity e;
		try {
			e = dss.get(key);
			String examKey = (String) e.getProperty("examKey");
			int order = Integer.parseInt((String) e.getProperty("order"));
			String name = (String) e.getProperty("name");
			return new Question(id,examKey,order,name);
		} catch (EntityNotFoundException e1) {
			return null;
		}
	}
	
	

}
