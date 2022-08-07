package com.Basic_java_class_5;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");

		int num1=scanner.nextInt();
		String data1=num1%2==0?"Even":"Odd";
		System.out.println("Input number is "+data1);	
		
		int num2=num1%2==0?0:1;
		System.out.println("Input number is "+num2);	
		scanner.close();
		
	}
}
