package com.tm.usecases;

import java.util.Scanner;

import com.tm.beans.AdminData;

public class AdminRegistrationformUsecase {
	
	
	public static void admnrForm() {
		
//		Taking input / data from user
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("Enter your details to register with us");
		
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		
		System.out.println();
		
		
//		Uid -> unique registration id will generate diferently for every user
		
		System.out.println("Enetr  2 or 3 alphabet from random position of your name and last 2 digit of your number no space");
		String admin_uid = "tm"+sc.next()+"app";
		
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
		
		System.out.println("Enter your organization");
		String organization = sc.next();
		
		System.out.println("Enter your country");
	    String country = sc.next();
		
	    System.out.println("Enter your state");
		String state = sc.next();
		
		
//		creating AdminData object and set the values to constructor of AdminData Bean class
		
		
		AdminData admindata = new AdminData();
		
		admindata.setAdmin_uid(admin_uid);
		admindata.setName(name);
		admindata.setEmail(email);
		admindata.setMobile(mobile);
		admindata.setOrganization(organization);
		admindata.setPassword(password);
		admindata.setState(state);
		admindata.setCountry(country);
		
		
		System.out.println(admindata);
		
		
	}
	
	
	
	

}
