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

public class PlayerList extends HttpServlet {
	private static final long serialVersionUID = -5827492905831670358L;

	private String filePath;

	public void init() throws ServletException {
		// Do required initialization
		filePath = "WEB-INF/resources/players.txt";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
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

		out.println("<form method=\"POST\" action=\"/SampleProject/PlayerDetails\">");
		for (String[] player : players) {
			out.println("<input name=\"nickname\" value=\"" + player[0] + "\" type=\"submit\"/>");
		}
		out.println("</form>");
	}

	public void destroy() {
		// do nothing.
	}
}
