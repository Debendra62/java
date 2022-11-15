package com.Basic_java_class_20;

public class Student {

	private int rollNo;
	private String name;
	
	private int num1;
	private int num2;
	
	public Student(int rollNo,String name, int num1,int num2) {
		this.rollNo=rollNo;
		this.name=name;
		this.num1=num1;
		this.num2=num2;
	}
	
	public void displayStudentInfo() {
		System.out.println("RollNo: "+rollNo);
		System.out.println("Name: "+name);
	}
	
	public void displayAdd() {
		System.out.println("The sum is: "+(num1+num2));
	}
}

