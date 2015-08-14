package com.gmail.yoshzawa.kakomon2015.dataStore;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class EntityCommon {
	Entity getEntity(String kindName, String id) {
		Key key = KeyFactory.createKey(kindName, id);
		Entity entity = new Entity(key);
		return entity;
	}
}
