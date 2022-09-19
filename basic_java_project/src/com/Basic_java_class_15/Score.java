package com.Basic_java_class_15;

public class Score {

	private double gpa;
	private Student student;
	
	public Score(Student student,double gpa) {
		this.student=student;
		this.gpa=gpa;
	}
	
	public void showStudentInfo() {
	     student.showStudent();
	     System.out.println("GPA: "+gpa);
	}
	
}
