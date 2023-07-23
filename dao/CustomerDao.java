package com.jsp.customer_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.customer_crud_with_prepared.connection.CustomerConnection;
import com.jsp.customer_crud_with_prepared.dto.Customer;

public class CustomerDao {
    Connection connection = CustomerConnection.getCustomerConnection();
    
   /**
    * insert method for customer
    */
    public Customer insertCustomer(Customer customer) {
    	String isertQuery = "insert into customer values(?,?,?,?,?)";
    	 
     try {
		PreparedStatement preparedstatement = 	connection.prepareStatement(isertQuery);
		preparedstatement.setInt(1, customer.getId());
		preparedstatement.setString(2, customer.getName());
		preparedstatement.setString(3, customer.getEmail());
		preparedstatement.setLong(4, customer.getPhone());
		preparedstatement.setString(5, customer.getAddress());
		
		preparedstatement.execute();
		return customer;
	} catch (SQLException  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     return null;
    }
    
    
    
    /***
     * Update method for customer
     */
    public Customer updateCustomerName(Customer customer) {
    	String updateQuery = "update customer set name = ? where id = ?";
    	try {
		PreparedStatement preparedstatement =connection.prepareStatement(updateQuery);
		preparedstatement.setString(1, customer.getName());
		preparedstatement.setInt(2, customer.getId());
		
		preparedstatement.executeUpdate();
		return customer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    public Customer updateCustomerEmail(Customer customer) {
    	String updateQuery = "update customer set email = ? where id = ?";
    	try {
		PreparedStatement preparedstatement =connection.prepareStatement(updateQuery);
		preparedstatement.setString(1, customer.getEmail());
		preparedstatement.setInt(2, customer.getId());
		
		preparedstatement.executeUpdate();
		return customer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    public Customer updateCustomerPhone(Customer customer) {
    	String updateQuery = "update customer set phone = ? where id = ?";
    	try {
		PreparedStatement preparedstatement =connection.prepareStatement(updateQuery);
		preparedstatement.setLong(1, customer.getPhone());
		preparedstatement.setInt(2, customer.getId());
		
		preparedstatement.executeUpdate();
		return customer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    public Customer updateCustomerAddress(Customer customer) {
    	String updateQuery = "update customer set address = ? where id = ?";
    	try {
		PreparedStatement preparedstatement =connection.prepareStatement(updateQuery);
		preparedstatement.setString(1, customer.getAddress());
		preparedstatement.setInt(2, customer.getId());
		
		preparedstatement.executeUpdate();
		return customer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    /**
     * Delete method for customer
     */
    public Customer deleteCustomer(Customer customer) {
    	String deleteQuery = "delete from customer where id = ?";
    	
     try {
		PreparedStatement preparedstatement = connection.prepareStatement(deleteQuery);
		preparedstatement.setInt(1, customer.getId());
		
		preparedstatement.executeUpdate();
		return customer;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     return null;
    }
    
    /**
     * display method for customer
     * @return 
     */
    public void displayCustomer() {
    	String displayQuery = "select * from customer";
    	
    try {
		PreparedStatement preparedstatement = connection.prepareStatement(displayQuery);
	    ResultSet resultset = preparedstatement.executeQuery();
	    while (resultset.next()) {
			int id = resultset.getInt("id");
			String name = resultset.getString("name");
			String email = resultset.getString("email");
			Long phone = resultset.getLong("phone");
			String address = resultset.getString("address");
			
			System.out.println(resultset.next());
			System.out.println("id = "+id);
			System.out.println("name = "+name);
			System.out.println("email = "+email);
			System.out.println("mobile number = "+phone);
			System.out.println("Address of customer is = "+address);
			System.out.println("=================================================================");
		}
	   
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    
}
