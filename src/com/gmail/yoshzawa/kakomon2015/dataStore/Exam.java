package com.gmail.yoshzawa.kakomon2015.dataStore;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class Exam {
	String id;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Exam(String id,String name){
		setId(id);
		setName(name);
	}
	
//	public Exam get(String id){
		
//	}
	
	public void put(){
        //キーの生成
        Key key = KeyFactory.createKey("Exams",getId());
        //エンティティーの作成
        Entity entity = new Entity(key);
        //プロパティーのセット
        entity.setProperty("name",getName());
 
        //データストアへアクセス
        DatastoreService dss = DatastoreServiceFactory.getDatastoreService();
        dss.put(entity);
	}
	public static Exam get(String id) {
        Key key = KeyFactory.createKey("Exams",id);
        DatastoreService dss = DatastoreServiceFactory.getDatastoreService();
        Entity e;
		try {
			e = dss.get(key);
	        String name = (String) e.getProperty("name");
	        return new Exam(id,name);
		} catch (EntityNotFoundException e1) {
			return null;
		}
		
	}

}
