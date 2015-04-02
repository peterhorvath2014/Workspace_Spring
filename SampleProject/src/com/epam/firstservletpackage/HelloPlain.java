package com.epam.firstservletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloPlain extends HttpServlet {
	private static final long serialVersionUID = -5827492905831670358L;

	private String message;

	public void init() throws ServletException {
		// Do required initialization
		message = "Peter Horvath";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/plain");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println(message);
	}

	public void destroy() {
		// do nothing.
	}
}
