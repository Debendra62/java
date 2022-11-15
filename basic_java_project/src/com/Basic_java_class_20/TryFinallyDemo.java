package com.Basic_java_class_20;

public class TryFinallyDemo {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		try {
			int c=num1/num2;
			System.out.println("c: "+c);
		}catch(Exception e) {
			System.out.println("Message: "+e.getMessage());
		}
		finally {
			System.out.println("Inside finally block....");
		}
	}
}
