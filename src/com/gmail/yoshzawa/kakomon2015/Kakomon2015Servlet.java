package com.gmail.yoshzawa.kakomon2015;
import java.io.IOException;

import javax.servlet.http.*;

import com.gmail.yoshzawa.kakomon2015.dataStore.Exam;
import com.gmail.yoshzawa.kakomon2015.dataStore.Question;

@SuppressWarnings("serial")
public class Kakomon2015Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");

		
		Exam fe1_1 = new Exam("FEG-10101", "基礎理論");
		fe1_1.put();
		Exam e = Exam.get("FEG-10101");
		resp.getWriter().println("<h1>");
		resp.getWriter().println(e.getName()+"は登録されています");
		resp.getWriter().println("</h1>");
		fe1_1.getFields();
		
		Question fe1_1_01 = new Question("FEG-10101-01", "FEG-10101", 1, "H24 春 FE午前 01",3);
		fe1_1_01.put();
		Question q1 = Question.get("FEG-10101-01");
		resp.getWriter().println("<h2>");
		resp.getWriter().println(q1.getName()+"は登録されています");
		resp.getWriter().println("</h2>");
		
		
	}
}
