package com.Basic_java_class_18;

public class Son extends Father{

	String sname="Dev";
	int sage=21;
	
	public void showSon() {
		System.out.println("Father name is: "+sname);
		System.out.println("Father age is : "+sage);
	}
	
	public static void main(String[] args) {
		
		Son demo=new Son();
		demo.showFather();
		demo.showGrandFather();
		demo.showSon();
	}
}
