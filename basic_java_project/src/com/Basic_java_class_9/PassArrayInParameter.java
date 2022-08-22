package com.Basic_java_class_9;

import java.util.Arrays;
import java.util.Scanner;

public class PassArrayInParameter {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=scanner.nextInt();
		int[] dataInt= new int[n];
		for(int i=0;i<dataInt.length;i++) {
		dataInt[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(dataInt));
		int num1=passArrayInParameter(dataInt);
		System.out.println("The difference of odd sum and even sum is: "+num1);
		scanner.close();
		
	}
	public static int passArrayInParameter(int[] data) {
		int countEven=0,evenSum=0,oddSum=0,countOdd=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]%2==0) {
				countEven=countEven+1;
				evenSum=evenSum+data[i];
			}
			else {
				countOdd=countOdd+1;
				oddSum=oddSum+data[i];
			}
		}
		System.out.println("The total number odd is: "+countOdd);
		System.out.println("The total number odd is: "+oddSum);

		System.out.println("The total number even is: "+countEven);

		return oddSum-evenSum;
	}
}
