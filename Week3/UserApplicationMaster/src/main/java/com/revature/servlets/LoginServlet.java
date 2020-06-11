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

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

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
	
	// we will ALSO use a doPost method here....but we will take in different parameters
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password"); // this is the password you want to update
		
		// the we create an insert statement Statement statement = conn.createStatement()
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM msg_user WHERE email= '"+email+"' AND pass= '"+password+"'  ");                                   
		
			
			// we want to send the work of creating a response to our HomeServlet!
			RequestDispatcher rd = req.getRequestDispatcher("homeServlet");
			// the RD is set up and ready to send to HomeServlet
			
			if (resultSet.next()) {
				
				// we want to set an attribute
				req.setAttribute("message", "Access granted! Welcome to the HomeServlet " + email);
				
				rd.forward(req, res); // in this case we haven't created the home servlet yet
				// we're forwarding the req & resp object to the HomeServlet
				
				// THE HOME SERVLET will then be able to retieve the username and password
				// and it can write the response back to the client....
			} else {
				rd = req.getRequestDispatcher("login.html"); // else, we send the user BACK to the login page...
				rd.include(req, res);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		destroy();
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
