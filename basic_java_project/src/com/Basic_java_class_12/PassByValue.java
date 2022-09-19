package com.Basic_java_class_12;

public class PassByValue {
    public static void sum(int num1,int num2) {
    	num1=5;
    }
	
	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		System.out.println("Before calling function: "+num1);
		sum(num1,num2);
		System.out.println("After calling function: "+num1);
	}
}
