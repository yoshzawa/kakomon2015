package com.gmail.yoshzawa.kakomon2015.initialData;

import com.gmail.yoshzawa.kakomon2015.dataStore.Mondai;
import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;

public class M204 extends MondaiSet{
	public static void m() throws NoSuchFieldException {
		new MondaiPrint("FEG-20401", "システム構成要素").put();
		new MondaiPrint("FEG-20402", "稼働率").put();
		new MondaiPrint("FEG-20403", "信頼性とパフォーマンス").put();
		new MondaiPrint("FEG-20404", "システム構成要素 その他").put();
		new MondaiPrint("FEG-20405", "信頼性とパフォーマンス1").put();
		new MondaiPrint("FEG-20406", "信頼性とパフォーマンス2").put();

		
		new Mondai("FEG-20402-01", "FEG-20402 01", "FEG-20402", 1,"H24SFEAM17").put();
		new Mondai("FEG-20402-02", "FEG-20402 02", "FEG-20402", 2,"H24FFEAM15").put();
		new Mondai("FEG-20402-03", "FEG-20402 03", "FEG-20402", 3,"H24FFEAM16").put();
		new Mondai("FEG-20402-04", "FEG-20402 04", "FEG-20402", 4,"H25SFEAM15").put();
		new Mondai("FEG-20402-05", "FEG-20402 05", "FEG-20402", 5,"H25FFEAM14").put();
		new Mondai("FEG-20402-06", "FEG-20402 06", "FEG-20402", 6,"H26FFEAM14").put();
		new Mondai("FEG-20402-07", "FEG-20402 07", "FEG-20402", 7,"H27SFEAM13").put();
		new Mondai("FEG-20402-08", "FEG-20402 08", "FEG-20402", 8,"H27SFEAM15").put();
		new Mondai("FEG-20402-09", "FEG-20402 09", "FEG-20402", 9,"H27SFEAM16").put();
		
		new Mondai("FEG-20403-01", "FEG-20403 01", "FEG-20403", 1,"H24SFEAM16").put();
		new Mondai("FEG-20403-02", "FEG-20403 02", "FEG-20403", 2,"H24SFEAM18").put();
		new Mondai("FEG-20403-03", "FEG-20403 03", "FEG-20403", 3,"H24FFEAM14").put();
		new Mondai("FEG-20403-04", "FEG-20403 04", "FEG-20403", 4,"H25SFEAM14").put();
		new Mondai("FEG-20403-05", "FEG-20403 05", "FEG-20403", 5,"H25SFEAM16").put();
		new Mondai("FEG-20403-06", "FEG-20403 06", "FEG-20403", 6,"H25SFEAM17").put();
		new Mondai("FEG-20403-07", "FEG-20403 07", "FEG-20403", 7,"H25FFEAM13").put();
		new Mondai("FEG-20403-08", "FEG-20403 08", "FEG-20403", 8,"H25FFEAM16").put();
		new Mondai("FEG-20403-09", "FEG-20403 09", "FEG-20403", 9,"H26SFEAM14").put();
		new Mondai("FEG-20403-10", "FEG-20403 10", "FEG-20403", 10,"H26FFEAM13").put();
		new Mondai("FEG-20403-11", "FEG-20403 11", "FEG-20403", 11,"H27SFEAM11").put();
		new Mondai("FEG-20403-12", "FEG-20403 12", "FEG-20403", 12,"H27SFEAM12").put();
		new Mondai("FEG-20403-13", "FEG-20403 13", "FEG-20403", 13,"H27SFEAM14").put();
		
		new Mondai("FEG-20404-01", "FEG-20404 01", "FEG-20404", 1,"H24SFEAM15").put();
		new Mondai("FEG-20404-02", "FEG-20404 02", "FEG-20404", 2,"H24FFEAM13").put();
		new Mondai("FEG-20404-03", "FEG-20404 03", "FEG-20404", 3,"H25FFEAM15").put();
		new Mondai("FEG-20404-04", "FEG-20404 04", "FEG-20404", 4,"H26SFEAM13").put();
		new Mondai("FEG-20404-05", "FEG-20404 05", "FEG-20404", 5,"H26SFEAM15").put();
		new Mondai("FEG-20404-06", "FEG-20404 06", "FEG-20404", 6,"H26FFEAM15").put();
		new Mondai("FEG-20404-07", "FEG-20404 07", "FEG-20404", 7,"H26FFEAM16").put();

		mondaiPut("FEG-20405", "01", "H24SFEAM16");
		mondaiPut("FEG-20405", "02", "H24FFEAM14");
		mondaiPut("FEG-20405", "03", "H25SFEAM14");
		mondaiPut("FEG-20405", "04", "H25FFEAM13");
		mondaiPut("FEG-20405", "06", "H26FFEAM13");
		mondaiPut("FEG-20405", "07", "H27SFEAM11");

		mondaiPut("FEG-20406", "01", "H24SFEAM18");
		mondaiPut("FEG-20406", "02", "H25SFEAM16");
		mondaiPut("FEG-20406", "03", "H25SFEAM17");
		mondaiPut("FEG-20406", "04", "H25FFEAM16");
		mondaiPut("FEG-20406", "05", "H26SFEAM14");
		mondaiPut("FEG-20406", "06", "H27SFEAM12");
		mondaiPut("FEG-20406", "07", "H27SFEAM14");
	}
	
}
