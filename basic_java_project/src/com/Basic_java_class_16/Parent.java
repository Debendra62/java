package com.Basic_java_class_16;

public class Parent {
 
	protected String collegeName="Texas International College";
    private String collegeAddress;
	
    public Parent(String collegeAddress) {
    	System.out.println("Construter invoked......");
    	this.collegeAddress=collegeAddress;
    }
    
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public String getCollegeAddress() {
		return collegeAddress;
	}
	
}
