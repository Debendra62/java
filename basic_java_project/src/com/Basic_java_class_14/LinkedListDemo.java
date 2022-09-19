package com.Basic_java_class_14;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		int count=0;
		while(count<=list.size()) {
			int data=list.get(count);
		    System.out.println(data);
		    count++;
		}
	}
}
