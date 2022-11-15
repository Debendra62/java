package com.Basic_java_class_6;

import java.util.Scanner;

public class CheckingVowelExample {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String data1=scanner.nextLine().toLowerCase();
	
		char data2=data1.charAt(0);
		if(data2=='a' || data2=='e' || data2=='i' || data2=='o' || data2=='u') {
			System.out.println("First letter is vowel. ");
		}
		else {
			System.out.println("First letter is not vowel.");
		}
	  scanner.close();
	  
	}
}
