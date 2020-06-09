package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException { 
		System.out.println(this.getServletName() + " IS INSTANTIATED!");
		super.init();
	}
	
	// REMEMBER THIS
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		// now we must get the parameters OUT of the request
		if(req.getParameter("number1") != null && req.getParameter("number2") != null) {
			int num1 = Integer.parseInt(req.getParameter("number1"));
			int num2 = Integer.parseInt(req.getParameter("number2"));
			
			PrintWriter out = res.getWriter();
			out.println("The sum is: " + (num1 + num2));
		} 
	}
	
	public void destroy() {
		System.out.println(this.getServletName() + " DESTROY METHOD CALLED!");
		super.destroy();
	}
	
}
