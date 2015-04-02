package com.epam.firstservletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloMessage extends HttpServlet {
	private static final long serialVersionUID = -5827492905831670358L;

	public void init() throws ServletException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String defaultName = request.getParameter("defaultName");
		out.println("<h1>Hello " + (username=="" ? defaultName : username) + "</h1>");
		out.println("<form method=\"GET\" action=\"/SampleProject/HelloForm\"><input type=\"submit\"/></form>");
	}

	public void destroy() {
		// do nothing.
	}
}
