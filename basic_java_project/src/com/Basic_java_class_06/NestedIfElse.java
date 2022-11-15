package com.Basic_java_class_6;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Username : ");
		String userName= scanner.nextLine();
		
		System.out.println("Enter the UserPassword: ");
		String userPassword=scanner.nextLine();

		if(userName.contentEquals("") && userPassword.contentEquals("")) {
			System.out.println("Blank input .");
		}
		else {
			
			if(userName.equals("admin") && userPassword.equals("admin")) {
				System.out.println("Username and Userpassword is correct .");
			}
			else {
				System.out.println("Username and Userpassword is not correct .");

			}
		}
		scanner.close();
		}
	}
