package com.Basic_java_class_18;

public class MethodOverloadingDemo {

	public void setCollegeInfo(String collegeName) {
		System.out.println("College name: "+collegeName.toUpperCase());
	}
	
	public void setCollegeInfo(String collegeName,String collegeAddress) {
		System.out.println("College name: "+collegeName);
		System.out.println("College address: "+collegeAddress);

	}
	
	public void setCollegeInfo(long phoneNo) {
		System.out.println("College phone number: "+phoneNo);

	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo demo=new MethodOverloadingDemo();
		demo.setCollegeInfo("Texas");
		demo.setCollegeInfo("SWSC", "Basundhara");
		demo.setCollegeInfo(9841385674L);
		
	}
}
