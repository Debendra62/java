package com.Basic_java_class_20;

public class MultiCatchBlockDemo {

	public static void main(String[] args) {
		
		String collegeName=null;
		
		try {
			int size=collegeName.length();
			System.out.println("Size is: "+size);
			
			collegeName="Texas";
			int data=Integer.parseInt(collegeName);
			System.out.println("Data: "+data);
		}catch(NullPointerException| NumberFormatException e){
			System.out.println(e.getMessage());
		}
	}
}
