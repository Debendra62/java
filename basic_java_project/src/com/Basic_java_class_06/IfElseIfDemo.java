package com.Basic_java_class_6;

import java.util.Scanner;

public class IfElseIfDemo {
 
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your percentage: ");
	int score=scanner.nextInt();
	if(score>=80) {
		System.out.println("You secure Distinction.");
	}
	else if(score>=60 && score<80) {
		System.out.println("You secure First Division.");
	}
	else if(score>=50 && score<60) {
		System.out.println("You secure Second Division. .");
	}
	else if(score>=35 && score<50) {
		System.out.println("You  secure Third Division..");
	}
	else {
		System.out.println("Your are  Fail.");

	}
	scanner.close();
	}
}
