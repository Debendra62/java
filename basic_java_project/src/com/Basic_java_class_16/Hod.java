package com.Basic_java_class_16;

public class Hod extends Employee{

	private int age;
	private String collegeName;
	private String collegePhoneNo;
	
	public Hod(int age, String collegeName,String collegePhoneNo) {
		this.age=age;
		this.collegeName=collegeName;
		this.collegePhoneNo=collegePhoneNo;
	}
	
	public void showHodInfo() {
		super.displayEmployeeInfo();
		System.out.println("Age: "+age);
		System.out.println("College Name: "+collegeName);
		System.out.println("College Phone Number: "+collegePhoneNo);
		
	}
	
	public static void main(String[] args) {
		
		Hod hod=new Hod(35,"ABC International Collge","1234567893");
		hod.setfName("Ram");
		hod.setmName("pd");
		hod.setlName("Pandey");
		hod.setAddress("Basundhara");
		hod.setPhoneNo("123124231");
		hod.setGender("Male");
		
		hod.showHodInfo();
	}
}
