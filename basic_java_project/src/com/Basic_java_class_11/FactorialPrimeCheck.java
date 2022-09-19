package com.Basic_java_class_11;

import java.util.Scanner;

public class FactorialPrimeCheck {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num_1=scanner.nextInt();
		int countNum=0;
		for(int i=num_1;i>1;i--) {
			for(int j=i;j>1;j--) {
				if(i%j==0) {
					countNum=countNum+1;
				}
			}
			
		}
		System.out.println(countNum);
	}
}
