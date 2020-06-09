package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// This class will extend HttpServlet....this extends Generic Servlet
public class HelloWorldServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Servlets have 3 primary methods in their lifecycle
	 * 
	 * 1. The first is init(), which is called to INSTANTIATE the servlet
	 * First, it checks to see if this servlet is already in existance beore creating one
	 * 
	 * (This uses a Singleton design pattern)
	 */
	
	// The web container looks for the init() method....
	public void init() throws ServletException { 
		System.out.println(this.getServletName() + " IS INSTANTIATED!");
		super.init();
	}
	
	
	/*
	 * 2. The second method is the service() method.
	 * This is used for our business logic and to populate the response that
	 * we send back to the client.
	 */
	
	// KNOW THIS METHOD SIGNATURE
	// The service method takes in 2 arguments: 
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println(this.getServletName() + " SERVICE METHOD CALLED!");
		
		/*
		 * So, in order to create the response to send back to the browser/client, we must WRITE to it
		 * The way that we write to the response is with its own PrintWriter obj.
		 */
		res.setContentType("text/html"); // we are telling the browser what type of content is coming back
		PrintWriter out = res.getWriter(); // Any data written in the Print Writer object is sent back to the browser
		
		out.println("<h1>Hello World!</h1>");
		
		/*
		 * At the end of the service() method, the request and response methods are sent back to the web container
		 */
		
	}
	
	/*
	 * After a long time of not being used, the Web Container will invoke the destroy() method on your Servlet
	 */
	
	public void destroy() {
		System.out.println(this.getServletName() + " DESTROY METHOD CALLED!");
		super.destroy();
	}

}
