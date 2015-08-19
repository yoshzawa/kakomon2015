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
		
		Question fe1_1_01 = new Question("FEG-10101-01", "FEG-10101", 1, "H24 春 FE午前 01",3);
		try {
			fe1_1_01.put();
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		}
		Question q1 = Question.get("FEG-10101-01");
		resp.getWriter().println("<h2>");
		if(q1 != null)
		resp.getWriter().println(q1.getName()+"は登録されています");
		else
			resp.getWriter().println("登録されていません");
		resp.getWriter().println("</h2>");
		
		
	}
}
