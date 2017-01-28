package com.gmail.yoshzawa.kakomon2015.dataStore;

import java.util.ArrayList;
import java.util.List;

import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityField;
import com.gmail.yoshzawa.kakomon2015.dataStore.annotation.EntityKind;
import com.google.appengine.api.datastore.Entity;

/**
 * @author t.yoshizawa
 *
 */
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

	/**
	 * コンストラクタ
	 * @param id
	 * @param name
	 * @param kaitouMaxｎ　
	 * @param seikai
	 */
	public Question(String id, String name, int kaitouMax, int seikai) {
		setId(id);
		setName(name);
		setKaitouMax(kaitouMax);
		setSeikai(seikai);
	}

	/**
	 * 指定されたIDのQuestionのインスタンスを返す
	 * 
	 * @return 指定されたIDに対応するQuestion
	 */
	public static final Question get(String id) {

		// エンティティ受け取り(ID指定）
		Entity e = get(Question.class, id);
		Question q = makeInstanceFromEntity(id, e);
		return q;
	}

	/**
	 * 全件を取得し、ArrayListに格納して返す
	 * 
	 * @return Questionの格納されたArrayList
	 */
	public static final List<Question> getList() {

		// エンティティ受け取り
		List<Entity> eList = getList(Question.class);

		// ArrayList作成
		List<Question> qList = new ArrayList<Question>(eList.size());

		// 全てのエンティティをqListに詰め直す
		for (Entity e : eList) {
			// エンティティをQuestionのインスタンスに
			Question q = makeInstanceFromEntity(e);
			// インスタンスをqListに格納
			qList.add(q);
		}
		// 詰め直したArrayListを返す
		return qList;
	}

	private static final Question makeInstanceFromEntity(String id, Entity e) {
		Question q = null;
	
		if (e != null) {
			// エンティティをインスタンスに変換
			String name = (String) e.getProperty("name");
			int kaitouMax = (int) (long) e.getProperty("kaitouMax");
			int seikai = (int) (long) e.getProperty("seikai");
			q = new Question(id, name, kaitouMax, seikai);
		}
		return q;
	}

	private static final Question makeInstanceFromEntity(Entity e) {
		String id = (String) e.getProperty("id");
		Question q = makeInstanceFromEntity(id, e);
		return q;
	}
}
