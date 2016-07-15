package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.util.ArrayList;
import java.util.List;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.Entity;

@EntityKind
public class MondaiPrint extends EntityCommon {

	@EntityField
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * コンストラクタ
	 * @param id
	 * @param name
	 */
	public MondaiPrint(String id, String name) {
		setId(id);
		setName(name);
	}

	public static MondaiPrint get(String id) {
		Entity e = get(MondaiPrint.class, id);
		if (e != null) {
			String name = (String) e.getProperty("name");
			MondaiPrint mp = new MondaiPrint(id, name);
			return mp;
		}
		return null;
	}

	public static List<MondaiPrint> getList() {
		List<Entity> eList = getList(MondaiPrint.class);
		List<MondaiPrint> mpList = new ArrayList<MondaiPrint>(eList.size());
		for (Entity e : eList) {
			String name = (String) e.getProperty("name");
			String id = (String) e.getProperty("id");
			MondaiPrint mp = new MondaiPrint(id, name);
			mpList.add(mp);
		}
		return mpList;
	}
}
