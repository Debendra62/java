package com.Basic_java_class_8;

import java.util.Scanner;

public class ContinueStatementDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int num_1=scanner.nextInt();
		int sum=0;
		for(int i=1;i<=num_1;i++) {
			System.out.println("Enter the value: ");
			int num_2=scanner.nextInt();
			if(num_2%2==1) {
				continue;
			}
			sum=sum+num_2;
		}
		System.out.println("The sum is : "+sum);
		scanner.close();
	}
}
