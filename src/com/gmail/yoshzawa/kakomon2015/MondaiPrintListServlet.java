package com.gmail.yoshzawa.kakomon2015;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;
import com.gmail.yoshzawa.kakomon2015.dataStore.Question;

@SuppressWarnings("serial")
public class MondaiPrintListServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html;charset=UTF-8");
		
		MondaiPrint fe1_1 = new MondaiPrint("FEG-10101", "基礎理論");
		MondaiPrint fe1_2 = new MondaiPrint("FEG-10201", "アルゴリズムとプログラミング");

		try {
			fe1_1.put();
			fe1_2.put();
		} catch (NoSuchFieldException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		List<MondaiPrint> mpList = MondaiPrint.getList();
		
		req.setAttribute("mpList", mpList);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/mondaiPrintList.jsp");
		rd.forward(req, resp);
		
	}
}
