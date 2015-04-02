package com.epam.firstservletpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PlayerDetails extends HttpServlet {
	private static final long serialVersionUID = -5827492905831670358L;

	private String filePath;

	public void init() throws ServletException {
		// Do required initialization
		filePath = "WEB-INF/resources/players.txt";
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();
		InputStream is = context.getResourceAsStream(filePath);
		String str = "";
		StringBuffer buf = new StringBuffer();
		List<String[]> players = new ArrayList<String[]>();
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(is));
			if (is != null) {
				while ((str = reader.readLine()) != null) {
					buf.append(str + "\n");
					String[] player = str.split(",");
					players.add(player);
				}
			}
		} finally {
			try {
				is.close();
			} catch (Throwable ignore) {
			}
		}
		String nickname = request.getParameter("nickname");
		out.println("Posted nickname: " + nickname);
		out.println("<form method=\"POST\" action=\"/SampleProject/HelloMessage\">");
		for (String[] player : players) {
			
			if (player[0].equals(nickname)) {
				out.println("Player nickname: " + player[0]);
				out.println("<br/>Player fullname: " + player[1]);
				out.println("<br/>Player level: " + player[2]);
				out.println("<br/>Player score: " + player[3]);
			}
		}
		out.println("</form>");
	}

	public void destroy() {
		// do nothing.
	}
}
