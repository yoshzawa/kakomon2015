package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.util.HashSet;
import java.util.Set;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.Entity;

@EntityKind
public class Exam extends EntityCommon {

	@EntityField
	String name;

	@EntityField
	Set<String> questions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<String> questions) {
		this.questions = questions;
	}

	public void addQuestions(String question) {
		Set<String> qs = getQuestions();
		qs.add(question);
		setQuestions(qs);
	}

	public Exam(String id, String name, Set<String> questions) {
		setId(id);
		setName(name);
		setQuestions(questions);
	}

	public Exam(String id, String name) {
		this(id, name, new HashSet<String>());
	}

	public static Exam get(String id) {
		Entity e = get(Exam.class, id);
		if (e != null) {
			String name = (String) e.getProperty("name");
			@SuppressWarnings("unchecked")
			Set<String> questions = (Set<String>) e.getProperty("questions");
			return new Exam(id, name, questions);
		}
		return null;
	}
}
