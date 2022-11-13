package com.Basic_java_class_18;

public class Daughter extends Father{

	String dname="Gyanina";
	int dage=25;
	
	public void showDaughter() {
		System.out.println("Father name is: "+dname);
		System.out.println("Father age is : "+dage);
	}
	
	
	public static void main(String[] args) {
		
		Daughter demo=new Daughter();
		demo.showFather();
		demo.showGrandFather();
		demo.showDaughter();
	}
}
