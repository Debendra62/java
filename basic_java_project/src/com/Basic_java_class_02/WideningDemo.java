package com.Basic_java_class_2;

public class WideningDemo {
	
public static void main(String[] args) {
	  int num1=2;
	  double num2=num1;
	  System.out.println("Original num1: "+num1);
	  System.out.println("After casting: "+num2);
	  float num3=3.45f;
	  double num4=num3;
	  System.out.println("Float to double: "+num4);
	  long num5=33344L;
	  double num6=num5;
	  System.out.println("Long to double: "+num6);
}
}
