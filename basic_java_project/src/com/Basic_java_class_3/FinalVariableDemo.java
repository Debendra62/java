package com.Basic_java_class_3;

// final variable cannot be changed if initilized it will show error if tried to change
public class FinalVariableDemo {

	
	public static void main(String[] args) {
		final  int num1=10;
		System.out.println("The original value of num one is "+num1);
	//	num1=20;
		System.out.println("The new value of num one is "+num1);
	}
}
