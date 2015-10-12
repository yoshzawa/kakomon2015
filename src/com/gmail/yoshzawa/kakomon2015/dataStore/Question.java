package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.util.ArrayList;
import java.util.List;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.Entity;

@EntityKind
public class Question extends EntityCommon {

	@EntityField
	String name;

	@EntityField
	int kaitouMax;

	@EntityField
	int seikai;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public Question(String id,String name,int kaitouMax,int seikai){
		setId(id);
		setName(name);
		setKaitouMax(kaitouMax);
		setSeikai(seikai);
	}



	public static Question get(String id) {
		Entity e = get(Question.class, id);
		if (e != null) {
			String name = (String) e.getProperty("name");

			int kaitouMax = (int) (long) e.getProperty("kaitouMax");
			int seikai = (int) (long) e.getProperty("seikai");
			return new Question(id, name, kaitouMax, seikai);
		}
		return null;
	}
	
	public static List<Question> getList() {
		List<Entity> eList = getList(Question.class);
		List<Question> qList = new ArrayList<Question>(eList.size());
		for (Entity e : eList) {
			String id = (String) e.getProperty("id");
			String name = (String) e.getProperty("name");
			int kaitouMax = (int)(long)e.getProperty("kaitouMax");
			int seikai = (int)(long)e.getProperty("seikai");
			Question q = new Question(id, name, kaitouMax, seikai);
			qList.add(q);
		}
		return qList;
	}
	
}
