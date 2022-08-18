package com.Basic_java_class_7;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter nth term : ");
		int num_1=scanner.nextInt();
		int i=1;
		System.out.println("The odd numbers from 1 to "+num_1+ " are : ");
		do {
			if(i%2==1) {
			System.out.println(i);
			
			}
			i++;
		}while(i<=num_1);
			scanner.close();
		}
}
