package com.Basic_java_class_4;

import java.util.Scanner;

public class ArthemeticOperatorDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num1=scanner.nextInt();
		
		
		System.out.print("Enter a number : ");
		int num2=scanner.nextInt();
		System.out.println();
		
		int add=num1+num2;
		int sub=num1-num2;
		float div=(float)num1/num2;
		int mul=num1*num2;
		int mod=num1%num2;
		System.out.println("Addition of "+num1+" and "+num2+" is "+add);
		System.out.println("Substraction of "+num1+" and "+num2+" is "+sub);
		System.out.println("Division of "+num1+" and "+num2+" is "+div);
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+mul);
		System.out.println("Modules of "+num1+" and "+num2+" is "+mod);

		
		scanner.close();

	}
}
