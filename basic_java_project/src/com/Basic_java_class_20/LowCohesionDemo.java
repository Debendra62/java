package com.Basic_java_class_20;

public class LowCohesionDemo {

	public static void main(String[] args) {
		Student student=new Student(1, "Ram Pandey",10,20);
		student.displayStudentInfo();
		
		student.displayAdd();
	}
}
