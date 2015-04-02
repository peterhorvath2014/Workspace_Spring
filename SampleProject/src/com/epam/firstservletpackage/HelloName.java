package com.epam.firstservletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloName extends HttpServlet {
	private static final long serialVersionUID = -5827492905831670358L;

	private String message;

	public void init() throws ServletException {
		// Do required initialization
		message = "Hello";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
		out.println("<form method=\"POST\"><input name=\"username\"><input type=\"submit\"/></form>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello " + request.getParameter("username") + "</h1>");
	}

	public void destroy() {
		// do nothing.
	}
}
