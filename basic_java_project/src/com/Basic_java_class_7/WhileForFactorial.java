package com.Basic_java_class_7;

import java.util.Scanner;

public class WhileForFactorial {

public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num_1=scanner.nextInt();
		int i=num_1;
		int fac=1;
		while(i>=1){
			 fac=fac*i;			 
			 i--;
		}
		System.out.println("The factorial of "+num_1+" is "+fac);
			scanner.close();
		}
}
