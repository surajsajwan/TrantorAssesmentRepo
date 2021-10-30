package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTableClass {
public void drop()  {
	Connection connection=null;
	Statement createStatement=null;
	String sql="drop table Customer_details";
	try {
		 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms", "abc");
		  createStatement = connection.createStatement();
		  createStatement.executeUpdate(sql);
		  System.out.println("Table Dropped Successfully");
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			createStatement.close();
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
