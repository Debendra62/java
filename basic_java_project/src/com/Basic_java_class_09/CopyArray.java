package com.Basic_java_class_9;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=scanner.nextInt();
		int[] dataInt= new int[n];
		int[] dataIntCopy= new int[n];
		for(int i=0;i<dataInt.length;i++) {
		dataInt[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(dataInt));
		
		for(int i=0;i<dataInt.length;i++) {
			dataIntCopy[i]=dataInt[i];
		}
		System.out.println("After copying: "+Arrays.toString(dataIntCopy));
     scanner.close();
	}
}
