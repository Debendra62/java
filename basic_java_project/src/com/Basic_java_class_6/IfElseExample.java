package com.Basic_java_class_6;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length : ");
		float length=scanner.nextFloat();
		System.out.println("Enter breadth : ");

		float breadth=scanner.nextFloat();

		if(length==breadth) {
			System.out.println("Square");
		}
		else {
			System.out.println("Rectangle");
		}
		scanner.close();
	}
}
