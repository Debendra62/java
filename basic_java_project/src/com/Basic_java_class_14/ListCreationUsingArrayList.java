package com.Basic_java_class_14;

import java.util.ArrayList;
import java.util.List;

public class ListCreationUsingArrayList {

	public static void main(String[] args) {
		
		List<Student> sList=new ArrayList<Student>();
		sList.add(new Student(1,"Ram","kathmandu"));
		sList.add(new Student(2,"Hari","Dharan"));
		sList.add(new Student(3,"Maya","Pokhara"));

		for (Student student : sList) {
			String name=student.getName();
			String address=student.getAddress();
			int rollNo=student.getRollNo();
			
			System.out.println("Name:"+name+"  Address:"+address+"  RollNo :"+rollNo);
		}
		System.out.println();
		System.out.println("Before Delete: "+sList.size());
		sList.remove(2);
		System.out.println("After Delete: "+sList.size());
		System.out.println();
		for(int i=0;i<sList.size();i++) {
			Student student=sList.get(i);
			String name=student.getName();
			String address=student.getAddress();
			int rollNo=student.getRollNo();
			
			System.out.println("Name:"+name+"  Address:"+address+"  RollNo :"+rollNo);
		}
	}
}
