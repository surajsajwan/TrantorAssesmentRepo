package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RetrieveDataClass {
    public ArrayList<GetterSetterEmployee> Retrieve(){
    	Connection connection=null;
    	 Statement createStatement =null;
    	 ResultSet rs =null;
    	 ArrayList<GetterSetterEmployee> arl = new ArrayList<GetterSetterEmployee>();
    	try {
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms", "abc");
			 createStatement = connection.createStatement();
			  rs = createStatement.executeQuery("select * from Customer_details");
			 while (rs.next()) {
				GetterSetterEmployee gs = new GetterSetterEmployee();
				gs.setCid(rs.getInt("cid"));
				gs.setFirstname(rs.getString("firstname"));
				gs.setLastname(rs.getString("lastname"));
				gs.setStreet(rs.getString("street"));
				gs.setCity(rs.getString("city"));
				gs.setState(rs.getString("state"));
				gs.setZipcode(rs.getInt("zipcode"));
				gs.setProduct_name(rs.getString("product_name"));
				gs.setCreated_on(rs.getDate("created_on"));
				gs.setCreated_by(rs.getString("created_by"));
				gs.setUpdate_on(rs.getDate("update_on"));
				gs.setUpdated_by(rs.getString("updated_by"));
				arl.add(gs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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
    	return arl;
    }
}
