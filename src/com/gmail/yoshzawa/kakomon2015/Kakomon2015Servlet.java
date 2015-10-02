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
			H24S.q();
			H24F.q();
			H25S.q();
			H25F.q();
			H26S.q();
			H26F.q();
			H27S.q();
			
			H24S.m();
			H24F.m();
			H25S.m();
			H25F.m();
			H26S.m();
			H26F.m();
			H27S.m();

			M101.m();
			M102.m();
			M203.m();
			M204.m();
			M514.m();
			M412.m();

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
}
