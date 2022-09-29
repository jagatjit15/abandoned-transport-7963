package com.tm.App;

import java.util.Scanner;

import com.tm.usecases.AdminRegistrationformUsecase;
import com.tm.usecases.ClientRegistrationUsecases;

public class UserRegister {
	
	public static void registerform() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("You want to register as :");
		
		System.out.println("1. Admin");
		
		System.out.println("2. Client");
		
		System.out.println();
		
		System.out.println("Enter your choice (1 or 2) :");
		int choice  = sc.nextInt();
		
		System.out.println("-----------------------------------");
		
		System.out.println();
		
		if( choice == 1) {
			
			AdminRegistrationformUsecase.admnrForm();
			
			AdminSide.adminpanel();
			
		}
		else if(choice == 2) {
			
			ClientRegistrationUsecases.clientRgtnForm();
			
			ClientSide.clientpanel();
			
		}
		else {
			App.main(null);
		}
		
		
		
	}

}
