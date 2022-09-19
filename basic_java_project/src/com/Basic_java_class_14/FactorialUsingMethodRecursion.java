package com.Basic_java_class_14;

public class FactorialUsingMethodRecursion {

	static int fact = 1;

	public void addNum(int n) {
		if (n > 0) {
			fact = fact * n;
			
			System.out.println("fact is : "+fact);
			n = n - 1;
			addNum(n);
		}
	}

	public static void main(String[] args) {
		FactorialUsingMethodRecursion demo = new FactorialUsingMethodRecursion();
		demo.addNum(5);
		System.out.println("Factorial:" + fact);

	}

}
