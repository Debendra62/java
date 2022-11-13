package com.Basic_java_class_17;

public class FourWheleer extends Vehicle{
	
   double baseIncrement=100;
   
   public static void main(String[] args) {
	
	   FourWheleer fourWheleer=new FourWheleer();
	   double priceFourWheleer=fourWheleer.basePrice+fourWheleer.basePrice*fourWheleer.baseIncrement/100;
	   System.out.println("Price of Four wheleer : "+priceFourWheleer);
			
}
	
}
