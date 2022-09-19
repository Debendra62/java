package com.Basic_java_class_14;

import java.util.List;
import java.util.Stack;

public class ListCreationUsingStack {

	public static void main(String[] args) {
		
		/* Stack<String> stack=new Stack<String>();
		stack.push("Apple");
		stack.push("Ball");
		stack.push("Cat");
		System.out.println(stack.pop());
		*/
		
		List<String> list=new Stack<String>();
		list.add("Texas");
		list.add("International");
		list.add("College");
		int flag=0;
		do {
			String data= list.get(flag);
			System.out.print(data);
			System.out.print(" ");
			flag++;

		}while(flag<list.size());
	}
}
