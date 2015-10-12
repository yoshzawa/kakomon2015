package com.gmail.yoshzawa.mdDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

public class MarkDownDecoder extends HttpServlet {

	@Override
	public void doGet(javax.servlet.http.HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String[] URI = request.getRequestURI().split("/");
		String fileName = URI[URI.length - 1];

		InputStream in = getServletContext().getResourceAsStream(
				"/WEB-INF/md/" + fileName);
		try {
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
			BufferedReader br = new BufferedReader(isr);

			List<String> markdownText = new ArrayList<String>();
			{
				String s;

				while ((s = br.readLine()) != null) {
					markdownText.add(s);
				}
			}

			List<String> htmlResult = mdToHtml(markdownText);
			// for (String s : htmlResult) {
			// out.println(s);
			// }

			request.setAttribute("html", htmlResult);

			RequestDispatcher rd = request
					.getRequestDispatcher("/WEB-INF/jsp/markdownFilter.jsp");
			rd.forward(request, response);

		} catch (java.lang.NullPointerException e) {
			PrintWriter out = response.getWriter();

			out.print("MarkDownDecoder : not found");
		}
	}

	enum MarkdownType {
		header1, header2, header3, header4, header5, header6, nullRow, other
	};

	List<String> mdToHtml(List<String> markdownText) {

		List<String> result = new ArrayList<String>();
		MarkdownType[] stringPattern = makeStringPattern(markdownText);
		String s = "";

		for (int i = 0; i < markdownText.size(); i++) {

			if (stringPattern[i] == MarkdownType.other) {
				s = s + " " + markdownText.get(i);
			} else {

				if ((s.length() != 0)) { // pタグ終了条件なら今までの中身を出力
					result.add("<p>");
					result.add(s);
					result.add("</p>");
				}

				if (stringPattern[i] != MarkdownType.nullRow) {
					s = removeRowMark(markdownText.get(i), stringPattern[i]);
					result.add(s);
				}
				s = "";
			}
		}
		if (s.length() != 0) { // p end
			result.add("<p>");
			result.add(s);
			result.add("</p>");
		}
		return result;
	}

	private MarkdownType[] makeStringPattern(List<String> markdownText) {
		MarkdownType[] stringPattern = new MarkdownType[markdownText.size()];

		for (int i = 0; i < markdownText.size(); i++) {
			String s = markdownText.get(i);
			if (s.length() == 0) {
				stringPattern[i] = MarkdownType.nullRow;
			} else if (s.startsWith("######") == true) {
				stringPattern[i] = MarkdownType.header6;
			} else if (s.startsWith("#####") == true) {
				stringPattern[i] = MarkdownType.header5;
			} else if (s.startsWith("####") == true) {
				stringPattern[i] = MarkdownType.header4;
			} else if (s.startsWith("###") == true) {
				stringPattern[i] = MarkdownType.header3;
			} else if (s.startsWith("##") == true) {
				stringPattern[i] = MarkdownType.header2;
			} else if (s.startsWith("#") == true) {
				stringPattern[i] = MarkdownType.header1;
			} else {
				stringPattern[i] = MarkdownType.other;
			}
		}
		return stringPattern;
	}

	private String removeRowMark(String string, MarkdownType stringPattern) {
		if (stringPattern == MarkdownType.header1) {
			string = "<h1>" + string.substring(1) + "</h1>";
		} else if (stringPattern == MarkdownType.header2) {
			string = "<h2>" + string.substring(2) + "</h2>";
		} else if (stringPattern == MarkdownType.header3) {
			string = "<h3>" + string.substring(3) + "</h3>";
		} else if (stringPattern == MarkdownType.header4) {
			string = "<h4>" + string.substring(4) + "</h4>";
		} else if (stringPattern == MarkdownType.header5) {
			string = "<h5>" + string.substring(5) + "</h5>";
		} else if (stringPattern == MarkdownType.header6) {
			string = "<h6>" + string.substring(6) + "</h6>";
		}
		return string;
	}
}
