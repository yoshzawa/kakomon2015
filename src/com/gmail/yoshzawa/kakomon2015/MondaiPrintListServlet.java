package com.gmail.yoshzawa.kakomon2015;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gmail.yoshzawa.kakomon2015.dataStore.Mondai;
import com.gmail.yoshzawa.kakomon2015.dataStore.MondaiPrint;

@SuppressWarnings("serial")
public class MondaiPrintListServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html;charset=UTF-8");
		

		
		List<MondaiPrint> mpList = MondaiPrint.getList();
		
		req.setAttribute("mpList", mpList);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/mondaiPrintList.jsp");
		rd.forward(req, resp);
		
	}
}
