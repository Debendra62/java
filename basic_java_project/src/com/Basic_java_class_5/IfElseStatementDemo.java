package com.Basic_java_class_5;

import java.util.Scanner;

public class IfElseStatementDemo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter you final score");
	int scoree = scanner.nextInt();
	if(scoree>80)
	{
		System.out.println("You are selected for Java Developer :");
	}
	else  
	{
		System.out.println("You are selected for Web Developer");
	}
}
}
