package com.Basic_java_class_9;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		
Scanner scanner=new Scanner(System.in);
		
    //Taking input from user
		System.out.println("Enter the size of array: ");
		int n=scanner.nextInt();
		int[] dataInt= new int[n];
		for(int i=0;i<dataInt.length;i++) {
		dataInt[i]=scanner.nextInt();
		}
		System.out.println("Before Sorting: "+Arrays.toString(dataInt));
		
	// Sorting arrays using for and if 
		int temp=0;
		for(int i=0;i<dataInt.length;i++) {
			for(int j=i+1;j<dataInt.length;j++) {
				if(dataInt[j]<dataInt[i]) {
					temp=dataInt[i];
					dataInt[i]=dataInt[j];
					dataInt[j]=temp;
				}
			}

		}
		System.out.println("After shorting: "+Arrays.toString(dataInt));
		
		// Sorting array using sort function
		Arrays.sort(dataInt);
		System.out.println("After shorting: "+Arrays.toString(dataInt));

       scanner.close();
	}
}
