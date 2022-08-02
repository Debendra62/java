package com.Basic_java_class_4;

import java.util.Scanner;

public class PraticeAll {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		int a=2;
		int x=4;
		int result1=a*x*x+2*a*x+a*a;
		System.out.println("The result 1 is "+result1);
	
		int result2=x*(a/x+x/a)+a*x*(x%a+a%x);
		System.out.println("The result 2 is "+result2);
		
		System.out.print("Enter user name : ");
		String userName=scanner.nextLine();
		
		System.out.print("Enter user password : ");
		String userPassword=scanner.nextLine();
	
		if(userName.equals("Admin") && userPassword.equals("Admin")) {
			System.out.println("user verified");
		}
		else {
			System.out.println("user not verified");
		}
		
	scanner.close();
	}
}
