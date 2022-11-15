package com.Basic_java_class_20;

public class HighCohesionDemo {

	public static void main(String[] args) {
		Student2 student2=new Student2();
		student2.setRollNo(5);
		student2.setName("Hari Devkota");
		student2.displayStudent2Info();
		
        Addition addition=new Addition();
        addition.setNum1(5);
        addition.setNum2(10);
        addition.displayAdd2();
	}
}
