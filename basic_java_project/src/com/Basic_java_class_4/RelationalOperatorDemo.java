package com.Basic_java_class_4;

import java.util.Scanner;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int num1=scanner.nextInt();
		
		System.out.print("Enter 2nd number : ");
		int num2=scanner.nextInt();
		System.out.println();
	
		if(num1==num2) {
			System.out.println(num1+" is equal to "+num2);
			}
		else {
			System.out.println(num1+" is not equal to "+num2);		
			}
		
		if(num1!=num2) {
			System.out.println(num1+" is not equal to "+num2);		
		}
		else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}
		else {
			System.out.println(num1+" is not greater than "+num2);
		}
		
		if(num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		}
		else {
			System.out.println(num1+" is not smaller than "+num2);
		}
		
		if(num1>=num2) {
			System.out.println(num1+" is greater or equal to "+num2);
		}
		else {
			System.out.println(num1+" is not greater or equal to "+num2);
		}
		
		if(num1<=num2) {
			System.out.println(num1+" is smaller or equal to "+num2);
		}
		else {
			System.out.println(num1+" is not smaller or equal to "+num2);
		}
		scanner.close();

	}
}
