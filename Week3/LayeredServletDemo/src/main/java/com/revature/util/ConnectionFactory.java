package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class is intended to act as a Utility class to provide helper methods
 * regarding obtaining connections to our database.
 * 
 * We accomplish that by using the provided interface DriverManager with it's getConnection
 * method.
 * 
 * It requires 3 parameters: the connection string, the username, and the password
 * 
 * There are also a few Exceptions that could occur, so we provide some exception handling for
 * those cases.
 */
public class ConnectionFactory {

	private static Connection conn = null;
	
	// Private constructor PREVENTS us from ever instantiating this class
	// This is fine, since our helper methods are all static, and do not need the instance
	private ConnectionFactory() {
		super();
	}
	
	public static Connection getConnection() {
		
		/*
		 * We will be using DriverManager to obtain our connection to the DB
		 * 
		 * We will need to provide it some credential information:
		 * Connection String: jdbc:oracle:thin:@ENDPOINT:PORT:SID
		 * 		jdbc:oracle:thin:@ENDPOINT:1521:ORCL
		 * username
		 * password
		 */
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			try {
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@database-2.c0rzi76acgyn.us-east-1.rds.amazonaws.com:1521:ORCL",
						"admin",
						"12345678"); // HARD CODED PASSWORD
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			System.out.println("Did not find Oracle JDBC Driver class!");
		}
		
		return conn;
	}
}
