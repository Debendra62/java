package com.Basic_java_class_1;

public class StaticVariableDemo {
     
	public static String userProfile(String name,String address, int age) {
		 String userProfile=("Name : "+name+"\n Address : "+address+"\n Age: "+age);
		      return userProfile;
	}
	
	public static void main(String[] args) {
		String details=StaticVariableDemo.userProfile("Debendra Bakhati", "Kathmandu", 20);
				System.out.println(details);
	}
}
