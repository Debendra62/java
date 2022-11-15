package com.Basic_java_class_7;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num_1=scanner.nextInt();
		int i=1;
		do {
			System.out.println(i+" * "+num_1+" = "+i*num_1);
			i++;
		}while(i<=10);
		scanner.close();
	}
}
