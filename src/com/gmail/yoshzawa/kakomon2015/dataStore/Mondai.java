package com.gmail.yoshzawa.kakomon2015.dataStore;

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




}
