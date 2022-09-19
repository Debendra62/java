package com.Basic_java_class_14;

public class RecursionUsingMethod {
    
	static int sum=0;
	public  void addNum(int n) {
		if(n>0) {
             sum=sum+n;
             n=n-1;
             addNum(n);
		}
	}
	
	public static void main(String[] args) {
       RecursionUsingMethod demo=new RecursionUsingMethod();
       demo.addNum(100);
		System.out.println("Sum:"+sum);
		
	}
}
