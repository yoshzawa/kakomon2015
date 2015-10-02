package com.gmail.yoshzawa.markdownFilter;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.Map;
import java.util.Set;

public class MarkdownFilter extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.setContentType("text/html;charset=UTF-8");
/*
  		Map parameters = request.getParameterMap();
		for (String s : (Set<String>) parameters.keySet()) {
			System.out.println(s + ":" + parameters.get(s));
		}
 */
		
		String uri = request.getRequestURI();
		String lastUriParts = getLastUriParts(uri);
		System.out.println(lastUriParts);
		

	}

	private String getLastUriParts(String uri) {
		String[] uriParts = uri.split("/");
		String lastUriParts = uriParts[uriParts.length-1];
		return lastUriParts;
	}

}