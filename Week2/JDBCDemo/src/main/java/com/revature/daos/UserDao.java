package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;
import com.revature.utils.ConnectionFactory;

public class UserDao implements DAO<User, Integer> {
	
	// what are the classes and interfaces of the JDBC API
	
	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		try(Connection conn = ConnectionFactory.getConnection()) {
			String sql = "SELECT * FROM user_table";
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				User temp = new User();
				temp.setUserId(resultSet.getInt("user_id"));
				// ...and so on (similar to the findAll() method within AccountDao.
				
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User create(User obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
