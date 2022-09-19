package com.Basic_java_class_11;

import java.util.Scanner;
import java.util.Arrays;

public class CheckFibonacci {

	
		public static void main(String[] args) 
		{
			int n ;
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter a number : ");
			n =scanner.nextInt();
			int result =fiboCheck(n);
			System.out.println("Result:"+res);
			
		}
		
		private static int fiboCheck(int n) {
			
			int a =0 ;
			int b =1 ;
			int c =1 ;
			
			result[0] = a;
			result[1] = b;
			
			for(int i=2;i<n;i++)
			{
				c=a+b;
				result[i] = c;
				a=b;
				b=c;
			}
			System.out.println(Arrays.toString(result));
			
	}
	}
