package com.gmail.yoshzawa.kakomon2015;

import java.io.IOException;

import javax.servlet.http.*;

import com.gmail.yoshzawa.kakomon2015.dataStore.Mondai;
import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;
import com.gmail.yoshzawa.kakomon2015.dataStore.Question;
import com.gmail.yoshzawa.kakomon2015.initialData.*;

@SuppressWarnings("serial")
public class Kakomon2015Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html;charset=UTF-8");

		try {
			new MondaiPrint("FE-H24H-AM", "H24春午前").put();
			new MondaiPrint("FE-H24A-AM", "H24秋午前").put();
			new MondaiPrint("FE-H25H-AM", "H25春午前").put();
			new MondaiPrint("FE-H25A-AM", "H25秋午前").put();
			new MondaiPrint("FE-H26H-AM", "H26春午前").put();
			new MondaiPrint("FE-H26A-AM", "H26秋午前").put();
			new MondaiPrint("FE-H27H-AM", "H27春午前").put();
			
			new MondaiPrint("FEG-10101", "基礎理論").put();
			new MondaiPrint("FEG-10102", "数値表現").put();
			new MondaiPrint("FEG-10103", "ビット演算").put();
			new MondaiPrint("FEG-10104", "基礎理論　その他").put();
			new MondaiPrint("FEG-10201", "アルゴリズムとプログラミング").put();
			new MondaiPrint("FEG-10202", "データ構造").put();
			new MondaiPrint("FEG-10203", "フローチャート").put();
			new MondaiPrint("FEG-10204", "アルゴリズムとプログラミング その他").put();

			m10101();
			m10201();
			
			m10102();
			m10103();
			m10104();
			
			m10202();
			m10203();
			m10204();

			H24S.m();
			H24F.m();
			H25S.m();
			H25F.m();
			H26S.m();
			H26F.m();
			H27S.m();
			
			H24S.q();
			H24F.q();
			H25S.q();
			H25F.q();
			H26S.q();
			H26F.q();
			H27S.q();

		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		}

		MondaiPrint e = MondaiPrint.get("FEG-10101");
		resp.getWriter().println("<h1>");
		if (e != null)
			resp.getWriter().println(e.getName() + "は登録されています");
		else
			resp.getWriter().println("登録されていません");
		resp.getWriter().println("</h1>");
	}

	private void m10204() throws NoSuchFieldException {
		new Mondai("FEG-10204-01", "FEG-10204 01", "FEG-10204", 1,"H24SFEAM05").put();
		new Mondai("FEG-10204-02", "FEG-10204 02", "FEG-10204", 2,"H24SFEAM08").put();
		new Mondai("FEG-10204-03", "FEG-10204 03", "FEG-10204", 3,"H24FFEAM07").put();
		new Mondai("FEG-10204-04", "FEG-10204 04", "FEG-10204", 4,"H25SFEAM07").put();
		new Mondai("FEG-10204-05", "FEG-10204 05", "FEG-10204", 5,"H25FFEAM07").put();
		new Mondai("FEG-10204-06", "FEG-10204 06", "FEG-10204", 6,"H26SFEAM05").put();
		new Mondai("FEG-10204-07", "FEG-10204 07", "FEG-10204", 7,"H26FFEAM04").put();
		new Mondai("FEG-10204-08", "FEG-10204 08", "FEG-10204", 8,"H26FFEAM06").put();
		new Mondai("FEG-10204-09", "FEG-10204 09", "FEG-10204", 9,"H26FFEAM07").put();
		new Mondai("FEG-10204-10", "FEG-10204 10", "FEG-10204", 10,"H27SFEAM06").put();
	}

	private void m10203() throws NoSuchFieldException {
		new Mondai("FEG-10203-01", "FEG-10203 01", "FEG-10203", 1,"H24FFEAM06").put();
		new Mondai("FEG-10203-02", "FEG-10203 02", "FEG-10203", 2,"H25SFEAM08").put();
		new Mondai("FEG-10203-03", "FEG-10203 03", "FEG-10203", 3,"H25FFEAM08").put();
		new Mondai("FEG-10203-04", "FEG-10203 04", "FEG-10203", 4,"H26SFEAM08").put();
	}

	private void m10202() throws NoSuchFieldException {
		new Mondai("FEG-10202-01", "FEG-10202 01", "FEG-10202", 1,"H24SFEAM04").put();
		new Mondai("FEG-10202-02", "FEG-10202 02", "FEG-10202", 2,"H24SFEAM06").put();
		new Mondai("FEG-10202-03", "FEG-10202 03", "FEG-10202", 3,"H24SFEAM07").put();
		new Mondai("FEG-10202-04", "FEG-10202 04", "FEG-10202", 4,"H24FFEAM05").put();
		new Mondai("FEG-10202-05", "FEG-10202 05", "FEG-10202", 5,"H25SFEAM05").put();
		new Mondai("FEG-10202-06", "FEG-10202 06", "FEG-10202", 6,"H25SFEAM06").put();
		new Mondai("FEG-10202-07", "FEG-10202 07", "FEG-10202", 7,"H25FFEAM05").put();
		new Mondai("FEG-10202-08", "FEG-10202 08", "FEG-10202", 8,"H25FFEAM06").put();
		new Mondai("FEG-10202-09", "FEG-10202 09", "FEG-10202", 9,"H26SFEAM06").put();
		new Mondai("FEG-10202-10", "FEG-10202 10", "FEG-10202", 10,"H26SFEAM07").put();
		new Mondai("FEG-10202-11", "FEG-10202 11", "FEG-10202", 11,"H26FFEAM05").put();
		new Mondai("FEG-10202-12", "FEG-10202 12", "FEG-10202", 12,"H27SFEAM05").put();
	}

	private void m10104() throws NoSuchFieldException {
		new Mondai("FEG-10104-01", "FEG-10104 01", "FEG-10104", 1,"H24SFEAM03").put();
		new Mondai("FEG-10104-02", "FEG-10104 02", "FEG-10104", 2,"H24FFEAM02").put();
		new Mondai("FEG-10104-03", "FEG-10104 03", "FEG-10104", 3,"H24FFEAM03").put();
		new Mondai("FEG-10104-04", "FEG-10104 04", "FEG-10104", 4,"H25SFEAM03").put();
		new Mondai("FEG-10104-05", "FEG-10104 05", "FEG-10104", 5,"H25SFEAM04").put();
		new Mondai("FEG-10104-06", "FEG-10104 06", "FEG-10104", 6,"H25FFEAM04").put();
		new Mondai("FEG-10104-07", "FEG-10104 07", "FEG-10104", 7,"H26SFEAM04").put();
		new Mondai("FEG-10104-08", "FEG-10104 08", "FEG-10104", 8,"H27SFEAM03").put();
		new Mondai("FEG-10104-09", "FEG-10104 09", "FEG-10104", 9,"H27SFEAM04").put();
	}

	private void m10103() throws NoSuchFieldException {
		new Mondai("FEG-10103-01", "FEG-10103 01", "FEG-10103", 1,"H24SFEAM02").put();
		new Mondai("FEG-10103-02", "FEG-10103 02", "FEG-10103", 2,"H24FFEAM01").put();
		new Mondai("FEG-10103-03", "FEG-10103 03", "FEG-10103", 3,"H25SFEAM02").put();
		new Mondai("FEG-10103-04", "FEG-10103 04", "FEG-10103", 4,"H25SFEAM03").put();
		new Mondai("FEG-10103-05", "FEG-10103 05", "FEG-10103", 5,"H26SFEAM03").put();
		new Mondai("FEG-10103-06", "FEG-10103 06", "FEG-10103", 6,"H27SFEAM01").put();
	}

	private void m10201() throws NoSuchFieldException {
		new Mondai("FEG-10201-01", "FEG-10201 01", "FEG-10201", 1,"H24SFEAM04").put();
		new Mondai("FEG-10201-02", "FEG-10201 02", "FEG-10201", 2,"H24SFEAM05").put();
		new Mondai("FEG-10201-03", "FEG-10201 03", "FEG-10201", 3,"H24SFEAM06").put();
		new Mondai("FEG-10201-04", "FEG-10201 04", "FEG-10201", 4,"H24SFEAM07").put();
		new Mondai("FEG-10201-05", "FEG-10201 05", "FEG-10201", 5,"H24SFEAM08").put();
		new Mondai("FEG-10201-06", "FEG-10201 06", "FEG-10201", 6,"H24FFEAM05").put();
		new Mondai("FEG-10201-07", "FEG-10201 07", "FEG-10201", 7,"H24FFEAM06").put();
		new Mondai("FEG-10201-08", "FEG-10201 08", "FEG-10201", 8,"H24FFEAM07").put();
		new Mondai("FEG-10201-09", "FEG-10201 09", "FEG-10201", 9,"H25SFEAM05").put();
		new Mondai("FEG-10201-10", "FEG-10201 10", "FEG-10201", 10,"H25SFEAM06").put();
		new Mondai("FEG-10201-11", "FEG-10201 11", "FEG-10201", 11,"H25SFEAM07").put();
		new Mondai("FEG-10201-12", "FEG-10201 12", "FEG-10201", 12,"H25SFEAM08").put();
		new Mondai("FEG-10201-13", "FEG-10201 13", "FEG-10201", 13,"H25FFEAM05").put();
		new Mondai("FEG-10201-14", "FEG-10201 14", "FEG-10201", 14,"H25FFEAM06").put();
		new Mondai("FEG-10201-15", "FEG-10201 15", "FEG-10201", 15,"H25FFEAM07").put();
		new Mondai("FEG-10201-16", "FEG-10201 16", "FEG-10201", 16,"H25FFEAM08").put();
		new Mondai("FEG-10201-17", "FEG-10201 17", "FEG-10201", 17,"H26SFEAM05").put();
		new Mondai("FEG-10201-18", "FEG-10201 18", "FEG-10201", 18,"H26SFEAM06").put();
		new Mondai("FEG-10201-19", "FEG-10201 19", "FEG-10201", 19,"H26SFEAM07").put();
		new Mondai("FEG-10201-20", "FEG-10201 20", "FEG-10201", 20,"H26SFEAM08").put();
		new Mondai("FEG-10201-21", "FEG-10201 21", "FEG-10201", 21,"H26FFEAM04").put();
		new Mondai("FEG-10201-22", "FEG-10201 22", "FEG-10201", 22,"H26FFEAM05").put();
		new Mondai("FEG-10201-23", "FEG-10201 23", "FEG-10201", 23,"H26FFEAM06").put();
		new Mondai("FEG-10201-24", "FEG-10201 24", "FEG-10201", 24,"H26FFEAM07").put();
		new Mondai("FEG-10201-25", "FEG-10201 25", "FEG-10201", 25,"H27SFEAM05").put();
		new Mondai("FEG-10201-26", "FEG-10201 26", "FEG-10201", 26,"H27SFEAM06").put();
	}

	private void m10102() throws NoSuchFieldException {
		new Mondai("FEG-10102-01", "FEG-10102 01", "FEG-10102", 1,"H24SFEAM01").put();
		new Mondai("FEG-10102-02", "FEG-10102 02", "FEG-10102", 2,"H24FFEAM01").put();
		new Mondai("FEG-10102-03", "FEG-10102 03", "FEG-10102", 3,"H24FFEAM02").put();
		new Mondai("FEG-10102-04", "FEG-10102 04", "FEG-10102", 4,"H25SFEAM02").put();
		new Mondai("FEG-10102-05", "FEG-10102 05", "FEG-10102", 5,"H25FFEAM02").put();
		new Mondai("FEG-10102-06", "FEG-10102 06", "FEG-10102", 6,"H26SFEAM01").put();
		new Mondai("FEG-10102-07", "FEG-10102 07", "FEG-10102", 7,"H26SFEAM02").put();
		new Mondai("FEG-10102-08", "FEG-10102 08", "FEG-10102", 8,"H26FFEAM01").put();
		new Mondai("FEG-10102-09", "FEG-10102 09", "FEG-10102", 9,"H26FFEAM02").put();
		new Mondai("FEG-10102-10", "FEG-10102 10", "FEG-10102", 10,"H26FFEAM03").put();
		new Mondai("FEG-10102-11", "FEG-10102 11", "FEG-10102", 11,"H27SFEAM02").put();
	}

	private void m10101() throws NoSuchFieldException {
		new Mondai("FEG-10101-01", "FEG-10101 01", "FEG-10101", 1,"H24SFEAM01").put();
		new Mondai("FEG-10101-02", "FEG-10101 02", "FEG-10101", 2,"H24SFEAM02").put();
		new Mondai("FEG-10101-03", "FEG-10101 03", "FEG-10101", 3,"H24SFEAM03").put();
		new Mondai("FEG-10101-04", "FEG-10101 04", "FEG-10101", 4,"H24FFEAM01").put();
		new Mondai("FEG-10101-05", "FEG-10101 05", "FEG-10101", 5,"H24FFEAM02").put();
		new Mondai("FEG-10101-06", "FEG-10101 06", "FEG-10101", 6,"H24FFEAM03").put();
		new Mondai("FEG-10101-07", "FEG-10101 07", "FEG-10101", 7,"H24FFEAM04").put();
		new Mondai("FEG-10101-08", "FEG-10101 08", "FEG-10101", 8,"H25SFEAM01").put();
		new Mondai("FEG-10101-09", "FEG-10101 09", "FEG-10101", 9,"H25SFEAM02").put();
		new Mondai("FEG-10101-10", "FEG-10101 10", "FEG-10101", 10,"H25SFEAM03").put();
		new Mondai("FEG-10101-11", "FEG-10101 11", "FEG-10101", 11,"H25SFEAM04").put();
		new Mondai("FEG-10101-12", "FEG-10101 12", "FEG-10101", 12,"H25FFEAM01").put();
		new Mondai("FEG-10101-13", "FEG-10101 13", "FEG-10101", 13,"H25FFEAM02").put();
		new Mondai("FEG-10101-14", "FEG-10101 14", "FEG-10101", 14,"H25FFEAM03").put();
		new Mondai("FEG-10101-15", "FEG-10101 15", "FEG-10101", 15,"H25FFEAM04").put();
		new Mondai("FEG-10101-16", "FEG-10101 16", "FEG-10101", 16,"H26SFEAM01").put();
		new Mondai("FEG-10101-17", "FEG-10101 17", "FEG-10101", 17,"H26SFEAM02").put();
		new Mondai("FEG-10101-18", "FEG-10101 18", "FEG-10101", 18,"H26SFEAM03").put();
		new Mondai("FEG-10101-19", "FEG-10101 19", "FEG-10101", 19,"H26SFEAM04").put();
		new Mondai("FEG-10101-20", "FEG-10101 20", "FEG-10101", 20,"H26FFEAM01").put();
		new Mondai("FEG-10101-21", "FEG-10101 21", "FEG-10101", 21,"H26FFEAM02").put();
		new Mondai("FEG-10101-22", "FEG-10101 22", "FEG-10101", 22,"H26FFEAM03").put();
		new Mondai("FEG-10101-23", "FEG-10101 23", "FEG-10101", 23,"H27SFEAM01").put();
		new Mondai("FEG-10101-24", "FEG-10101 24", "FEG-10101", 24,"H27SFEAM02").put();
		new Mondai("FEG-10101-25", "FEG-10101 25", "FEG-10101", 25,"H27SFEAM03").put();
		new Mondai("FEG-10101-26", "FEG-10101 26", "FEG-10101", 26,"H27SFEAM04").put();
	}
}
