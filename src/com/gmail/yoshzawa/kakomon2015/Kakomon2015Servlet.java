package com.gmail.yoshzawa.kakomon2015;

import java.io.IOException;

import javax.servlet.http.*;

import com.gmail.yoshzawa.kakomon2015.dataStore.Mondai;
import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;
import com.gmail.yoshzawa.kakomon2015.dataStore.Question;

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

			m24h();
			m24a();
			m25h();
			m25a();
			m26h();
			m26a();
			m27h();
			
			q24s();
			q24f();
			q25s();
			q25f();
			q26s();
			q26f();
			q27s();

		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		MondaiPrint e = MondaiPrint.get("FEG-10101");
		resp.getWriter().println("<h1>");
		if (e != null)
			resp.getWriter().println(e.getName() + "は登録されています");
		else
			resp.getWriter().println("登録されていません");
		resp.getWriter().println("</h1>");

		Question q01 = Question.get("2014SFEAM01");
		resp.getWriter().println("<h1>");
		if (e != null) {
			int seikai = q01.getSeikai();
			resp.getWriter().println(
					q01.getName() + "は" + "アイウエ".substring(seikai - 1, seikai)
							+ "登録されています");
		} else
			resp.getWriter().println("登録されていません");
		resp.getWriter().println("</h1>");

		Question q02 = Question.get("2014SFEAM02");
		resp.getWriter().println("<h1>");
		if (e != null) {
			int seikai = q02.getSeikai();
			resp.getWriter().println(
					q02.getName() + "は" + "アイウエ".substring(seikai - 1, seikai)
							+ "登録されています");
		} else
			resp.getWriter().println("登録されていません");
		resp.getWriter().println("</h1>");

	}

	private void m26a() throws NoSuchFieldException {
		new Mondai("FE-H26A-AM-01", "FE-H26A-AM-01", "FE-H26A-AM", 1,"H26FFEAM01").put();
		new Mondai("FE-H26A-AM-02", "FE-H26A-AM-02", "FE-H26A-AM", 2,"H26FFEAM02").put();
		new Mondai("FE-H26A-AM-03", "FE-H26A-AM-03", "FE-H26A-AM", 3,"H26FFEAM03").put();
		new Mondai("FE-H26A-AM-04", "FE-H26A-AM-04", "FE-H26A-AM", 4,"H26FFEAM04").put();
		new Mondai("FE-H26A-AM-05", "FE-H26A-AM-05", "FE-H26A-AM", 5,"H26FFEAM05").put();
		new Mondai("FE-H26A-AM-06", "FE-H26A-AM-06", "FE-H26A-AM", 6,"H26FFEAM06").put();
		new Mondai("FE-H26A-AM-07", "FE-H26A-AM-07", "FE-H26A-AM", 7,"H26FFEAM07").put();
		new Mondai("FE-H26A-AM-08", "FE-H26A-AM-08", "FE-H26A-AM", 8,"H26FFEAM08").put();
		new Mondai("FE-H26A-AM-09", "FE-H26A-AM-09", "FE-H26A-AM", 9,"H26FFEAM09").put();
		new Mondai("FE-H26A-AM-10", "FE-H26A-AM-10", "FE-H26A-AM", 10,"H26FFEAM10").put();
	}

	private void m25a() throws NoSuchFieldException {
		new Mondai("FE-H25A-AM-01", "FE-H25A-AM-01", "FE-H25A-AM", 1,"H25FFEAM01").put();
		new Mondai("FE-H25A-AM-02", "FE-H25A-AM-02", "FE-H25A-AM", 2,"H25FFEAM02").put();
		new Mondai("FE-H25A-AM-03", "FE-H25A-AM-03", "FE-H25A-AM", 3,"H25FFEAM03").put();
		new Mondai("FE-H25A-AM-04", "FE-H25A-AM-04", "FE-H25A-AM", 4,"H25FFEAM04").put();
		new Mondai("FE-H25A-AM-05", "FE-H25A-AM-05", "FE-H25A-AM", 5,"H25FFEAM05").put();
		new Mondai("FE-H25A-AM-06", "FE-H25A-AM-06", "FE-H25A-AM", 6,"H25FFEAM06").put();
		new Mondai("FE-H25A-AM-07", "FE-H25A-AM-07", "FE-H25A-AM", 7,"H25FFEAM07").put();
		new Mondai("FE-H25A-AM-08", "FE-H25A-AM-08", "FE-H25A-AM", 8,"H25FFEAM08").put();
		new Mondai("FE-H25A-AM-09", "FE-H25A-AM-09", "FE-H25A-AM", 9,"H25FFEAM09").put();
		new Mondai("FE-H25A-AM-10", "FE-H25A-AM-10", "FE-H25A-AM", 10,"H25FFEAM10").put();
	}

	private void m24a() throws NoSuchFieldException {
		new Mondai("FE-H24A-AM-01", "FE-H24A-AM-01", "FE-H24A-AM", 1,"H24FFEAM01").put();
		new Mondai("FE-H24A-AM-02", "FE-H24A-AM-02", "FE-H24A-AM", 2,"H24FFEAM02").put();
		new Mondai("FE-H24A-AM-03", "FE-H24A-AM-03", "FE-H24A-AM", 3,"H24FFEAM03").put();
		new Mondai("FE-H24A-AM-04", "FE-H24A-AM-04", "FE-H24A-AM", 4,"H24FFEAM04").put();
		new Mondai("FE-H24A-AM-05", "FE-H24A-AM-05", "FE-H24A-AM", 5,"H24FFEAM05").put();
		new Mondai("FE-H24A-AM-06", "FE-H24A-AM-06", "FE-H24A-AM", 6,"H24FFEAM06").put();
		new Mondai("FE-H24A-AM-07", "FE-H24A-AM-07", "FE-H24A-AM", 7,"H24FFEAM07").put();
		new Mondai("FE-H24A-AM-08", "FE-H24A-AM-08", "FE-H24A-AM", 8,"H24FFEAM08").put();
		new Mondai("FE-H24A-AM-09", "FE-H24A-AM-09", "FE-H24A-AM", 9,"H24FFEAM09").put();
		new Mondai("FE-H24A-AM-10", "FE-H24A-AM-10", "FE-H24A-AM", 10,"H24FFEAM10").put();
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

	private void m24h() throws NoSuchFieldException {
		new Mondai("FE-H24H-AM-01", "FE-H24H-AM-01", "FE-H24H-AM", 1,"H24SFEAM01").put();
		new Mondai("FE-H24H-AM-02", "FE-H24H-AM-02", "FE-H24H-AM", 2,"H24SFEAM02").put();
		new Mondai("FE-H24H-AM-03", "FE-H24H-AM-03", "FE-H24H-AM", 3,"H24SFEAM03").put();
		new Mondai("FE-H24H-AM-04", "FE-H24H-AM-04", "FE-H24H-AM", 4,"H24SFEAM04").put();
		new Mondai("FE-H24H-AM-05", "FE-H24H-AM-05", "FE-H24H-AM", 5,"H24SFEAM05").put();
		new Mondai("FE-H24H-AM-06", "FE-H24H-AM-06", "FE-H24H-AM", 6,"H24SFEAM06").put();
		new Mondai("FE-H24H-AM-07", "FE-H24H-AM-07", "FE-H24H-AM", 7,"H24SFEAM07").put();
		new Mondai("FE-H24H-AM-08", "FE-H24H-AM-08", "FE-H24H-AM", 8,"H24SFEAM08").put();
		new Mondai("FE-H24H-AM-09", "FE-H24H-AM-09", "FE-H24H-AM", 9,"H24SFEAM09").put();
		new Mondai("FE-H24H-AM-10", "FE-H24H-AM-10", "FE-H24H-AM", 10,"H24SFEAM10").put();
		
		new Mondai("FE-H24H-AM-11", "FE-H24H-AM-11", "FE-H24H-AM", 11,"H24SFEAM11").put();
		new Mondai("FE-H24H-AM-12", "FE-H24H-AM-12", "FE-H24H-AM", 12,"H24SFEAM12").put();
		new Mondai("FE-H24H-AM-13", "FE-H24H-AM-13", "FE-H24H-AM", 13,"H24SFEAM13").put();
		new Mondai("FE-H24H-AM-14", "FE-H24H-AM-14", "FE-H24H-AM", 14,"H24SFEAM14").put();
		new Mondai("FE-H24H-AM-15", "FE-H24H-AM-15", "FE-H24H-AM", 15,"H24SFEAM15").put();
		new Mondai("FE-H24H-AM-16", "FE-H24H-AM-16", "FE-H24H-AM", 16,"H24SFEAM16").put();
		new Mondai("FE-H24H-AM-17", "FE-H24H-AM-17", "FE-H24H-AM", 17,"H24SFEAM17").put();
		new Mondai("FE-H24H-AM-18", "FE-H24H-AM-18", "FE-H24H-AM", 18,"H24SFEAM18").put();
		new Mondai("FE-H24H-AM-19", "FE-H24H-AM-19", "FE-H24H-AM", 19,"H24SFEAM19").put();
		new Mondai("FE-H24H-AM-20", "FE-H24H-AM-20", "FE-H24H-AM", 20,"H24SFEAM20").put();

		new Mondai("FE-H24H-AM-21", "FE-H24H-AM-21", "FE-H24H-AM", 21,"H24SFEAM21").put();
		new Mondai("FE-H24H-AM-22", "FE-H24H-AM-22", "FE-H24H-AM", 22,"H24SFEAM22").put();
		new Mondai("FE-H24H-AM-23", "FE-H24H-AM-23", "FE-H24H-AM", 23,"H24SFEAM23").put();
		new Mondai("FE-H24H-AM-24", "FE-H24H-AM-24", "FE-H24H-AM", 24,"H24SFEAM24").put();
		new Mondai("FE-H24H-AM-25", "FE-H24H-AM-25", "FE-H24H-AM", 25,"H24SFEAM25").put();
		new Mondai("FE-H24H-AM-26", "FE-H24H-AM-26", "FE-H24H-AM", 26,"H24SFEAM26").put();
		new Mondai("FE-H24H-AM-27", "FE-H24H-AM-27", "FE-H24H-AM", 27,"H24SFEAM27").put();
		new Mondai("FE-H24H-AM-28", "FE-H24H-AM-28", "FE-H24H-AM", 28,"H24SFEAM28").put();
		new Mondai("FE-H24H-AM-29", "FE-H24H-AM-29", "FE-H24H-AM", 29,"H24SFEAM29").put();
		new Mondai("FE-H24H-AM-30", "FE-H24H-AM-30", "FE-H24H-AM", 30,"H24SFEAM30").put();

		new Mondai("FE-H24H-AM-31", "FE-H24H-AM-31", "FE-H24H-AM", 31,"H24SFEAM31").put();
		new Mondai("FE-H24H-AM-32", "FE-H24H-AM-32", "FE-H24H-AM", 32,"H24SFEAM32").put();
		new Mondai("FE-H24H-AM-33", "FE-H24H-AM-33", "FE-H24H-AM", 33,"H24SFEAM33").put();
		new Mondai("FE-H24H-AM-34", "FE-H24H-AM-34", "FE-H24H-AM", 34,"H24SFEAM34").put();
		new Mondai("FE-H24H-AM-35", "FE-H24H-AM-35", "FE-H24H-AM", 35,"H24SFEAM35").put();
		new Mondai("FE-H24H-AM-36", "FE-H24H-AM-36", "FE-H24H-AM", 36,"H24SFEAM36").put();
		new Mondai("FE-H24H-AM-37", "FE-H24H-AM-37", "FE-H24H-AM", 37,"H24SFEAM37").put();
		new Mondai("FE-H24H-AM-38", "FE-H24H-AM-38", "FE-H24H-AM", 38,"H24SFEAM38").put();
		new Mondai("FE-H24H-AM-39", "FE-H24H-AM-39", "FE-H24H-AM", 39,"H24SFEAM39").put();
		new Mondai("FE-H24H-AM-40", "FE-H24H-AM-40", "FE-H24H-AM", 40,"H24SFEAM40").put();

		new Mondai("FE-H24H-AM-41", "FE-H24H-AM-41", "FE-H24H-AM", 41,"H24SFEAM41").put();
		new Mondai("FE-H24H-AM-42", "FE-H24H-AM-42", "FE-H24H-AM", 42,"H24SFEAM42").put();
		new Mondai("FE-H24H-AM-43", "FE-H24H-AM-43", "FE-H24H-AM", 43,"H24SFEAM43").put();
		new Mondai("FE-H24H-AM-44", "FE-H24H-AM-44", "FE-H24H-AM", 44,"H24SFEAM44").put();
		new Mondai("FE-H24H-AM-45", "FE-H24H-AM-45", "FE-H24H-AM", 45,"H24SFEAM45").put();
		new Mondai("FE-H24H-AM-46", "FE-H24H-AM-46", "FE-H24H-AM", 46,"H24SFEAM46").put();
		new Mondai("FE-H24H-AM-47", "FE-H24H-AM-47", "FE-H24H-AM", 47,"H24SFEAM47").put();
		new Mondai("FE-H24H-AM-48", "FE-H24H-AM-48", "FE-H24H-AM", 48,"H24SFEAM48").put();
		new Mondai("FE-H24H-AM-49", "FE-H24H-AM-49", "FE-H24H-AM", 49,"H24SFEAM49").put();
		new Mondai("FE-H24H-AM-50", "FE-H24H-AM-50", "FE-H24H-AM", 50,"H24SFEAM50").put();

		new Mondai("FE-H24H-AM-51", "FE-H24H-AM-51", "FE-H24H-AM", 51,"H24SFEAM51").put();
		new Mondai("FE-H24H-AM-52", "FE-H24H-AM-52", "FE-H24H-AM", 52,"H24SFEAM52").put();
		new Mondai("FE-H24H-AM-53", "FE-H24H-AM-53", "FE-H24H-AM", 53,"H24SFEAM53").put();
		new Mondai("FE-H24H-AM-54", "FE-H24H-AM-54", "FE-H24H-AM", 54,"H24SFEAM54").put();
		new Mondai("FE-H24H-AM-55", "FE-H24H-AM-55", "FE-H24H-AM", 55,"H24SFEAM55").put();
		new Mondai("FE-H24H-AM-56", "FE-H24H-AM-56", "FE-H24H-AM", 56,"H24SFEAM56").put();
		new Mondai("FE-H24H-AM-57", "FE-H24H-AM-57", "FE-H24H-AM", 57,"H24SFEAM57").put();
		new Mondai("FE-H24H-AM-58", "FE-H24H-AM-58", "FE-H24H-AM", 58,"H24SFEAM58").put();
		new Mondai("FE-H24H-AM-59", "FE-H24H-AM-59", "FE-H24H-AM", 59,"H24SFEAM59").put();
		new Mondai("FE-H24H-AM-60", "FE-H24H-AM-60", "FE-H24H-AM", 60,"H24SFEAM60").put();

		new Mondai("FE-H24H-AM-61", "FE-H24H-AM-61", "FE-H24H-AM", 61,"H24SFEAM61").put();
		new Mondai("FE-H24H-AM-62", "FE-H24H-AM-62", "FE-H24H-AM", 62,"H24SFEAM62").put();
		new Mondai("FE-H24H-AM-63", "FE-H24H-AM-63", "FE-H24H-AM", 63,"H24SFEAM63").put();
		new Mondai("FE-H24H-AM-64", "FE-H24H-AM-64", "FE-H24H-AM", 64,"H24SFEAM64").put();
		new Mondai("FE-H24H-AM-65", "FE-H24H-AM-65", "FE-H24H-AM", 65,"H24SFEAM65").put();
		new Mondai("FE-H24H-AM-66", "FE-H24H-AM-66", "FE-H24H-AM", 66,"H24SFEAM66").put();
		new Mondai("FE-H24H-AM-67", "FE-H24H-AM-67", "FE-H24H-AM", 67,"H24SFEAM67").put();
		new Mondai("FE-H24H-AM-68", "FE-H24H-AM-68", "FE-H24H-AM", 68,"H24SFEAM68").put();
		new Mondai("FE-H24H-AM-69", "FE-H24H-AM-69", "FE-H24H-AM", 69,"H24SFEAM69").put();
		new Mondai("FE-H24H-AM-70", "FE-H24H-AM-70", "FE-H24H-AM", 70,"H24SFEAM70").put();

		new Mondai("FE-H24H-AM-71", "FE-H24H-AM-71", "FE-H24H-AM", 71,"H24SFEAM71").put();
		new Mondai("FE-H24H-AM-72", "FE-H24H-AM-72", "FE-H24H-AM", 72,"H24SFEAM72").put();
		new Mondai("FE-H24H-AM-73", "FE-H24H-AM-73", "FE-H24H-AM", 73,"H24SFEAM73").put();
		new Mondai("FE-H24H-AM-74", "FE-H24H-AM-74", "FE-H24H-AM", 74,"H24SFEAM74").put();
		new Mondai("FE-H24H-AM-75", "FE-H24H-AM-75", "FE-H24H-AM", 75,"H24SFEAM75").put();
		new Mondai("FE-H24H-AM-76", "FE-H24H-AM-76", "FE-H24H-AM", 76,"H24SFEAM76").put();
		new Mondai("FE-H24H-AM-77", "FE-H24H-AM-77", "FE-H24H-AM", 77,"H24SFEAM77").put();
		new Mondai("FE-H24H-AM-78", "FE-H24H-AM-78", "FE-H24H-AM", 78,"H24SFEAM78").put();
		new Mondai("FE-H24H-AM-79", "FE-H24H-AM-79", "FE-H24H-AM", 79,"H24SFEAM79").put();
		new Mondai("FE-H24H-AM-80", "FE-H24H-AM-80", "FE-H24H-AM", 80,"H24SFEAM80").put();
		}

	private void m25h() throws NoSuchFieldException {
		new Mondai("FE-H25H-AM-01", "FE-H25H-AM-01", "FE-H25H-AM", 1,"H25SFEAM01").put();
		new Mondai("FE-H25H-AM-02", "FE-H25H-AM-02", "FE-H25H-AM", 2,"H25SFEAM02").put();
		new Mondai("FE-H25H-AM-03", "FE-H25H-AM-03", "FE-H25H-AM", 3,"H25SFEAM03").put();
		new Mondai("FE-H25H-AM-04", "FE-H25H-AM-04", "FE-H25H-AM", 4,"H25SFEAM04").put();
		new Mondai("FE-H25H-AM-05", "FE-H25H-AM-05", "FE-H25H-AM", 5,"H25SFEAM05").put();
		new Mondai("FE-H25H-AM-06", "FE-H25H-AM-06", "FE-H25H-AM", 6,"H25SFEAM06").put();
		new Mondai("FE-H25H-AM-07", "FE-H25H-AM-07", "FE-H25H-AM", 7,"H25SFEAM07").put();
		new Mondai("FE-H25H-AM-08", "FE-H25H-AM-08", "FE-H25H-AM", 8,"H25SFEAM08").put();
		new Mondai("FE-H25H-AM-09", "FE-H25H-AM-09", "FE-H25H-AM", 9,"H25SFEAM09").put();
		new Mondai("FE-H25H-AM-10", "FE-H25H-AM-10", "FE-H25H-AM", 10,"H25SFEAM10").put();
	}

	private void m26h() throws NoSuchFieldException {
		new Mondai("FE-H26H-AM-01", "FE-H26H-AM-01", "FE-H26H-AM", 1,"H26SFEAM01").put();
		new Mondai("FE-H26H-AM-02", "FE-H26H-AM-02", "FE-H26H-AM", 2,"H26SFEAM02").put();
		new Mondai("FE-H26H-AM-03", "FE-H26H-AM-03", "FE-H26H-AM", 3,"H26SFEAM03").put();
		new Mondai("FE-H26H-AM-04", "FE-H26H-AM-04", "FE-H26H-AM", 4,"H26SFEAM04").put();
		new Mondai("FE-H26H-AM-05", "FE-H26H-AM-05", "FE-H26H-AM", 5,"H26SFEAM05").put();
		new Mondai("FE-H26H-AM-06", "FE-H26H-AM-06", "FE-H26H-AM", 6,"H26SFEAM06").put();
		new Mondai("FE-H26H-AM-07", "FE-H26H-AM-07", "FE-H26H-AM", 7,"H26SFEAM07").put();
		new Mondai("FE-H26H-AM-08", "FE-H26H-AM-08", "FE-H26H-AM", 8,"H26SFEAM08").put();
		new Mondai("FE-H26H-AM-09", "FE-H26H-AM-09", "FE-H26H-AM", 9,"H26SFEAM09").put();
		new Mondai("FE-H26H-AM-10", "FE-H26H-AM-10", "FE-H26H-AM", 10,"H26SFEAM10").put();
	}

	private void m27h() throws NoSuchFieldException {
		new Mondai("FE-H27H-AM-01", "FE-H27H-AM-01", "FE-H27H-AM", 1,"H27SFEAM01").put();
		new Mondai("FE-H27H-AM-02", "FE-H27H-AM-02", "FE-H27H-AM", 2,"H27SFEAM02").put();
		new Mondai("FE-H27H-AM-03", "FE-H27H-AM-03", "FE-H27H-AM", 3,"H27SFEAM03").put();
		new Mondai("FE-H27H-AM-04", "FE-H27H-AM-04", "FE-H27H-AM", 4,"H27SFEAM04").put();
		new Mondai("FE-H27H-AM-05", "FE-H27H-AM-05", "FE-H27H-AM", 5,"H27SFEAM05").put();
		new Mondai("FE-H27H-AM-06", "FE-H27H-AM-06", "FE-H27H-AM", 6,"H27SFEAM06").put();
		new Mondai("FE-H27H-AM-07", "FE-H27H-AM-07", "FE-H27H-AM", 7,"H27SFEAM07").put();
		new Mondai("FE-H27H-AM-08", "FE-H27H-AM-08", "FE-H27H-AM", 8,"H27SFEAM08").put();
		new Mondai("FE-H27H-AM-09", "FE-H27H-AM-09", "FE-H27H-AM", 9,"H27SFEAM09").put();
		new Mondai("FE-H27H-AM-10", "FE-H27H-AM-10", "FE-H27H-AM", 10,"H27SFEAM10").put();
	}

	private void q26f() throws NoSuchFieldException {
		new Question("H26FFEAM01", "平成26年秋 基本情報 午前 01", 4, 4).put();
		new Question("H26FFEAM02", "平成26年秋 基本情報 午前 02", 4, 1).put();
		new Question("H26FFEAM03", "平成26年秋 基本情報 午前 03", 4, 4).put();
		new Question("H26FFEAM04", "平成26年秋 基本情報 午前 04", 4, 4).put();
		new Question("H26FFEAM05", "平成26年秋 基本情報 午前 05", 4, 2).put();
		new Question("H26FFEAM06", "平成26年秋 基本情報 午前 06", 4, 1).put();
		new Question("H26FFEAM07", "平成26年秋 基本情報 午前 07", 4, 4).put();
		new Question("H26FFEAM08", "平成26年秋 基本情報 午前 08", 4, 4).put();
		new Question("H26FFEAM09", "平成26年秋 基本情報 午前 09", 4, 4).put();
		new Question("H26FFEAM10", "平成26年秋 基本情報 午前 10", 4, 2).put();
	}

	private void q27s() throws NoSuchFieldException {
		new Question("H27SFEAM01", "平成27年春 基本情報 午前 01", 4, 3).put();
		new Question("H27SFEAM02", "平成27年春 基本情報 午前 02", 4, 1).put();
		new Question("H27SFEAM03", "平成27年春 基本情報 午前 03", 4, 4).put();
		new Question("H27SFEAM04", "平成27年春 基本情報 午前 04", 4, 2).put();
		new Question("H27SFEAM05", "平成27年春 基本情報 午前 05", 4, 2).put();
		new Question("H27SFEAM06", "平成27年春 基本情報 午前 06", 4, 1).put();
		new Question("H27SFEAM07", "平成27年春 基本情報 午前 07", 4, 4).put();
		new Question("H27SFEAM08", "平成27年春 基本情報 午前 08", 4, 1).put();
		new Question("H27SFEAM09", "平成27年春 基本情報 午前 09", 4, 1).put();
		new Question("H27SFEAM10", "平成27年春 基本情報 午前 10", 4, 3).put();
		
		new Question("H27SFEAM11", "平成27年春 基本情報 午前 11", 4, 1).put();
		new Question("H27SFEAM12", "平成27年春 基本情報 午前 12", 4, 3).put();
		new Question("H27SFEAM13", "平成27年春 基本情報 午前 13", 4, 4).put();
		new Question("H27SFEAM14", "平成27年春 基本情報 午前 14", 4, 1).put();
		new Question("H27SFEAM15", "平成27年春 基本情報 午前 15", 4, 2).put();
		new Question("H27SFEAM16", "平成27年春 基本情報 午前 16", 4, 4).put();
		new Question("H27SFEAM17", "平成27年春 基本情報 午前 17", 4, 4).put();
		new Question("H27SFEAM18", "平成27年春 基本情報 午前 18", 4, 2).put();
		new Question("H27SFEAM19", "平成27年春 基本情報 午前 19", 4, 3).put();
		new Question("H27SFEAM20", "平成27年春 基本情報 午前 20", 4, 4).put();
		
		new Question("H27SFEAM21", "平成27年春 基本情報 午前 21", 4, 1).put();
		new Question("H27SFEAM22", "平成27年春 基本情報 午前 22", 4, 3).put();
		new Question("H27SFEAM23", "平成27年春 基本情報 午前 23", 4, 3).put();
		new Question("H27SFEAM24", "平成27年春 基本情報 午前 24", 4, 4).put();
		new Question("H27SFEAM25", "平成27年春 基本情報 午前 25", 4, 4).put();
		new Question("H27SFEAM26", "平成27年春 基本情報 午前 26", 4, 3).put();
		new Question("H27SFEAM27", "平成27年春 基本情報 午前 27", 4, 1).put();
		new Question("H27SFEAM28", "平成27年春 基本情報 午前 28", 4, 4).put();
		new Question("H27SFEAM29", "平成27年春 基本情報 午前 29", 4, 2).put();
		new Question("H27SFEAM30", "平成27年春 基本情報 午前 30", 4, 4).put();
		
		new Question("H27SFEAM31", "平成27年春 基本情報 午前 31", 4, 4).put();
		new Question("H27SFEAM32", "平成27年春 基本情報 午前 32", 4, 2).put();
		new Question("H27SFEAM33", "平成27年春 基本情報 午前 33", 4, 3).put();
		new Question("H27SFEAM34", "平成27年春 基本情報 午前 34", 4, 3).put();
		new Question("H27SFEAM35", "平成27年春 基本情報 午前 35", 4, 2).put();
		new Question("H27SFEAM36", "平成27年春 基本情報 午前 36", 4, 1).put();
		new Question("H27SFEAM37", "平成27年春 基本情報 午前 37", 4, 2).put();
		new Question("H27SFEAM38", "平成27年春 基本情報 午前 38", 4, 3).put();
		new Question("H27SFEAM39", "平成27年春 基本情報 午前 39", 4, 1).put();
		new Question("H27SFEAM40", "平成27年春 基本情報 午前 40", 4, 3).put();
		
	}

	private void q26s() throws NoSuchFieldException {
		new Question("H26SFEAM01", "平成26年春 基本情報 午前 01", 4, 1).put();
		new Question("H26SFEAM02", "平成26年春 基本情報 午前 02", 4, 3).put();
		new Question("H26SFEAM03", "平成26年春 基本情報 午前 03", 4, 4).put();
		new Question("H26SFEAM04", "平成26年春 基本情報 午前 04", 4, 3).put();
		new Question("H26SFEAM05", "平成26年春 基本情報 午前 05", 4, 3).put();
		new Question("H26SFEAM06", "平成26年春 基本情報 午前 06", 4, 3).put();
		new Question("H26SFEAM07", "平成26年春 基本情報 午前 07", 4, 2).put();
		new Question("H26SFEAM08", "平成26年春 基本情報 午前 08", 4, 1).put();
		new Question("H26SFEAM09", "平成26年春 基本情報 午前 09", 4, 4).put();
		new Question("H26SFEAM10", "平成26年春 基本情報 午前 10", 4, 4).put();
	}

	private void q25f() throws NoSuchFieldException {
		new Question("H25FFEAM01", "平成25年秋 基本情報 午前 01", 4, 3).put();
		new Question("H25FFEAM02", "平成25年秋 基本情報 午前 02", 4, 1).put();
		new Question("H25FFEAM03", "平成25年秋 基本情報 午前 03", 4, 3).put();
		new Question("H25FFEAM04", "平成25年秋 基本情報 午前 04", 4, 3).put();
		new Question("H25FFEAM05", "平成25年秋 基本情報 午前 05", 4, 3).put();
		new Question("H25FFEAM06", "平成25年秋 基本情報 午前 06", 4, 1).put();
		new Question("H25FFEAM07", "平成25年秋 基本情報 午前 07", 4, 4).put();
		new Question("H25FFEAM08", "平成25年秋 基本情報 午前 08", 4, 1).put();
		new Question("H25FFEAM09", "平成25年秋 基本情報 午前 09", 4, 2).put();
		new Question("H25FFEAM10", "平成25年秋 基本情報 午前 10", 4, 3).put();
	}

	private void q25s() throws NoSuchFieldException {
		new Question("H25SFEAM01", "平成25年春 基本情報 午前 01", 4, 2).put();
		new Question("H25SFEAM02", "平成25年春 基本情報 午前 02", 4, 3).put();
		new Question("H25SFEAM03", "平成25年春 基本情報 午前 03", 4, 3).put();
		new Question("H25SFEAM04", "平成25年春 基本情報 午前 04", 4, 1).put();
		new Question("H25SFEAM05", "平成25年春 基本情報 午前 05", 4, 3).put();
		new Question("H25SFEAM06", "平成25年春 基本情報 午前 06", 4, 1).put();
		new Question("H25SFEAM07", "平成25年春 基本情報 午前 07", 4, 2).put();
		new Question("H25SFEAM08", "平成25年春 基本情報 午前 08", 4, 2).put();
		new Question("H25SFEAM09", "平成25年春 基本情報 午前 09", 4, 1).put();
		new Question("H25SFEAM10", "平成25年春 基本情報 午前 10", 4, 1).put();
	}

	private void q24f() throws NoSuchFieldException {
		new Question("H24FFEAM01", "平成24年秋 基本情報 午前 01", 4, 3).put();
		new Question("H24FFEAM02", "平成24年秋 基本情報 午前 02", 4, 2).put();
		new Question("H24FFEAM03", "平成24年秋 基本情報 午前 03", 4, 1).put();
		new Question("H24FFEAM04", "平成24年秋 基本情報 午前 04", 4, 2).put();
		new Question("H24FFEAM05", "平成24年秋 基本情報 午前 05", 4, 2).put();
		new Question("H24FFEAM06", "平成24年秋 基本情報 午前 06", 4, 2).put();
		new Question("H24FFEAM07", "平成24年秋 基本情報 午前 07", 4, 2).put();
		new Question("H24FFEAM08", "平成24年秋 基本情報 午前 08", 4, 2).put();
		new Question("H24FFEAM09", "平成24年秋 基本情報 午前 09", 4, 3).put();
		new Question("H24FFEAM10", "平成24年秋 基本情報 午前 10", 4, 4).put();
	}

	private void q24s() throws NoSuchFieldException {
		new Question("H24SFEAM01", "平成24年春 基本情報 午前 01", 4, 3).put();
		new Question("H24SFEAM02", "平成24年春 基本情報 午前 02", 4, 1).put();
		new Question("H24SFEAM03", "平成24年春 基本情報 午前 03", 4, 4).put();
		new Question("H24SFEAM04", "平成24年春 基本情報 午前 04", 4, 2).put();
		new Question("H24SFEAM05", "平成24年春 基本情報 午前 05", 4, 4).put();
		new Question("H24SFEAM06", "平成24年春 基本情報 午前 06", 4, 2).put();
		new Question("H24SFEAM07", "平成24年春 基本情報 午前 07", 4, 4).put();
		new Question("H24SFEAM08", "平成24年春 基本情報 午前 08", 4, 2).put();
		new Question("H24SFEAM09", "平成24年春 基本情報 午前 09", 4, 3).put();
		new Question("H24SFEAM10", "平成24年春 基本情報 午前 10", 4, 2).put();

		new Question("H24SFEAM11", "平成24年春 基本情報 午前 11", 4, 1).put();
		new Question("H24SFEAM12", "平成24年春 基本情報 午前 12", 4, 3).put();
		new Question("H24SFEAM13", "平成24年春 基本情報 午前 13", 4, 3).put();
		new Question("H24SFEAM14", "平成24年春 基本情報 午前 14", 4, 1).put();
		new Question("H24SFEAM15", "平成24年春 基本情報 午前 15", 4, 3).put();
		new Question("H24SFEAM16", "平成24年春 基本情報 午前 16", 4, 1).put();
		new Question("H24SFEAM17", "平成24年春 基本情報 午前 17", 4, 2).put();
		new Question("H24SFEAM18", "平成24年春 基本情報 午前 18", 4, 2).put();
		new Question("H24SFEAM19", "平成24年春 基本情報 午前 19", 4, 4).put();
		new Question("H24SFEAM20", "平成24年春 基本情報 午前 20", 4, 3).put();

		new Question("H24SFEAM21", "平成24年春 基本情報 午前 21", 4, 1).put();
		new Question("H24SFEAM22", "平成24年春 基本情報 午前 22", 4, 2).put();
		new Question("H24SFEAM23", "平成24年春 基本情報 午前 23", 4, 3).put();
		new Question("H24SFEAM24", "平成24年春 基本情報 午前 24", 4, 3).put();
		new Question("H24SFEAM25", "平成24年春 基本情報 午前 25", 4, 3).put();
		new Question("H24SFEAM26", "平成24年春 基本情報 午前 26", 4, 3).put();
		new Question("H24SFEAM27", "平成24年春 基本情報 午前 27", 4, 3).put();
		new Question("H24SFEAM28", "平成24年春 基本情報 午前 28", 4, 2).put();
		new Question("H24SFEAM29", "平成24年春 基本情報 午前 29", 4, 1).put();
		new Question("H24SFEAM30", "平成24年春 基本情報 午前 30", 4, 3).put();
		
		new Question("H24SFEAM31", "平成24年春 基本情報 午前 31", 4, 3).put();
		new Question("H24SFEAM32", "平成24年春 基本情報 午前 32", 4, 4).put();
		new Question("H24SFEAM33", "平成24年春 基本情報 午前 33", 4, 4).put();
		new Question("H24SFEAM34", "平成24年春 基本情報 午前 34", 4, 4).put();
		new Question("H24SFEAM35", "平成24年春 基本情報 午前 35", 4, 3).put();
		new Question("H24SFEAM36", "平成24年春 基本情報 午前 36", 4, 3).put();
		new Question("H24SFEAM37", "平成24年春 基本情報 午前 37", 4, 3).put();
		new Question("H24SFEAM38", "平成24年春 基本情報 午前 38", 4, 3).put();
		new Question("H24SFEAM39", "平成24年春 基本情報 午前 39", 4, 2).put();
		new Question("H24SFEAM40", "平成24年春 基本情報 午前 40", 4, 2).put();
		
		new Question("H24SFEAM41", "平成24年春 基本情報 午前 41", 4, 3).put();
		new Question("H24SFEAM42", "平成24年春 基本情報 午前 42", 4, 4).put();
		new Question("H24SFEAM43", "平成24年春 基本情報 午前 43", 4, 1).put();
		new Question("H24SFEAM44", "平成24年春 基本情報 午前 44", 4, 2).put();
		new Question("H24SFEAM45", "平成24年春 基本情報 午前 45", 4, 3).put();
		new Question("H24SFEAM46", "平成24年春 基本情報 午前 46", 4, 1).put();
		new Question("H24SFEAM47", "平成24年春 基本情報 午前 47", 4, 3).put();
		new Question("H24SFEAM48", "平成24年春 基本情報 午前 48", 4, 2).put();
		new Question("H24SFEAM49", "平成24年春 基本情報 午前 49", 4, 1).put();
		new Question("H24SFEAM50", "平成24年春 基本情報 午前 50", 4, 3).put();
	
		new Question("H24SFEAM51", "平成24年春 基本情報 午前 51", 4, 3).put();
		new Question("H24SFEAM52", "平成24年春 基本情報 午前 52", 4, 3).put();
		new Question("H24SFEAM53", "平成24年春 基本情報 午前 53", 4, 3).put();
		new Question("H24SFEAM54", "平成24年春 基本情報 午前 54", 4, 3).put();
		new Question("H24SFEAM55", "平成24年春 基本情報 午前 55", 4, 1).put();
		new Question("H24SFEAM56", "平成24年春 基本情報 午前 56", 4, 4).put();
		new Question("H24SFEAM57", "平成24年春 基本情報 午前 57", 4, 2).put();
		new Question("H24SFEAM58", "平成24年春 基本情報 午前 58", 4, 2).put();
		new Question("H24SFEAM59", "平成24年春 基本情報 午前 59", 4, 1).put();
		new Question("H24SFEAM60", "平成24年春 基本情報 午前 60", 4, 4).put();
		
		new Question("H24SFEAM61", "平成24年春 基本情報 午前 61", 4, 2).put();
		new Question("H24SFEAM62", "平成24年春 基本情報 午前 62", 4, 4).put();
		new Question("H24SFEAM63", "平成24年春 基本情報 午前 63", 4, 4).put();
		new Question("H24SFEAM64", "平成24年春 基本情報 午前 64", 4, 4).put();
		new Question("H24SFEAM65", "平成24年春 基本情報 午前 65", 4, 3).put();
		new Question("H24SFEAM66", "平成24年春 基本情報 午前 66", 4, 2).put();
		new Question("H24SFEAM67", "平成24年春 基本情報 午前 67", 4, 1).put();
		new Question("H24SFEAM68", "平成24年春 基本情報 午前 68", 4, 4).put();
		new Question("H24SFEAM69", "平成24年春 基本情報 午前 69", 4, 2).put();
		new Question("H24SFEAM70", "平成24年春 基本情報 午前 70", 4, 2).put();
		
		new Question("H24SFEAM71", "平成24年春 基本情報 午前 71", 4, 4).put();
		new Question("H24SFEAM72", "平成24年春 基本情報 午前 72", 4, 1).put();
		new Question("H24SFEAM73", "平成24年春 基本情報 午前 73", 4, 4).put();
		new Question("H24SFEAM74", "平成24年春 基本情報 午前 74", 4, 4).put();
		new Question("H24SFEAM75", "平成24年春 基本情報 午前 75", 4, 2).put();
		new Question("H24SFEAM76", "平成24年春 基本情報 午前 76", 4, 2).put();
		new Question("H24SFEAM77", "平成24年春 基本情報 午前 77", 4, 2).put();
		new Question("H24SFEAM78", "平成24年春 基本情報 午前 78", 4, 4).put();
		new Question("H24SFEAM79", "平成24年春 基本情報 午前 79", 4, 2).put();
		new Question("H24SFEAM80", "平成24年春 基本情報 午前 80", 4, 4).put();
	}
}
