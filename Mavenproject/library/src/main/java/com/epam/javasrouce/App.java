package com.epam.javasrouce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String[] jokes = {"Joke1", "Joke2"};
		
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		
		try {
			Statement stat = c.createStatement();
		    stat.executeUpdate("CREATE TABLE IF NOT EXISTS Joke(joke VARCHAR)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Statement stat = c.createStatement();
		    ResultSet result = stat.executeQuery("SELECT * FROM Joke");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Opened database successfully");
	}
}
