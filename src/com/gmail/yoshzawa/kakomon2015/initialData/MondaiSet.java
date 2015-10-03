package com.gmail.yoshzawa.kakomon2015.initialData;

import com.gmail.yoshzawa.kakomon2015.dataStore.Mondai;

public class MondaiSet {

	protected static void mondaiPut(String mondaiPrintName, String mondaiOrder, String mondaiName)
			throws NoSuchFieldException {
				new Mondai(mondaiPrintName + "-" + mondaiOrder, mondaiPrintName + " "
						+ mondaiOrder, mondaiPrintName, Integer.parseInt(mondaiOrder), mondaiName).put();
			}

	public MondaiSet() {
		super();
	}

}