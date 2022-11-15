package com.Basic_java_class_8;

import java.util.Scanner;

public class BreakStatementDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the nth number: ");
		int num_1=scanner.nextInt();
		int i,sum=0;
		int num_2;
		for(i=1;i<=num_1;i++) {
			System.out.println("Enter "+i+"th number :");
			num_2=scanner.nextInt();
			if(num_2<0) {
				break;
			}

			sum=sum+num_2;
		}
		System.out.println("The total sum is "+sum);
		scanner.close();
	}
}
