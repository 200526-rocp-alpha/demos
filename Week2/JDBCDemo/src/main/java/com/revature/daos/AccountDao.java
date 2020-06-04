package com.revature.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.Account;

// THE DAO : Data Access Object
// It's a structural design pattern that allows us to isolate the application/
// a.k.a business logic from the persistence layer (relational database) by using
// an API.....

// The JDBC is the API that gives us Classes and Objects to interact with our persistance layer.



// we are creating a concrete DAO to demo functionality and the 5 basic steps of JDBC connection
public class AccountDao {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "sophia";
		String password = "123";
		
		
		// 1. Establish the Connection Object
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			if( conn != null) {
				System.out.println("Congrats you're connected!");
			} else {
				System.out.println("Connection failed");
			}
			
		// 2. Create a Statement Object to send to the database (SQL)
			Statement  statement = conn.createStatement();
			

		// 3. Execute the Statement Object (this object contains the data from the database)	
			ResultSet resultSet = statement.executeQuery("SELECT 'Hello World' FROM account");
			
			
		// 4. Process the Result by iterating through the ResultSet.	
			while(resultSet.next()) {
				String hello = resultSet.getString(1); // CRUD
				System.out.println(hello);
			}
			
		// 5. Close our connections!
			resultSet.close();
			conn.close();
			
			
		} catch (SQLException e) {
			System.out.println("You're connection failed, sorry!");
			e.printStackTrace();
		}
		
	}
	
}
