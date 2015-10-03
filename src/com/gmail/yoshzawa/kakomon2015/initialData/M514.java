package com.gmail.yoshzawa.kakomon2015.initialData;

import com.gmail.yoshzawa.kakomon2015.dataStore.Mondai;
import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;

public class M514 extends MondaiSet {
	public static void m() throws NoSuchFieldException {
		new MondaiPrint("FEG-51402", "PERT").put();
		new MondaiPrint("FEG-51403", "作業見積").put();
		new MondaiPrint("FEG-51404", "WBS").put();
		new MondaiPrint("FEG-51405", "プロジェクトマネジメント　その他").put();

		new Mondai("FEG-51402-01", "FEG-51402 01", "FEG-51402", 1,"H24SFEAM52").put();
		new Mondai("FEG-51402-02", "FEG-51402 02", "FEG-51402", 2,"H24FFEAM52").put();
		new Mondai("FEG-51402-03", "FEG-51402 03", "FEG-51402", 3,"H25SFEAM52").put();
		new Mondai("FEG-51402-04", "FEG-51402 04", "FEG-51402", 4,"H25FFEAM53").put();
		new Mondai("FEG-51402-05", "FEG-51402 05", "FEG-51402", 5,"H26SFEAM53").put();
		new Mondai("FEG-51402-06", "FEG-51402 06", "FEG-51402", 6,"H26FFEAM52").put();
		new Mondai("FEG-51402-07", "FEG-51402 07", "FEG-51402", 7,"H27SFEAM54").put();

		new Mondai("FEG-51403-01", "FEG-51403 01", "FEG-51403", 1,"H24SFEAM53").put();
		new Mondai("FEG-51403-02", "FEG-51403 02", "FEG-51403", 2,"H24FFEAM53").put();
		new Mondai("FEG-51403-03", "FEG-51403 03", "FEG-51403", 3,"H25SFEAM53").put();
		new Mondai("FEG-51403-04", "FEG-51403 04", "FEG-51403", 4,"H25FFEAM54").put();
		new Mondai("FEG-51403-05", "FEG-51403 05", "FEG-51403", 5,"H25FFEAM55").put();
		new Mondai("FEG-51403-06", "FEG-51403 06", "FEG-51403", 6,"H26SFEAM54").put();
		new Mondai("FEG-51403-07", "FEG-51403 07", "FEG-51403", 7,"H26FFEAM53").put();
		new Mondai("FEG-51403-08", "FEG-51403 08", "FEG-51403", 8,"H26FFEAM54").put();
		
		new Mondai("FEG-51404-01", "FEG-51404 01", "FEG-51404", 1,"H24FFEAM51").put();
		new Mondai("FEG-51404-02", "FEG-51404 02", "FEG-51404", 2,"H25SFEAM51").put();
		new Mondai("FEG-51404-03", "FEG-51404 03", "FEG-51404", 3,"H25FFEAM52").put();
		new Mondai("FEG-51404-04", "FEG-51404 04", "FEG-51404", 4,"H26SFEAM52").put();
		new Mondai("FEG-51404-05", "FEG-51404 05", "FEG-51404", 5,"H26FFEAM51").put();
		new Mondai("FEG-51404-06", "FEG-51404 06", "FEG-51404", 6,"H27SFEAM53").put();
		
		new Mondai("FEG-51405-01", "FEG-51405 01", "FEG-51405", 1,"H24SFEAM51").put();
		new Mondai("FEG-51405-02", "FEG-51405 02", "FEG-51405", 2,"H24SFEAM54").put();
		new Mondai("FEG-51405-03", "FEG-51405 03", "FEG-51405", 3,"H25SFEAM52").put();
		new Mondai("FEG-51405-04", "FEG-51405 04", "FEG-51405", 4,"H25SFEAM54").put();
		new Mondai("FEG-51405-05", "FEG-51405 05", "FEG-51405", 5,"H25FFEAM51").put();
		new Mondai("FEG-51405-06", "FEG-51405 06", "FEG-51405", 6,"H26SFEAM51").put();
		new Mondai("FEG-51405-07", "FEG-51405 07", "FEG-51405", 7,"H26SFEAM55").put();
		new Mondai("FEG-51405-08", "FEG-51405 08", "FEG-51405", 8,"H26FFEAM55").put();
		new Mondai("FEG-51405-09", "FEG-51405 09", "FEG-51405", 9,"H27SFEAM52").put();
		
		String mondaiPrintName = "FEG-51405";


		mondaiPut(mondaiPrintName, "09", "H27SFEAM52");
		mondaiPut(mondaiPrintName, "10", "H27SFEAM55");
		
	}
	
}
