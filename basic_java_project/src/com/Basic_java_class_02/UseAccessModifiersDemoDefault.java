package com.Basic_java_class_2;

public class UseAccessModifiersDemoDefault {
	
     public static void main(String[] args) {
		AccessModifiersDemo accessModifiersDemo= new AccessModifiersDemo(10,20,30);
		System.out.println("Value of Public Access Modifiers num2 is: "+accessModifiersDemo.num2);
		System.out.println("Value of Default Access Modifiers num2 is: "+accessModifiersDemo.num3);
		System.out.println("Value of Private Access Modifiers num1 is: "+accessModifiersDemo.getNum1());
        accessModifiersDemo.findSum();
	}
}
