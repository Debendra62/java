package com.Basic_java_class_6;

import java.util.Scanner;

public class ExampleOfIfElse {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your marks in Math: ");
		float math=scanner.nextFloat();
		System.out.println("Enter your marks in English: ");
		float english= scanner.nextFloat();
		System.out.println("Enter your marks in Java: ");
		float java=scanner.nextFloat();
		System.out.println("Enter your marks in Physics: ");
		float physics=scanner.nextFloat();
		System.out.println("Enter your marks in Chemistry: ");
		float chemistry=scanner.nextFloat();
	
		float total=(math+english+java+physics+chemistry)/500;
		float percentage=total*100;
		System.out.println("Your percentage is "+percentage);
		if(percentage>=80) {
			System.out.println("You secure Distinction.");
		}
		else if(percentage>=60 && percentage<80) {
			System.out.println("You secure First Division.");
		}
		else if(percentage>=50 && percentage<60) {
			System.out.println("You secure Second Division. .");
		}
		else if(percentage>=35 && percentage<50) {
			System.out.println("You  secure Third Division..");
		}
		else {
			System.out.println("Your are  Fail.");

		}
		scanner.close();
	}
}
