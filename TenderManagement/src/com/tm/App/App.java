package com.tm.App;

import java.util.Scanner;

public class App {
	
//	adminLogin form for existing admin login
	public static void adminLoginform() {
		
		AdminSide.adminpanel();
		
	}
	
//	client login form for existing client login
	
	public static void clientLoginform() {
		
		ClientSide.clientpanel();
		
	}
	
//	new User register form 
	
	public static void registeringform() {
		
		UserRegister.registerform();
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		
		System.out.println("WELCOME TO TENDER MANAGEMENT APP");
		
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		
		System.out.println();
		
//		Login / Register system for accessing or manipulating data and Entering into App
		
		System.out.println("1. Admin Login");
		
		System.out.println("2. Client Login");
		
		System.out.println("3. New User ? Register");
		
		System.out.println("4. Exit App");
		
		System.out.println();
		
		System.out.println("Enter your choice (1 or 2 or 3 or 4) :");
		int choice = sc.nextInt();
		
		System.out.println("----------------------------------------");
		System.out.println();
		
		if(choice == 1) {
			
			adminLoginform();
			
		}
		else if(choice == 2) {
			
			clientLoginform();
			
		}
		
		else if( choice == 3) {
			
			registeringform();
			
		}
		
        else if( choice == 4) {
			
			System.out.println("Thank you for visiting!");
			
		}
		
		else {
			
			System.out.println("Please Enter a Valid option");
			App.main(null);
			
		}

	}


}
