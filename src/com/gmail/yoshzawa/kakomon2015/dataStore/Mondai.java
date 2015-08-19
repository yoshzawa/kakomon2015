package com.gmail.yoshzawa.kakomon2015.dataStore;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.Entity;

@EntityKind
public class Mondai extends EntityCommon{
	//@EntityField
	//	String id;

	@EntityField
	String[] questionKey;

	@EntityField
	String name;

	@EntityField
	int kaitouMax;

	@EntityField
	int seikai;

	public String[] getQuestionKey() {
		return questionKey;
	}

	public void setQuestionKey(String[] questionKey) {
		this.questionKey = questionKey;
	}

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


}
