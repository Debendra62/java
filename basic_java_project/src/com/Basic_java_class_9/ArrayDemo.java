package com.Basic_java_class_9;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] dataInt= {1,2,3,4,5};
		System.out.println("First index: "+dataInt[0]);
		System.out.println("Last index: "+dataInt[dataInt.length-1]);
		
		
		System.out.println(Arrays.toString(dataInt));
		
		
		System.out.println("Using For loop:");
		for(int i=0;i<dataInt.length;i++) {
			System.out.println(dataInt[i]);
		}
 
		System.out.println("Using For each loop: ");
		for(int item: dataInt)
			System.out.println(item);
	}
}
