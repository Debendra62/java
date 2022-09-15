package com.Basic_java_class_13;

import java.util.Scanner;

public class Question3SetA {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		int[] a= {3,-2,-1};
		double x=2.0;
		double sum=0.0;
		for(int i=0;i<a.length;i++) {		
		   sum=sum+a[i]*powerSet(x,i);
		}
		System.out.println(sum);
		scanner.close();
				
	}
	private static double powerSet(double b,int p) {
		double n=1;
		for(int i=1;i<=p;i++) {
			n=b*n;
		}
		return n;
	}
}
