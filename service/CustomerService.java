package com.jsp.customer_crud_with_prepared.service;

import com.jsp.customer_crud_with_prepared.dao.CustomerDao;
import com.jsp.customer_crud_with_prepared.dto.Customer;

public class CustomerService {
  CustomerDao customerdao = new CustomerDao();
  
  public Customer insertCustomerService(Customer customer) {
	  System.out.println("Service method started !!");
	  if(customer.getId()<= 9999)
	  {
		  Customer customer1 = customerdao.insertCustomer(customer);
		  System.out.println("Service method ended");
		  return customer1;
	  }
	  else
	  {
		  System.err.println("Please pass 4 digit id or less than 4 digit");
	  }
	  return null;
  }
  
  public Customer udateCustomerService1(Customer customer) {
	  System.out.println("Service1 method started !!");
	  if(customer.getName().length()<= 16) {
	  Customer customer1 = customerdao.updateCustomerName(customer);
	  System.out.println("Service1 method ended");
	  return customer1;
	  }
	  else
	  {
		  System.err.println("Please Eneter valid name !!");
	  }
	  return null;
  }
  public Customer udateCustomerService2(Customer customer) {
	  System.out.println("Service2 method started !!");
	  Customer customer1 = customerdao.updateCustomerEmail(customer);
	  System.out.println("Service2 method ended");
	  return customer1;
  }
  
  public Customer udateCustomerService3(Customer customer) {
	  System.out.println("Service3 method started !!");
	  if(customer.getPhone().SIZE == 10)
	  {
		  Customer customer1 = customerdao.updateCustomerPhone(customer);
		  System.out.println("Service3 method ended");
		  return customer1;
	  }
	  else
	  {
		  System.err.println("Please Enter the valid Phone Number !!");
	  }
	  return null;
  }
  
  public Customer udateCustomerService4(Customer customer) {
	  System.out.println("Service4 method started !!");
	  if(customer.getAddress().length() <=20)
	  {
		  Customer customer1 = customerdao.updateCustomerAddress(customer);
		  System.out.println("Service4 method ended");
		  return customer1;
	  }
	  else
	  {
		  System.err.println("Please Enter the valid Address must be contain only 20 character !!");
	  }
	  return null;
  }
  
  public Customer deleteCustomerService(Customer customer) {
	  System.out.println("Service method started !!");
	  Customer customer1 = customerdao.deleteCustomer(customer);
	  System.out.println("Service method ended");
	  return customer1;
  }
  
  public void displayCustomerService() {
	  System.out.println("Service method started !!");
	  customerdao.displayCustomer();
	  System.out.println("Service method ended");
	  
  }
}
