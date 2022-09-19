package com.Basic_java_class_15;

public class StudentScore {

	public static void main(String[] args) {
		Student student=new Student();
		student.setRollNo(1);
		student.setName("Shyam Dahal");
		student.setAddress("Basundhara");
		
		Score score=new Score(student, 3.45);
		score.showStudentInfo();
	}
}
