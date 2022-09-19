package com.Basic_java_class_15;

public class Student {

	private int rollNo;
	private String name;
	private String address;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String string) {
		this.address = string;
	}
	
	public void showStudent() {
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("RollNo : "+rollNo);
	}
}
