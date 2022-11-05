package com.Basic_java_class_16;

public class Employee {

	private String fName;
	private String lName;
	private String mName;
	private String address;
	private String gender;
	private String phoneNo;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
    
	public void displayEmployeeInfo() {
		System.out.println("Name: "+fName+" "+mName+" "+lName);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		System.out.println("PhoneNo: "+phoneNo);
		
	}
	
	
}
