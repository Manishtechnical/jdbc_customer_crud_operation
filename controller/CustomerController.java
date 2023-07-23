package com.jsp.customer_crud_with_prepared.controller;

import java.util.Scanner;

import com.jsp.customer_crud_with_prepared.dao.CustomerDao;
import com.jsp.customer_crud_with_prepared.dto.Customer;
import com.jsp.customer_crud_with_prepared.service.CustomerService;

public class CustomerController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("main method started");
		 Customer customer = null;
		 CustomerService customerservice = new CustomerService();
		 System.out.println("main method ended");
		 System.out.println("1. Insert\n2. Update\n3. Delete\n4. Display ");
		 System.out.println("enter your option");
		 int ch = scanner.nextInt();
		 switch (ch) {
		case 1:
		{
			System.out.println("Enter customer id");
			int id = scanner.nextInt();
			System.out.println("Enter customer name");
			String name = scanner.next();
			System.out.println("Enter customer email");
			String email = scanner.next();
			System.out.println("Enter customer phone");
			long phone = scanner.nextLong();
			System.out.println("Enter customer Address");
			String address = scanner.next();
			customer  = new Customer(id, name, email, phone, address);
			customerservice.insertCustomerService(customer);
		}
			break;
		case 2:
		{
			 System.out.println("1. Name\n2. Email\n3. Phone\n4. Address ");
			 System.out.println("enter your option");
			 int x = scanner.nextInt();
			switch (x) {
			case 1:
			{
				System.out.println("Enter customer id");
				int id = scanner.nextInt();
				System.out.println("Enter customer name");
				String name = scanner.next();	
				customer  = new Customer(id , name , null, null, null);
				customerservice.udateCustomerService1(customer);
			}
				break;
			case 2:
			{
				System.out.println("Enter customer id");
				int id = scanner.nextInt();
				System.out.println("Enter customer email");
				String email = scanner.next();	
				customer  = new Customer(id , null , email, null, null);
				customerservice.udateCustomerService2(customer);
			}
				break;
		case 3:
		{
			System.out.println("Enter customer id");
			int id = scanner.nextInt();
			System.out.println("Enter customer name");
			Long phone = scanner.nextLong();	
			customer  = new Customer(id , null , null, phone, null);
			customerservice.udateCustomerService3(customer);
		}
			break;
			case 4:
			{
				System.out.println("Enter customer id");
				int id = scanner.nextInt();
				System.out.println("Enter customer name");
				String address = scanner.next();	
				customer  = new Customer(id , null , null, null, address);
				customerservice.udateCustomerService4(customer);
			}
				break;

			default:
				break;
			}
		}
		break;
		
		case 3:
		{
			System.out.println("Enter customer id");
			int id = scanner.nextInt();
			customer  = new Customer(id , null , null, null, null);
			customerservice.deleteCustomerService(customer);
		}
		break;
		
		case 4:
		{
			
			customerservice.displayCustomerService();
		}
		break;


		default:
			break;
		}
	}
}
