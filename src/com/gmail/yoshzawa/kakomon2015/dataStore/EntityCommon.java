package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class EntityCommon {
	Entity getNewEntity(String kindName, String id) {
		Key key = KeyFactory.createKey(kindName, id);
		Entity entity = new Entity(key);
		return entity;
	}
	
	public void getFields(){
		Set<String> fSet=new HashSet<String>();
		Class<? extends EntityCommon> cls = getClass();
		Field[] fs = cls.getDeclaredFields();
		for(Field f:fs){
			Annotation[] as = f.getDeclaredAnnotations();
			if (as.length != 0 ){
				fSet.add(f.getName());
			}
		}
		for(String s:fSet){
			System.out.println(s);
		}
	}
}
