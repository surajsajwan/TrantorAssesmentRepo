package com.greycampus;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class UpdateJdbcClass {
	public void update(GetterSetterEmployee obj) {
		java.util.Date date = new java.util.Date();
		java.sql.Date d = new java.sql.Date(date.getTime());
		Date currentdate = d;
		Connection connection = null;
		String sql = "update Customer_details set product_name=?,update_on=?,updated_by=? where cid=?";
		PreparedStatement prepareStatement = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms", "abc");
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, obj.getProduct_name());
			prepareStatement.setDate(2, currentdate);
			prepareStatement.setString(3, obj.getUpdated_by());
			prepareStatement.setInt(4, obj.getCid());
			int count = prepareStatement.executeUpdate();
			System.out.println("Updated" + count + "Records in Customer_details");
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
