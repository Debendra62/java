package com.Basic_java_class_2;

public class DataTypeDemo {
	
	
	
	public static void main(String[] args) {
		int num1=2;
		long num2=23L;
		double num3=3.45;
		float num4=5.67f;
		char data1='a';
		String data2="Nepal ";
		boolean flag=true;
		byte data3=3;
		int[] dataArray= {1,2,3,4};
		String[] stringArray={"hello","hi","bye"};
		char[] charArray= {'a','b','c'};
		System.out.println("Data type of num1 is int:"+num1);
		System.out.println("Data type of num2 is long:"+num2);
		System.out.println("Data type of num3 is double:"+num3);
		System.out.println("Data type of num4 is float:"+num4);
		System.out.println("Data type of data1 is char:"+data1);
		System.out.println("Data type of data2 is String:"+data2);
		System.out.println("Data type of flag is boolean:"+flag);
		System.out.println("Data type of data3 is byte:"+data3);
		System.out.println();

for(int i=0;i<dataArray.length;i++) {
	    int data=dataArray[i];
	   System.out.println("Data in array: ["+ i +"]  is "+data);
}
System.out.println();
for(int i=0;i<stringArray.length;i++) {
    String string2=stringArray[i];
   System.out.println("Data in array: ["+ i +"]  is "+string2);
   
}
System.out.println();
for(int i=0;i<charArray.length;i++) {
    char char2=charArray[i];
   System.out.println("Data in array: ["+ i +"]  is "+char2);
}


	}

}