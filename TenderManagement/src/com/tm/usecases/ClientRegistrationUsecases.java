package com.tm.usecases;

import java.util.Scanner;

import com.tm.beans.ClientsData;
import com.tm.dao.ClientDaoImple;
import com.tm.dao.ClientsDao;
import com.tm.exceptions.LoginException;

public class ClientRegistrationUsecases {
	
	public static void clientRgtnForm() {
		
		
//		Taking input / data from user
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("Enter your details to register with us");
		
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		
		System.out.println();
		
		System.out.println(" Enetr 2 or 3 alphabet from random position of your name and 2 number");
		String client_uid = "tm"+sc.next()+"app";
		
		System.out.println("Enter your firstName");
		String fname = sc.next();
		
		System.out.println("Enter your lastName");
		String lname = sc.next();
		
		String name = fname+" "+lname;

		System.out.println("Enter your email");
		String email = sc.next();
		
		System.out.println("Enter your mobile number");
		String mobile = sc.next();
		
		System.out.println("Enter your password");
		String password = sc.next();
		
		System.out.println("Enter your country");
	    String country = sc.next();
		
		
//		creating AdminData object and set the values to constructor of AdminData Bean class
		
		
		ClientsData clientdata = new ClientsData();
		
		clientdata.setClient_uid(client_uid);
		clientdata.setClient_name(name);
		clientdata.setClient_email(email);
		clientdata.setClient_mobile(mobile);
		clientdata.setClient_password(password);
		clientdata.setCountry(country);
		
		
		ClientsDao dao = new ClientDaoImple();
		
		try {
			
			ClientsData data = dao.ClientRegistrationForm(clientdata);
			
			if(data != null) {
				
				System.out.println();
				System.out.println("Welcome "+data.getClient_name());
				System.out.println("Your UserId : "+data.getClient_uid());
				System.out.println("Your password : "+data.getClient_password());
				System.out.println();
				
			}
			
		} catch (LoginException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
		
	}

}
