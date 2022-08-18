package com.Basic_java_class_7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num_1=scanner.nextInt();
		int i=0;
		while(i<=num_1){
			 if(i%2==0) {
				 System.out.println(i);
			 }
			i++;
		}
			scanner.close();
		}
}
