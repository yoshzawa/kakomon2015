package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.Entity;

@EntityKind
public class MondaiPrint extends EntityCommon {

	@EntityField
	String name;

	@EntityField
	Set<String> mondai;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getMondai() {
		return mondai;
	}

	public void setMondai(Set<String> mondai) {
		this.mondai = mondai;
	}

	public void addMondai(String mondai) {
		Set<String> ms = getMondai();
		ms.add(mondai);
		setMondai(ms);
	}

	public MondaiPrint(String id, String name, Set<String> mondais) {
		setId(id);
		setName(name);
		setMondai(mondais);
	}

	public MondaiPrint(String id, String name) {
		this(id, name, new HashSet<String>());
	}

	public static MondaiPrint get(String id) {
		Entity e = get(MondaiPrint.class, id);
		if (e != null) {
			String name = (String) e.getProperty("name");
			@SuppressWarnings("unchecked")
			Set<String> mondai = (Set<String>) e.getProperty("mondai");
			MondaiPrint mp = new MondaiPrint(id, name, mondai);
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
			@SuppressWarnings("unchecked")
			Set<String> mondais = (Set<String>) e.getProperty("mondais");
			MondaiPrint mp = new MondaiPrint(id, name, mondais);
			mpList.add(mp);
		}
		return mpList;
	}
}
