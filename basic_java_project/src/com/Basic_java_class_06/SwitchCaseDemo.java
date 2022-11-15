package com.Basic_java_class_6;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number between 1 to 7 : ");
		int num1=scanner.nextInt();
		System.out.println("Enter initial amount : ");
		float initialAmount=scanner.nextFloat();
		float finalAmount=0;
		switch(num1) {
		case 1:
			System.out.println("Sunday");
			finalAmount=(float) (initialAmount-0.05*initialAmount);
			System.out.println("Your final amount is "+finalAmount);
			break;
		case 2:
			System.out.println("Monday");
			finalAmount=(float) (initialAmount-0.06*initialAmount);
			System.out.println("Your final amount is "+finalAmount);
			break;
		case 3:
			System.out.println("Tuesday");
			finalAmount=(float) (initialAmount-0.07*initialAmount);
			System.out.println("Your final amount is "+finalAmount);
			break;
		case 4:
			System.out.println("Wednesday");
			finalAmount=(float) (initialAmount-0.08*initialAmount);
			System.out.println("Your final amount is "+finalAmount);
			break;
		case 5:
			System.out.println("Thursday");
			finalAmount=(float) (initialAmount-0.09*initialAmount);
			System.out.println("your final amount is "+finalAmount);
			break;
		case 6:
			System.out.println("Friday");
			finalAmount=(float) (initialAmount-0.1*initialAmount);
			System.out.println("Your final amount is "+finalAmount);
			break;
		case 7:
			System.out.println("Saturday");
			finalAmount=(float) (initialAmount-0.11*initialAmount);
			System.out.println("Your final amount is "+finalAmount);
			break;
		default:
			System.out.println("Invalid input");
		}
		
		scanner.close();
	}
}
