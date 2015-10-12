package com.gmail.yoshzawa.kakomon2015.initialData;

import com.gmail.yoshzawa.kakomon2015.dataStore.Mondai;
import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;

public class M923 extends MondaiSet {
	public static void m() throws NoSuchFieldException {

		m92302();
		m92303();
	}

	private static void m92302() throws NoSuchFieldException {
		String mondaiPrintName = "FEG-92302";
		new MondaiPrint(mondaiPrintName, "著作権、派遣").put();
		mondaiPut(mondaiPrintName, "01", "H24SFEAM78");
		mondaiPut(mondaiPrintName, "02", "H24FFEAM79");
		mondaiPut(mondaiPrintName, "03", "H24FFEAM80");
		mondaiPut(mondaiPrintName, "04", "H25SFEAM79");
		mondaiPut(mondaiPrintName, "05", "H25FFEAM78");
		mondaiPut(mondaiPrintName, "06", "H25FFEAM79");
		mondaiPut(mondaiPrintName, "07", "H26SFEAM80");
		mondaiPut(mondaiPrintName, "08", "H26FFEAM79");
		mondaiPut(mondaiPrintName, "09", "H26FFEAM80");
	}

	private static void m92303() throws NoSuchFieldException {
		String mondaiPrintName = "FEG-92303";
		new MondaiPrint(mondaiPrintName, "法務　その他").put();
		mondaiPut(mondaiPrintName, "01", "H24SFEAM79");
		mondaiPut(mondaiPrintName, "02", "H24SFEAM80");
		mondaiPut(mondaiPrintName, "03", "H25SFEAM78");
		mondaiPut(mondaiPrintName, "04", "H25SFEAM80");
		mondaiPut(mondaiPrintName, "05", "H25FFEAM80");
		mondaiPut(mondaiPrintName, "06", "H26SFEAM79");
		mondaiPut(mondaiPrintName, "07", "H27SFEAM79");
		mondaiPut(mondaiPrintName, "08", "H27SFEAM80");
	}

}
