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
public class MondaiListServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html;charset=UTF-8");
		
		// MondaiPrintのidを取得
		String mondaiPrintId = req.getParameter("mondaiPrintId");
		
		// 対象のMondaiPrintを取得
		MondaiPrint mp = MondaiPrint.get(mondaiPrintId);
				
		// Mondaiを取得
		List<Mondai> mList = Mondai.getListByParentId(mondaiPrintId);
				
		req.setAttribute("mp", mp);
		req.setAttribute("mList", mList);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/mondaiList.jsp");
		rd.forward(req, resp);
		
	}
}
