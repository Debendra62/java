package com.Basic_java_class_8;

import java.util.Scanner;

public class ReturnStatementDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int dataInt=scanner.nextInt();
		int sum=sum_1(dataInt);
		System.out.println("The return sum is :"+sum);
		scanner.close();

	}
	public static int sum_1(int num_1) {
		int sum=1;
		sum=sum+num_1;
		return sum;
	}
}
