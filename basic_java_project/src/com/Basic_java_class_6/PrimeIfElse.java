package com.Basic_java_class_6;

import java.util.Scanner;

public class PrimeIfElse {
public static void main(String[] args) {

	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num1=scanner.nextInt();
	int count=0;
	for(int i=2;i<num1;i++) {
		if(num1%i==0) {
			count++;
	}
	}
		if(count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
   scanner.close();
}
}

