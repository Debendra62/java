package com.Basic_java_class_19;

public class ChildClass extends ParentClass{

	public void showInfo() {
		System.out.println("From Child class.");
	}
	
	public static void main(String[] args) {
		ChildClass childClass=new ChildClass();
		childClass.showInfo();
		
		ParentClass parentClass=new ChildClass();
		parentClass.showInfo();
	}
}
