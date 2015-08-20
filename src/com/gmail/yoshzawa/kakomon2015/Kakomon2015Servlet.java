package com.gmail.yoshzawa.kakomon2015;
import java.io.IOException;

import javax.servlet.http.*;

import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;
import com.gmail.yoshzawa.kakomon2015.dataStore.Question;

@SuppressWarnings("serial")
public class Kakomon2015Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");

		
		MondaiPrint fe1_1 = new MondaiPrint("FEG-10101", "基礎理論");
		try {
			fe1_1.put();
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		}
		MondaiPrint e = MondaiPrint.get("FEG-10101");
		resp.getWriter().println("<h1>");
		if(e != null)
		resp.getWriter().println(e.getName()+"は登録されています");
		else
			resp.getWriter().println("登録されていません");
		resp.getWriter().println("</h1>");
		fe1_1.getFields();
		
		Question q2014SFEAM01 = new Question("2014SFEAM01", "平成24年春 基本情報 午前 01", 4, 3);
		Question q2014SFEAM02 = new Question("2014SFEAM02", "平成24年春 基本情報 午前 02", 4, 1);
		Question q2014SFEAM03 = new Question("2014SFEAM03", "平成24年春 基本情報 午前 03", 4, 4);
		Question q2014SFEAM04 = new Question("2014SFEAM04", "平成24年春 基本情報 午前 04", 4, 2);
		Question q2014SFEAM05 = new Question("2014SFEAM05", "平成24年春 基本情報 午前 05", 4, 4);
		Question q2014SFEAM06 = new Question("2014SFEAM06", "平成24年春 基本情報 午前 06", 4, 2);
		Question q2014SFEAM07 = new Question("2014SFEAM07", "平成24年春 基本情報 午前 07", 4, 4);
		Question q2014SFEAM08 = new Question("2014SFEAM08", "平成24年春 基本情報 午前 08", 4, 2);
		Question q2014SFEAM09 = new Question("2014SFEAM09", "平成24年春 基本情報 午前 09", 4, 3);
		Question q2014SFEAM10 = new Question("2014SFEAM10", "平成24年春 基本情報 午前 10", 4, 2);
		
		
		try {
			q2014SFEAM01.put();
			q2014SFEAM02.put();
			q2014SFEAM03.put();
			q2014SFEAM04.put();
			q2014SFEAM05.put();
			q2014SFEAM06.put();
			q2014SFEAM07.put();
			q2014SFEAM08.put();
			q2014SFEAM09.put();
			q2014SFEAM10.put();
		} catch (NoSuchFieldException e1) {
			resp.getWriter().println("questionの登録に失敗しました");
		}
		
		Question q01 = Question.get("2014SFEAM01");
		resp.getWriter().println("<h1>");
		if(e != null){
			int seikai = q01.getSeikai();
		resp.getWriter().println(q01.getName()+"は"+"アイウエ".substring(seikai-1,seikai)+"登録されています");
		}
		else
			resp.getWriter().println("登録されていません");
		resp.getWriter().println("</h1>");

		Question q02 = Question.get("2014SFEAM02");
		resp.getWriter().println("<h1>");
		if(e != null){
			int seikai = q02.getSeikai();
		resp.getWriter().println(q02.getName()+"は"+"アイウエ".substring(seikai-1,seikai)+"登録されています");
		}
		else
			resp.getWriter().println("登録されていません");
		resp.getWriter().println("</h1>");

		
	}
}
