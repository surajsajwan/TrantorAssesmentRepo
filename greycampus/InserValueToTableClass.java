package com.greycampus;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserValueToTableClass {
	public void insert(GetterSetterEmployee obj) {
		java.util.Date date = new java.util.Date();
		java.sql.Date d = new java.sql.Date(date.getTime());
		Date currentdate = d;
		Connection connection = null;
		String sql = "insert into Customer_details values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement prepareStatement = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms", "abc");
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, obj.getCid());
			prepareStatement.setString(2, obj.getFirstname());
			prepareStatement.setString(3, obj.getLastname());
			prepareStatement.setString(4, obj.getStreet());
			prepareStatement.setString(5, obj.getCity());
			prepareStatement.setString(6, obj.getState());
			prepareStatement.setInt(7, obj.getZipcode());
			prepareStatement.setString(8, obj.getProduct_name());
			prepareStatement.setDate(9, currentdate);
			prepareStatement.setString(10, obj.getCreated_by());
			prepareStatement.setDate(11, null);
			prepareStatement.setString(12, null);
			int count = prepareStatement.executeUpdate();
			System.out.println("Inserted" + count + "Record in Customer_details table");
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
