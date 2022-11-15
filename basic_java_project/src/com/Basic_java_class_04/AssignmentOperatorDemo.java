package com.Basic_java_class_4;

import java.util.Scanner;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		
	    Scanner scanner=new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int num1=scanner.nextInt();
		
		System.out.print("Enter 2nd number : ");
		int num2=scanner.nextInt();
		System.out.println();
   	
		num1+=num2;
		System.out.println("Addition is "+num1);
	
		num1-=num2;
		System.out.println("Subtraction is "+num1);
		
		num1*=num2;
		System.out.println("Multiplication is "+num1);
		
		num1%=num2;
		System.out.println("Modules is "+num1);
	   System.out.println();
		
		System.out.print("Enter 3rd number  : ");
		float num3=scanner.nextInt();
		System.out.print("Enter 4th number : ");
		float num4=scanner.nextInt();
	    num3/= (float) num4;
		System.out.println("Division is "+num3);
	
		scanner.close();


	}
}
