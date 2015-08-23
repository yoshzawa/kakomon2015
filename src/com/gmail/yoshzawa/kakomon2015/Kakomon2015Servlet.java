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
			new MondaiPrint("FEG-10201", "アルゴリズムとプログラミング").put();

			new Mondai("FEG-10101-01", "FEG-10101 01", "FEG-10101", 1,"2014SFEAM01").put();
			new Mondai("FEG-10101-02", "FEG-10101 02", "FEG-10101", 2,"2014SFEAM02").put();
			new Mondai("FEG-10101-03", "FEG-10101 03", "FEG-10101", 3,"2014SFEAM03").put();
			
			new Mondai("FE-H24H-AM-01", "FE-H24H-AM-01", "FE-H24H-AM", 1,"2014SFEAM01").put();
			new Mondai("FE-H24H-AM-02", "FE-H24H-AM-02", "FE-H24H-AM", 2,"2014SFEAM02").put();
			new Mondai("FE-H24H-AM-03", "FE-H24H-AM-03", "FE-H24H-AM", 3,"2014SFEAM03").put();
			new Mondai("FE-H24H-AM-04", "FE-H24H-AM-04", "FE-H24H-AM", 4,"2014SFEAM04").put();
			new Mondai("FE-H24H-AM-05", "FE-H24H-AM-05", "FE-H24H-AM", 5,"2014SFEAM05").put();
			new Mondai("FE-H24H-AM-06", "FE-H24H-AM-06", "FE-H24H-AM", 6,"2014SFEAM06").put();
			new Mondai("FE-H24H-AM-07", "FE-H24H-AM-07", "FE-H24H-AM", 7,"2014SFEAM07").put();
			new Mondai("FE-H24H-AM-08", "FE-H24H-AM-08", "FE-H24H-AM", 8,"2014SFEAM08").put();
			new Mondai("FE-H24H-AM-09", "FE-H24H-AM-09", "FE-H24H-AM", 9,"2014SFEAM09").put();
			new Mondai("FE-H24H-AM-10", "FE-H24H-AM-10", "FE-H24H-AM", 10,"2014SFEAM10").put();
			
			new Question("2014SFEAM01", "平成24年春 基本情報 午前 01", 4, 3).put();
			new Question("2014SFEAM02", "平成24年春 基本情報 午前 02", 4, 1).put();
			new Question("2014SFEAM03", "平成24年春 基本情報 午前 03", 4, 4).put();
			new Question("2014SFEAM04", "平成24年春 基本情報 午前 04", 4, 2).put();
			new Question("2014SFEAM05", "平成24年春 基本情報 午前 05", 4, 4).put();
			new Question("2014SFEAM06", "平成24年春 基本情報 午前 06", 4, 2).put();
			new Question("2014SFEAM07", "平成24年春 基本情報 午前 07", 4, 4).put();
			new Question("2014SFEAM08", "平成24年春 基本情報 午前 08", 4, 2).put();
			new Question("2014SFEAM09", "平成24年春 基本情報 午前 09", 4, 3).put();
			new Question("2014SFEAM10", "平成24年春 基本情報 午前 10", 4, 2).put();
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
}
