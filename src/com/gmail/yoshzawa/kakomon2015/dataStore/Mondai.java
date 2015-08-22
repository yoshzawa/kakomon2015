package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.Entity;

@EntityKind
public class Mondai extends EntityCommon{
	//@EntityField
	//	String id;

	@EntityField
	String name;

	@EntityField
	String mondaiPrintKey;

	@EntityField
	int sortOrder;

	@EntityField
	String questionKey;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMondaiPrintKey() {
		return mondaiPrintKey;
	}

	public void setMondaiPrintKey(String mondaiPrintKey) {
		this.mondaiPrintKey = mondaiPrintKey;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getQuestionKey() {
		return questionKey;
	}

	public void setQuestionKey(String questionKey) {
		this.questionKey = questionKey;
	}
	
	public Mondai(String id , String name,String mondaiPrintKey,int sortOrder,String questionKey){
		setId(id);
		setName(name);
		setMondaiPrintKey(mondaiPrintKey);
		setSortOrder(sortOrder);
		setQuestionKey(questionKey);
	}
	
	public static Mondai get(String id) {
		Entity e = get(Mondai.class, id);
		if (e != null) {
			String name = (String) e.getProperty("name");
			String mondaiPrintKey = (String) e.getProperty("mondaiPrintKey");
			int sortOrder = (int) (long) e.getProperty("sortOrder");
			String questionKey = (String) e.getProperty("questionKey");
			return new Mondai(id, name, mondaiPrintKey,sortOrder,questionKey);
		}
		return null;
	}
	
	public static List<Mondai> getList() {
		List<Entity> eList = getList(Mondai.class);
		List<Mondai> mList = new ArrayList<Mondai>(eList.size());
		for (Entity e : eList) {
			String id = (String) e.getProperty("id");

			String name = (String) e.getProperty("name");
			String mondaiPrintKey = (String) e.getProperty("mondaiPrintKey");
			int sortOrder = (int) (long) e.getProperty("sortOrder");
			String questionKey = (String) e.getProperty("questionKey");
			Mondai q = new Mondai(id, name, mondaiPrintKey,sortOrder,questionKey);
			mList.add(q);
		}
		return mList;
	}

	public static List<Mondai> getListById(Set<String> mSet) {
		List<Mondai> mList = new ArrayList<Mondai>(mSet.size());
		for(String s : mSet){
			mList.add(get(s));
		}
		return mList;
	}




}
