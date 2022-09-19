package com.Basic_java_class_12;

public class CompareToUse {

	public static void main(String[] args) {
		
		String data1="Texas";
		String data2="Texas";
		
		System.out.println(data1.compareTo(data2));
		
		if(data1.compareTo(data2)==0) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Fail");
		}
	}
}
