package com.Basic_java_class_3;

public class AbstractDemoUse extends AbstractDemo {

	public  void mul(int num1,int num2) {
	   int mul1=num1*num2;
	   System.out.println("Multiplication of  "+num1+" and "+num2+ " is "+mul1);
	}
	
	public int sub(int num1,int num2) {
		return num1-num2;
		
	}
	
	public static void main(String[] args) {
		AbstractDemoUse abstractDemoUse=new AbstractDemoUse();
		abstractDemoUse.mul(10,20);
		System.out.println("Substraction of 50 and 40 is "+abstractDemoUse.sub(50,40));
		abstractDemoUse.sum(10,20);
	}
}
