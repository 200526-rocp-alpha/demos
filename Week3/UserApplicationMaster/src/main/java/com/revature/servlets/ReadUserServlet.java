package com.revature.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection conn;  // Make sure that the driver software is included in lib.

	
	public void init() throws ServletException {

		System.out.println(this.getServletName() + " INSTANTIATED!");
		super.init();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@database-2.c0rzi76acgyn.us-east-1.rds.amazonaws.com:1521:FIRSTDB", "admin", "12345678");
			System.out.println("Connected!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// we use a doGet which is IDEMPOTENT 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM msg_user");
			
			// we still use Print Writer to build a dynamic HTML 
			PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			
			out.println("<table>");  // First Name       Last Name         Email
			out.println("<tr>");
			out.println("<th>");
			out.println("First Name"); // we will return a table in HTML of FN, LN, EMAIL.
			out.println("</th>");
			out.println("<th>");
			out.println("Last Name");
			out.println("</th>");
			out.println("<th>");
			out.println("Email");
			out.println("</th>");
			out.println("</tr>");
			
			while(resultSet.next()) {
				// do something here....realted to getString() <td>
				out.println("<tr>");
				
				out.println("<td>");
				out.println(resultSet.getString("firstname"));
				out.println("</td>");
				
				out.println("<td>");
				out.println(resultSet.getString("lastname"));
				out.println("</td>");
				
				out.println("<td>");
				out.println(resultSet.getString("email"));
				out.println("</td>");
				
				out.println("</tr>");
			}
			
			out.println("</table>");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void destroy() {
		System.out.println(this.getServletName() + " DESTROYED!");
		super.destroy();
		// we will also close our connection
		try {
			conn.close();
			System.out.println("Connection closed.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}