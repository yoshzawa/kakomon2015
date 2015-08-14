package com.gmail.yoshzawa.kakomon2015;
import java.io.IOException;

import javax.servlet.http.*;

import com.gmail.yoshzawa.kakomon2015.dataStore.Exam;

@SuppressWarnings("serial")
public class Kakomon2015Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setContentType("text/html;charset=UTF-8");

		resp.getWriter().println("Hello, world");
		
		Exam fe1_1 = new Exam("FEG-10101", "基礎理論");
		fe1_1.put();
		Exam e = Exam.get("FEG-10101");
		resp.getWriter().println(e.getName()+"は登録されています");
	}
}
