package com.Basic_java_class_9;

import java.util.Arrays;
import java.util.Scanner;

public class TakeInputFromUserArray {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=scanner.nextInt();
		int[] dataInt= new int[n];
		for(int i=0;i<dataInt.length;i++) {
		dataInt[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(dataInt));
		scanner.close();
	}	
}
