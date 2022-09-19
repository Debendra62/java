package com.Basic_java_class_12;

public class StringDemo {

	public static void main(String[] args) {
		
		String collegeName="Texas";
		// String collegeAddress=new String("Basundhara");
		
		long startCurrentTime=System.currentTimeMillis();
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<100000;i++) {
		buffer.append(collegeName).append(" International College");
		}
		long endCurrentTime=System.currentTimeMillis();
		System.out.println("Time Taken by buffer: "+(endCurrentTime-startCurrentTime));
		
		long startCurrentTime1=System.currentTimeMillis();
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<100000;i++) {
		builder.append(collegeName).append(" International College");
		}
		long endCurrentTime1=System.currentTimeMillis();
		System.out.println("Time Taken by builder: "+(endCurrentTime1-startCurrentTime1));
		
	//	System.out.println("Using buffer:"+buffer.toString());
	//	System.out.println("Using builder: "+builder.toString());

	}
}
