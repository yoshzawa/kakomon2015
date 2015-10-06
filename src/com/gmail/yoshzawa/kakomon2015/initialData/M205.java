package com.gmail.yoshzawa.kakomon2015.initialData;

import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;

public class M205 extends MondaiSet{
	public static void m() throws NoSuchFieldException {
		m20502();

		new MondaiPrint("FEG-20503", "メモリ管理").put();

		mondaiPut("FEG-20503", "01", "H24SFEAM21");
		mondaiPut("FEG-20503", "02", "H24SFEAM22");
		mondaiPut("FEG-20503", "03", "H24SFEAM23");
		mondaiPut("FEG-20503", "04", "H24FFEAM18");
		mondaiPut("FEG-20503", "05", "H24FFEAM19");
		mondaiPut("FEG-20503", "06", "H25SFEAM19");
		mondaiPut("FEG-20503", "07", "H25SFEAM20");
		mondaiPut("FEG-20503", "08", "H25FFEAM17");
		mondaiPut("FEG-20503", "09", "H26SFEAM16");
		mondaiPut("FEG-20503", "10", "H27SFEAM18");
		mondaiPut("FEG-20503", "11", "H27SFEAM20");

		new MondaiPrint("FEG-20504", "ファイル").put();
		mondaiPut("FEG-20504", "01", "H24SFEAM24");
		mondaiPut("FEG-20504", "02", "H25SFEAM21");
		mondaiPut("FEG-20504", "03", "H25FFEAM19");
		mondaiPut("FEG-20504", "04", "H26SFEAM17");
		mondaiPut("FEG-20504", "05", "H26FFEAM18");
		mondaiPut("FEG-20504", "06", "H26FFEAM19");
		mondaiPut("FEG-20504", "07", "H27SFEAM17");
		
		new MondaiPrint("FEG-20505", "ソフトウェア　その他").put();
		mondaiPut("FEG-20505", "01", "H24SFEAM19");
		mondaiPut("FEG-20505", "02", "H24FFEAM20");
		mondaiPut("FEG-20505", "03", "H24FFEAM21");
		mondaiPut("FEG-20505", "04", "H24SFEAM22");
		mondaiPut("FEG-20505", "05", "H24FFEAM20");
		mondaiPut("FEG-20505", "06", "H24FFEAM21");
		mondaiPut("FEG-20505", "07", "H24SFEAM18");
		mondaiPut("FEG-20505", "08", "H24SFEAM19");
		mondaiPut("FEG-20505", "09", "H24FFEAM20");



		
	}

	private static void m20502() throws NoSuchFieldException {
		String mondaiPrintId = "FEG-20502";
		new MondaiPrint(mondaiPrintId, "タスクスケジューリング").put();

		mondaiPut(mondaiPrintId, "01", "H24SFEAM20");
		mondaiPut(mondaiPrintId, "02", "H24FFEAM17");
		mondaiPut(mondaiPrintId, "03", "H25SFEAM18");
		mondaiPut(mondaiPrintId, "04", "H25FFEAM18");
		mondaiPut(mondaiPrintId, "05", "H26FFEAM17");
		mondaiPut(mondaiPrintId, "06", "H27SFEAM19");
		mondaiPut(mondaiPrintId, "07", "H27SFEAM21");

		mondaiPut(mondaiPrintId, "01", "H24SFEAM20");
		mondaiPut(mondaiPrintId, "02", "H24FFEAM17");
	}
	
}
