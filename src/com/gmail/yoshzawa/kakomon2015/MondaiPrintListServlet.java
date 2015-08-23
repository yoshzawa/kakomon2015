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

		
		MondaiPrint fe1_1 = new MondaiPrint("FEG-10101", "基礎理論");
		MondaiPrint fe1_2 = new MondaiPrint("FEG-10201", "アルゴリズムとプログラミング");
		
		Mondai fe1_1_01 = new Mondai("FEG-10101-01", "FEG-10101 01", "FEG-10101", 1, "2014SFEAM01");
		Mondai fe1_1_02 = new Mondai("FEG-10101-02", "FEG-10101 02", "FEG-10101", 2, "2014SFEAM02");
		Mondai fe1_1_03 = new Mondai("FEG-10101-03", "FEG-10101 03", "FEG-10101", 3, "2014SFEAM03");

		try {
			fe1_1.put();
			fe1_2.put();
			
			fe1_1_01.put();
			fe1_1_02.put();
			fe1_1_03.put();
			
			
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
