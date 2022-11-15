package com.Basic_java_class_20;

public class Student2 {

	private int rollNo;
	private String name;
	
	
	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void displayStudent2Info() {
		System.out.println("RollNo: "+rollNo);
		System.out.println("Name: "+name);
	}
}
