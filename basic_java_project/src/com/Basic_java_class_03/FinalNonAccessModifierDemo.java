package com.Basic_java_class_3;
/*
 Variable = cannot change
 Class = cannot inheritate
 method = cannot modified or used 
 */
 final public class FinalNonAccessModifierDemo {
  
	  private int num1;
	  private String name;
	  private boolean gender;
	  
	  public void setVariable() {
		  num1=10;
		  name="Ram Pandey";
		  gender=true;
		  
	  }
	  
	 final public void showVariable() {
		  System.out.println("Num1 : "+num1);
		  System.out.println("Name : "+name);
		  System.out.println("Gender : "+gender);

	  }
	  
}
