package com.gmail.yoshzawa.kakomon2015.dataStore;

public class Question {
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
	
	

}
