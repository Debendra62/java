package com.Basic_java_class_17;

public class Son extends Father{

	double sonIncome=45000;
	
	public void showSonIncome() {
		System.out.println("Son income: "+sonIncome);
	}
	
	public static void main(String[] args) {
		
		Son son=new Son();
		
		son.showFatherIncome();
		son.showGrandFather();
		son.showSonIncome(); 
		son.familyIncome=son.grandFatherIncome+son.fatherIncome+son.sonIncome;
		System.out.println("Total Family Income: "+son.familyIncome);
	}
}
