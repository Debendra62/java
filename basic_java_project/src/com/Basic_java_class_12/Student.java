package com.Basic_java_class_12;

public class Student {

	private String firstName="Ram";
	private String lastName="Pandey";
	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public static void main(String[] args) {
		Student student=new Student();
		System.out.println(student);
		
	}
}
