package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/homeServlet")
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Connection conn;  // Make sure that the driver software is included in lib.

	
	public void init() throws ServletException {

		System.out.println(this.getServletName() + " INSTANTIATED!");
		super.init();
	}
	
	// we will get the message that was set in the LoginServlet Request........
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println(req.getAttribute("message"));// now we will print the message that's the value of the message attribute.
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
