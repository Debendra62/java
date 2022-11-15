package com.Basic_java_class_2;

public class AdvancedCastingDemo {

	  public static void main(String[] args) {
		  String data1="12345";
		  int resdata1=Integer.parseInt(data1);
		  System.out.println("string to int is "+resdata1);
		  
		  String data2="12345.6789";
		  double resdata2=Double.parseDouble(data2);
		  System.out.println("string to double is "+resdata2);
		  
		  double data3=12345.6789;
		  String resData3=String.valueOf(data3);
		  System.out.println("Double to string is "+resData3);
	}
}
