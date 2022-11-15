package com.Basic_java_class_19;

public class BuiltInExceptionCheckedException {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		try {
			System.out.println("Before Exception Occurs: ");
			Class.forName("texas");
			System.out.println("After Exception Occurs: ");
		}
		catch(Exception e){
			int c=a+b;
			System.out.println(c);
		}
	}
}