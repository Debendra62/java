package com.Basic_java_class_3;

public class StaticNonAccessModifiersDemo {
public static int num1=4;

public static void setMethod() {
	num1=50;	
}

public static int getMethod() {
	return num1;
	
}

public static void main(String[] args) {
	System.out.println("Original value is "+StaticNonAccessModifiersDemo.num1);
	StaticNonAccessModifiersDemo.setMethod();
	System.out.println("The final value is " +StaticNonAccessModifiersDemo.getMethod());
	
}

}
