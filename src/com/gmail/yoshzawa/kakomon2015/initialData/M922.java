package com.gmail.yoshzawa.kakomon2015.initialData;

import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;

public class M922 extends MondaiSet {
	public static void m() throws NoSuchFieldException {

		m92202();
		m92203();
		m92204();
		m92205();
	}

	private static void m92202() throws NoSuchFieldException {
		String mondaiPrintName = "FEG-92202";
		new MondaiPrint(mondaiPrintName, "会計").put();

		mondaiPut(mondaiPrintName, "01", "H24SFEAM76");
		mondaiPut(mondaiPrintName, "02", "H24SFEAM77");
		mondaiPut(mondaiPrintName, "03", "H25SFEAM77");
		mondaiPut(mondaiPrintName, "04", "H25FFEAM77");
		mondaiPut(mondaiPrintName, "05", "H26SFEAM78");
		mondaiPut(mondaiPrintName, "06", "H26FFEAM78");
	}

	private static void m92203() throws NoSuchFieldException {
		String mondaiPrintName = "FEG-92203";
		new MondaiPrint(mondaiPrintName, "計画").put();

		mondaiPut(mondaiPrintName, "01", "H24SFEAM75");
		mondaiPut(mondaiPrintName, "02", "H24FFEAM76");
		mondaiPut(mondaiPrintName, "03", "H25SFEAM76");
		mondaiPut(mondaiPrintName, "04", "H25FFEAM75");
		mondaiPut(mondaiPrintName, "05", "H26SFEAM76");
		mondaiPut(mondaiPrintName, "06", "H26FFEAM74");
		mondaiPut(mondaiPrintName, "07", "H27SFEAM78");
	}
	private static void m92204() throws NoSuchFieldException {
		String mondaiPrintName = "FEG-92204";
		new MondaiPrint(mondaiPrintName, "分析").put();

		mondaiPut(mondaiPrintName, "01", "H24SFEAM74");
		mondaiPut(mondaiPrintName, "02", "H24FFEAM77");
		mondaiPut(mondaiPrintName, "02", "H24FFEAM78");
		mondaiPut(mondaiPrintName, "02", "H25FFEAM76");
		mondaiPut(mondaiPrintName, "01", "H26SFEAM77");
		mondaiPut(mondaiPrintName, "02", "H26FFEAM76");
		mondaiPut(mondaiPrintName, "02", "H26FFEAM7");
		mondaiPut(mondaiPrintName, "01", "H27SFEAM77");
	}
	private static void m92205() throws NoSuchFieldException {
		String mondaiPrintName = "FEG-92205";
		new MondaiPrint(mondaiPrintName, "企業活動　その他").put();

		mondaiPut(mondaiPrintName, "01", "H24FFEAM75");
		mondaiPut(mondaiPrintName, "02", "H25SFEAM74");
		mondaiPut(mondaiPrintName, "03", "H25SFEAM75");
		mondaiPut(mondaiPrintName, "04", "H25FFEAM74");
		mondaiPut(mondaiPrintName, "05", "H26SFEAM75");
		mondaiPut(mondaiPrintName, "06", "H26FFEAM75");
		mondaiPut(mondaiPrintName, "07", "H27SFEAM75");
		mondaiPut(mondaiPrintName, "08", "H27SFEAM76");

	}

}
