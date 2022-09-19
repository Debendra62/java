package com.Basic_java_class_14;

public class Student {

	private int rollNo;
	private String name;
	private String address;
	
	public Student(int rollNo,String name,String address) {
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	

	
}
