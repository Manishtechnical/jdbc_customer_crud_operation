package com.jsp.customer_crud_with_prepared.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerConnection {
 public static Connection getCustomerConnection() {
	 try {
		//load/register Driver
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		//create connection
		 String url = "jdbc:mysql://localhost:3306/manish";
		 String user = "root";
		 String pass = "12345678";
		 
		Connection connection = DriverManager.getConnection(url, user, pass); 
		return connection;
	} catch (ClassNotFoundException | SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 return null;
	 
 }
}
