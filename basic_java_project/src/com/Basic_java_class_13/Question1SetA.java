package com.Basic_java_class_13;

import java.util.Scanner;

public class Question1SetA {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n terms: ");
		int n=scanner.nextInt();
		System.out.println("Prime numbers: ");
		for(int i=2;i<=n;i++) {
		int result=checkPrime(i);
		if(result!=0) {
			System.out.println(result);
		}
		}
		scanner.close();
	}
	private static int checkPrime(int n) {
		int resultPrime=0;
		if(n==1) {
			resultPrime=1;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				resultPrime=1;
				break;
			}
					
		}
		if(resultPrime==0) {
			return n;
		}
		return 0;
	}
}
