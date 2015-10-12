package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.util.ArrayList;
import java.util.List;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.Entity;

@EntityKind
public class Mondai extends EntityCommon {
	// @EntityField
	// String id;

	@EntityField
	String name;

	@EntityField
	String mondaiPrintKey;

	@EntityField
	int sortOrder;

	@EntityField
	String questionKey;

	String questionName;
	int kaitouMax;
	int seikai;

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

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public int getKaitouMax() {
		return kaitouMax;
	}

	public void setKaitouMax(int kaitouMax) {
		this.kaitouMax = kaitouMax;
	}

	public int getSeikai() {
		return seikai;
	}

	public void setSeikai(int seikai) {
		this.seikai = seikai;
	}

	public Mondai(String id, String name, String mondaiPrintKey, int sortOrder,
			String questionKey) {
		this(id,name,mondaiPrintKey,sortOrder,questionKey,null,0,0);
	}

	public Mondai(String id, String name, String mondaiPrintKey, int sortOrder,
			String questionKey, String questionName, int kaitouMax, int seikai) {
		setId(id);
		setName(name);
		setMondaiPrintKey(mondaiPrintKey);
		setSortOrder(sortOrder);
		setQuestionKey(questionKey);
		setQuestionName(questionName);
		setKaitouMax(kaitouMax);
		setSeikai(seikai);
	}

	public static Mondai get(String id) {
		Entity e = get(Mondai.class, id);
		if (e != null) {
			return getFromEntity(id, e);
		}
		return null;
	}

	private static Mondai getFromEntity(String id, Entity e) {
		String name = (String) e.getProperty("name");
		String mondaiPrintKey = (String) e.getProperty("mondaiPrintKey");
		int sortOrder = (int) (long) e.getProperty("sortOrder");
		String questionKey = (String) e.getProperty("questionKey");
		
		Question q = Question.get(questionKey);
		String questionName = q.getName();
		int kaitouMax=q.getKaitouMax();
		int seikai=q.getSeikai();
		
		return new Mondai(id, name, mondaiPrintKey, sortOrder, questionKey,questionName,kaitouMax,seikai);
	}

	public static List<Mondai> getList() {
		List<Entity> eList = getList(Mondai.class);
		List<Mondai> mList = new ArrayList<Mondai>(eList.size());
		for (Entity e : eList) {
			String id = (String) e.getProperty("id");
			Mondai q = getFromEntity(id, e);
			mList.add(q);
		}
		return mList;
	}


	public static List<Mondai> getListByParentId(String mondaiPrintId) {
		List<Entity> eList = getListByParentId(Mondai.class, "mondaiPrintKey",
				mondaiPrintId, "sortOrder");
		List<Mondai> mList = new ArrayList<Mondai>(eList.size());
		for (Entity e : eList) {
			String id = (String) e.getProperty("id");
			Mondai q = getFromEntity(id, e);
			mList.add(q);
		}
		return mList;
	}
}
