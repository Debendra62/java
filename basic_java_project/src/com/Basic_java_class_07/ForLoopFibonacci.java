package com.Basic_java_class_7;

import java.util.Scanner;

public class ForLoopFibonacci {

	public static void main(String[] args) {

		    try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter a number : ");
				int num_1 = scanner.nextInt();
				int i;
				int a = 0, b = 1, c ;
				for (i = 1; i <= num_1; i++) {
					System.out.println(a);
					c = a + b;
					a = b;
					b = c;

				}
				
				scanner.close();
			}
		}
	}


