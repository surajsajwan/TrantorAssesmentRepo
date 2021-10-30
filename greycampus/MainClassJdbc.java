package com.greycampus;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClassJdbc {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which opration to perform"
				+ "1:Insert Values to Table  2:Update record to table  3:Retrieve record to table  4:Delete record from table  5:Create table in Database   6:Drop table");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter customer id");
			int cid = sc.nextInt();
			System.out.println("Enter Firstname of customer");
			String firstname = sc.next();
			System.out.println("Enter lastname of customer");
			String lastname = sc.next();
			System.out.println("Enter street of customer");
			String street = sc.next();
			System.out.println("Enter City of customer");
			String city = sc.next();
			System.out.println("Enter state of customer");
			String state = sc.next();
			System.out.println("Enter zipcode of customer");
			int zipcode = sc.nextInt();
			System.out.println("Enter product name of customer");
			String product_name = sc.next();
			System.out.println("Enter name of user who is creating this record");
			String created_by = sc.next();
			GetterSetterEmployee gs = new GetterSetterEmployee();
			gs.setCid(cid);
			gs.setFirstname(firstname);
			gs.setLastname(lastname);
			gs.setStreet(street);
			gs.setCity(city);
			gs.setState(state);
			gs.setZipcode(zipcode);
			gs.setProduct_name(product_name);
			gs.setCreated_by(created_by);
			InserValueToTableClass inserValueToTableClass = new InserValueToTableClass();
			inserValueToTableClass.insert(gs);
			break;
		}
		case 2: {
			System.out.println("Enter Product_name which has to be updated");
			String product_name = sc.next();
			System.out.println("Enter Your name who is updating it");
			String updated_by = sc.next();
			System.out.println("Enter Customer id whose values is to be updated");
			int cid = sc.nextInt();
			GetterSetterEmployee getterSetterEmployee = new GetterSetterEmployee();
			getterSetterEmployee.setProduct_name(product_name);
			getterSetterEmployee.setUpdated_by(updated_by);
			getterSetterEmployee.setCid(cid);
			UpdateJdbcClass updateJdbcClass = new UpdateJdbcClass();
			updateJdbcClass.update(getterSetterEmployee);
			break;
		}
		case 3: {
			RetrieveDataClass retrieveDataClass = new RetrieveDataClass();
			ArrayList<GetterSetterEmployee> ral = retrieveDataClass.Retrieve();
			ral.forEach(a -> {
				System.out.println(a.getCid());
				System.out.println(a.getFirstname());
				System.out.println(a.getLastname());
				System.out.println(a.getStreet());
				System.out.println(a.getCity());
				System.out.println(a.getState());
				System.out.println(a.getZipcode());
				System.out.println(a.getProduct_name());
				System.out.println(a.getCreated_on());
				System.out.println(a.getCreated_by());
				System.out.println(a.getUpdate_on());
				System.out.println(a.getUpdated_by());

			});
			break;
		}
		case 4: {
			System.out.println("Enter cid whose record is to deleted");
			int cid = sc.nextInt();
			GetterSetterEmployee getterSetterEmployee = new GetterSetterEmployee();
			getterSetterEmployee.setCid(cid);
			DeleteRecordClass deleteRecordClass = new DeleteRecordClass();
			deleteRecordClass.delete(getterSetterEmployee);
			break;
		}
		case 5: {
			CreateTableClass createTableClass = new CreateTableClass();
			createTableClass.create();
			break;
		}
		case 6: {
        DropTableClass dropTableClass = new DropTableClass();
        dropTableClass.drop();
        break;
		}

		default:
			System.out.println("Choice not Matched");
		}
	}

}
