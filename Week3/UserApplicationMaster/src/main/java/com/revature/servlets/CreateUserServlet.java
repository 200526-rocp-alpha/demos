package com.revature.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection conn;  // Make sure that the driver software is included in lib.
	// we create an init() method, 
	// we create a specific service() -->  doGet() method OR doPost();
	// we will create a destroy()
	
	public void init() throws ServletException {
		// we will establish JDBC connection here
		// ...because it's called once
		System.out.println(this.getServletName() + " INSTANTIATED!");
		super.init();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@database-2.c0rzi76acgyn.us-east-1.rds.amazonaws.com:1521:FIRSTDB", "admin", "12345678");
			System.out.println("Connected!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// since we are CREATING a user and changing the database
	// we must use the POST HTTP method...we do so in a servlet with the doPost().
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// we'll eventually use a SQL insert statement here
		// the info that we're posting/inserting to the database comes from PARAMETERS
		
		String firstname = req.getParameter("firstName"); // make sure this matched the "name" value in your HTML!
		String lastname = req.getParameter("lastName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		// the we create an insert statement Statement statement = conn.createStatement()
		try {
			Statement statement = conn.createStatement();
			int result = statement.executeUpdate("INSERT INTO msg_user VALUES ('"+firstname+"', '"+lastname+"', '"+email+"', '"+password+"')"); // executeUpdate returns an INTEGER of how many rows were affected 
			// an insert statement affects 1 row, but an update or delete statment can affect more...	
			
			PrintWriter out = res.getWriter();
			
			if (result > 0) {
				out.println("<h1>User Created!</h1>");
			} else {
				out.println("<h1>Error creating user...</h1>");
			}
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