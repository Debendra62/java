package com.Basic_java_class_17;

public class TwoWheleer extends Vehicle{

	double baseIncrement=120;
	
	public static void main(String[] args) {
		
		   TwoWheleer twoWheleer=new TwoWheleer();
		   
		   double priceTwoWheleer=twoWheleer.basePrice+twoWheleer.basePrice*twoWheleer.baseIncrement/100;
		   System.out.println("Price of Two wheleer : "+priceTwoWheleer);

	}
}
