package com.Basic_java_class_13;

import java.util.ArrayList;
import java.util.List;

public class ListCreation {

	public static void main(String[] args) {
		
		List<String>studentList=new ArrayList<String>();
		studentList.add("Ram");
		studentList.add("Sita");
		
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
	}
}
