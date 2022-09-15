package com.Basic_java_class_13;

public class Question3SetB {

	public static void main(String[] args) {
		
		int[] a= {1,3,6,13};
		int result=isPower(a);
		System.out.println(result);
	}
	private static int isPower(int[] a) {
		for(int i=1;i<a.length;i++) {
			int num=a[i];
			int sum=0;
			for(int j=0;j<i;j++) {
				sum=sum+a[j];
				if(sum>num) {
					return 0;
				}
			}
		}
		return 1;
	}
}
