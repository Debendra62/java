package com.Basic_java_class_4;

import java.util.Scanner;

public class TakeUserInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num1=scanner.nextInt();
		System.out.println("Entered number is : "+num1);
		System.out.println();
		
       System.out.print("Enter decimal number : ");
       double num2= scanner.nextDouble();
       System.out.println("Entered number is : "+num2);
       System.out.println();
       
		System.out.print("Enter a boolean value : ");
		boolean num3=scanner.nextBoolean();
		System.out.println("Entered boolean is : "+num3);
		System.out.println();
		
		scanner.nextLine();
		System.out.print("Enter a String : ");
		String data1=scanner.nextLine();
		System.out.println("Entered string is : "+data1);
		System.out.println();
		
		scanner.close();

	}
	
}
