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
		this(id, name, mondaiPrintKey, sortOrder, questionKey, null, 0, 0);
	}

	/**
	 * コンストラクタ
	 * 
	 * @param id
	 * @param name
	 * @param mondaiPrintKey
	 * @param sortOrder
	 * @param questionKey
	 * @param questionName
	 * @param kaitouMax
	 * @param seikai
	 */
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

	/**
	 * 指定されたIDのMondaiのインスタンスを返す
	 * 
	 * @return 指定されたIDに対応するMondai
	 */
	public static final Mondai get(String id) {
		Entity e = get(Mondai.class, id);
		Mondai m = makeInstanceFromEntity(id, e);
		return m;
	}

	/**
	 * 全件を取得し、ArrayListに格納して返す
	 * 
	 * @return Mondaiの格納されたArrayList
	 */
	public static final List<Mondai> getList() {

		// エンティティ受け取り
		List<Entity> eList = getList(Mondai.class);

		// ArrayList作成
		List<Mondai> mList = new ArrayList<Mondai>(eList.size());

		// 全てのエンティティをeListに詰め直す
		for (Entity e : eList) {

			// エンティティをMondaiのインスタンスに
			Mondai q = makeInstanceFromEntity(e);
			mList.add(q);
		}
		return mList;
	}

	public static final List<Mondai> getListByParentId(String mondaiPrintId) {

		// エンティティ受け取り
		List<Entity> eList = getListByParentId(Mondai.class, "mondaiPrintKey",
				mondaiPrintId, "sortOrder");

		// ArrayList作成
		List<Mondai> mList = new ArrayList<Mondai>(eList.size());

		// 全てのエンティティをeListに詰め直す
		for (Entity e : eList) {

			Mondai q = makeInstanceFromEntity(e);
			mList.add(q);
		}
		return mList;
	}

	/**
	 * 指定されたEntityを基に、Questionのデータを取得して、Mondaiのインスタンスを作成する
	 * 
	 * @return 指定されたIDに対応するMondai
	 */
	private static final Mondai makeInstanceFromEntity(String id, Entity e) {
		Mondai m = null;
		if (e != null) {
			String name = (String) e.getProperty("name");
			String mondaiPrintKey = (String) e.getProperty("mondaiPrintKey");
			int sortOrder = (int) (long) e.getProperty("sortOrder");
			String questionKey = (String) e.getProperty("questionKey");

			Question q = Question.get(questionKey);
			String questionName = q.getName();
			int kaitouMax = q.getKaitouMax();
			int seikai = q.getSeikai();

			m = new Mondai(id, name, mondaiPrintKey, sortOrder, questionKey,
					questionName, kaitouMax, seikai);
		}
		return m;
	}

	private static final Mondai makeInstanceFromEntity(Entity e) {
		String id = (String) e.getProperty("id");
		Mondai q = makeInstanceFromEntity(id, e);
		return q;
	}
}
