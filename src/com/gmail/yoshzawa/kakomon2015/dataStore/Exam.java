package com.gmail.yoshzawa.kakomon2015.dataStore;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.*;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@EntityKind
public class Exam extends EntityCommon{
	
//	@EntityField
//	String id;

	@EntityField
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Exam(String id, String name) {
		setId(id);
		setName(name);
	}

	public static Exam get(String id){
		Entity e = get(Exam.class,id);
		if(e != null){
			String name = (String) e.getProperty("name");
			return new Exam(id, name);
		}
		return null;
	}

}
