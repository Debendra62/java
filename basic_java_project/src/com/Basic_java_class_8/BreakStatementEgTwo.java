package com.Basic_java_class_8;

import java.util.Scanner;

public class BreakStatementEgTwo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int num_1=scanner.nextInt();
		int i;
		String result=" ";
		
		for(i=1;i<=num_1;i++) {
			System.out.println("Enter a animal: ");
			String data_1=scanner.next();
			result=result + data_1 + " , ";

			if(data_1.length()<2) {
				break;
			}
		}
		System.out.println("("+result+")");
        scanner.close();
	}
}
