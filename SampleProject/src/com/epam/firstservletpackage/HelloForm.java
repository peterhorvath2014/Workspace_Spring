package com.epam.firstservletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = -5827492905831670358L;

	private String message;
	private String defaultName;

	public void init() throws ServletException {
		// Do required initialization
		message = "Hello";
		defaultName = "Kiscsirke";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
		out.println("<form method=\"POST\" action=\"/SampleProject/HelloMessage\">"
				+ "<input name=\"username\">"
				+ "<input type=\"hidden\" name=\"defaultName\" value=\"" + defaultName + "\">"
				+ "<input type=\"submit\"/></form>");
	}

	public void destroy() {
		// do nothing.
	}
}
