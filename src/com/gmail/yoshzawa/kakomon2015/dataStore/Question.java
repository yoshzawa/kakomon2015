package com.gmail.yoshzawa.kakomon2015.dataStore;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.Entity;

@EntityKind
public class Question extends EntityCommon{
	//@EntityField
	//	String id;

	@EntityField
	String examKey;

	@EntityField
	int order;

	@EntityField
	String name;

	@EntityField
	int seikai;

	public Question(String id, String examKey, int order, String name,int seikai) {
		setId(id);
		setExamKey(examKey);
		setOrder(order);
		setName(name);
		setSeikai(seikai);
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
	
	public int getSeikai() {
		return seikai;
	}

	public void setSeikai(int seikai) {
		this.seikai = seikai;
	}

	public static Question get(String id){
		Entity e = get(Question.class,id);
		if(e != null){
			String examKey = (String) e.getProperty("examKey");
			int order = (int)(long) e.getProperty("order");
			String name = (String) e.getProperty("name");
			int seikai = (int)(long) e.getProperty("seikai");
			return new Question(id,examKey,order,name,seikai);
		}
		return null;
	}
}
