package com.Basic_java_class_18;

public class AbstractionUseImp1 extends AbstractionUse {

	public void add(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("Sum: "+sum);
	}
	
	public int sub(int num1,int num2) {
		
		int sub=num1-num2;
		return sub;
	}
	
	public static void main(String[] args) {
		
		AbstractionUseImp1 demo=new AbstractionUseImp1();
		demo.add(10,20);
		int result=demo.sub(40,30);
		System.out.println("Sub: "+result);
	}
}
