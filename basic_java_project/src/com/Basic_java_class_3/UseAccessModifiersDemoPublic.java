package com.Basic_java_class_3;

import com.Basic_java_class_2.AccessModifiersDemo;

public class UseAccessModifiersDemoPublic {

	public static void main(String[] args) {
		AccessModifiersDemo accessModifiersDemo=new AccessModifiersDemo(10,20,30);
		System.out.println("The value of Public Access Modifiers num2 is "+ accessModifiersDemo.num2);
		System.out.println("Value of Private Access Modifiers num1 is "+accessModifiersDemo.getNum1());
        
	}
}
