package com.gmail.yoshzawa.kakomon2015;
import java.io.IOException;

import javax.servlet.http.*;

import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;
import com.gmail.yoshzawa.kakomon2015.dataStore.Question;

@SuppressWarnings("serial")
public class Kakomon2015Servlet2 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
		MondaiPrint fe1_1 = new MondaiPrint("FEG-10101", "基礎理論");
		MondaiPrint fe1_2 = new MondaiPrint("FEG-10201", "基礎理論");


		

		
	}
}
