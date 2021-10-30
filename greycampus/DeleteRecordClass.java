package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecordClass {
public void delete(GetterSetterEmployee obj) {
	Connection connection=null;
	String sql="delete from Customer_details where cid=?";
	PreparedStatement prepareStatement=null;
	try {
	connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms", "abc");
	 prepareStatement = connection.prepareStatement(sql);
	 prepareStatement.setInt(1,obj.getCid());
	 int count = prepareStatement.executeUpdate();
	 System.out.println("Deleted"+count+"Records from Customer_details Table");
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
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
