package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		
//		this is for connecting to AWS RDS!
//		String url = "jdbc:oracle:thin:@database-2.c0rzi76acgyn.us-east-1.rds.amazonaws.com:1521:FIRSTDB";
//		String username = "admin";
//		String password = "12345678";
		
		// this is for connecting to local DB (on your machine)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "sophia";
		String password = "123";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("Unable to obtain connection to database" + "/n" + e);
		}
		return conn;
	}
}