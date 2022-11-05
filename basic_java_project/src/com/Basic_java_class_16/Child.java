package com.Basic_java_class_16;

public class Child  extends Parent{

	private String collegePhoneNo;
	
	
	public Child(String collegeAddress,String collegePhoneNo) {
		super(collegeAddress);
		this.collegePhoneNo=collegePhoneNo;
	}
	
	
	public void getInstanceValue() {
		String collegeName=super.collegeName;
		System.out.println("Before change: "+collegeName);
	}
	
	public void useSuperInMethod() {
		super.setCollegeName("ABC International College");
		String collegeName=super.getCollegeName();
		System.out.println("After change: "+collegeName);
		System.out.println("College Address: "+super.getCollegeAddress());
		System.out.println("College Phone Number: "+collegePhoneNo);
	}
	
	public static void main(String[] args) {
		Child child=new Child("Basundhara","9841382432");
		child.getInstanceValue();
		child.useSuperInMethod();
	}
}
