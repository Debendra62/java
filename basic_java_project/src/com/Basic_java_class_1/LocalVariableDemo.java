package com.Basic_java_class_1;

public class LocalVariableDemo {
      LocalVariableDemo(){
    	   int num1=10;
    	   int num2=20;
    	   int sum=0;
    	   int multiply=0;
    	   sum=num1+num2;
    	   multiply=num1*num2;
    	   
    	   System.out.println("Sum of "+num1+" and "+num2+" = "+sum);
    	   System.out.println("Multiply of "+num1+" and "+num2+" = "+multiply);
      }
      
      public void multiplication(int num3,int  num4) {
    	  int mul=0;
    	  mul=num3*num4;
    	  System.out.println("Multiplication of "+num3+" and "+num4+" is "+mul);
      }
      
	public static void main(String[] args) {
		LocalVariableDemo localVariableDemo=new LocalVariableDemo();
		localVariableDemo.multiplication(5,6);
	}
}
