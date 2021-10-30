package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTableClass {
	public void create() {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		String sql = "create table Customer_details(cid int,firstname VARCHAR(20),lastname VARCHAR(20),street VARCHAR(20),city VARCHAR(20),state VARCHAR(20),zipcode int,product_name VARCHAR(20),created_on DATE,created_by VARCHAR(20),update_on Date,updated_by VARCHAR(20))";
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms", "abc");
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.executeUpdate();
			System.out.println("Created Table In DataBase");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
