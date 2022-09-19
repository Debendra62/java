package com.Basic_java_class_12;

import java.util.Arrays;

public class PassByReference {

	public void showData(int[] data) {
		data[0]=100;
		data[1]=244;
	}
	
	public static void main(String[] args) {
		
		int[] data1= {1,23,45,67};
		PassByReference demo=new PassByReference();
		System.out.println("Before calling function: "+Arrays.toString(data1));
		demo.showData(data1);
		System.out.println("After calling function: "+Arrays.toString(data1));
	}
}
