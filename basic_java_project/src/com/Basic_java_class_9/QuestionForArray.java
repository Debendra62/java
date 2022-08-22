package com.Basic_java_class_9;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionForArray {


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
	System.out.println("The value is: "+num1);
	scanner.close();
	
}
public static int passArrayInParameter(int[] data) {
	for(int i;i<=data.length;i++) {
	if(data.length%2==0) {
		return 0;
	}
	else if(data.length) {
		return 1;
	}
	}
}
}
