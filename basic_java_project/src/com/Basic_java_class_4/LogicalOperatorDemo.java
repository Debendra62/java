package com.Basic_java_class_4;

import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int num1=scanner.nextInt();
		
		System.out.print("Enter 2nd number : ");
		int num2=scanner.nextInt();
		System.out.println();
	
		int sum=num1+num2;
		int sub=num1-num2;
		if((num1>num2) && (num1!=0)) {
			System.out.println("Addition is "+sum);
			
		}
		else {
			System.out.println("Substraction is "+sub);
		}
		
		if((num1>num2) || (num1!=0)) {
			System.out.println("Addition is "+sum);
			
		}
		else {
			System.out.println("Substraction is "+sub);
		
	}
		scanner.close();

}
}	
