package com.Basic_java_class_5;

import java.util.Scanner;

public class IfStatementDemo {
	


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=scanner.nextInt();
		System.out.println("Enter second number : ");
		int num2=scanner.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+ " is greater than "+num2);
		}
		
		if(num2>num1) {
			System.out.println(num2+ " is greater than "+num1);
		}
	
		scanner.nextLine();
		System.out.print("Enter a String : ");
		String gender=scanner.nextLine();
		
		boolean result = checkGender(gender);		
		System.out.println(result);
		scanner.close();
	}
	
	private static boolean checkGender(String gender) {
		boolean genderResult=false;
		
		if(gender.equals("Male")) {
           System.out.println("Male");
           return genderResult=true;
	     }
		System.out.println("Female");
		return genderResult;
	}
}
