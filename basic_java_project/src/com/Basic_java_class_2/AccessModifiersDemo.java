package com.Basic_java_class_2;

public class AccessModifiersDemo {
    private int num1;
    public int num2;
    int num3;
    
    public AccessModifiersDemo(int num1,int num2,int num3) {
    	this.num1=num1;
    	this.num2=num2;
    	this.num3=num3;

    }
    
	//make a public method to use the private data in another package or another class
    public int getNum1() {
    	return num1;
    }
    
    void findSum() {
    	int sum=0;
    	sum=num1+num2+num3;
    	System.out.println("Sum of  "+num1+","+num2+" and "+num3+" is "+sum);
    }
	
    /*
     private = with in the class
     default = with in the pakage
     public = everywhere
     protected =  
     
     */
}
