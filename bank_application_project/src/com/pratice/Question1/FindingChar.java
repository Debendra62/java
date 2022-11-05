package com.pratice.Question1;

public class FindingChar {

	public static void main(String[] args) {
		
		//15.Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World”.
		
		String data1="Hello, World";
		for(int i=0; i<data1.length(); i++) {
			if(data1.charAt(i)=='o') {
				System.out.println("The letter o occurs first and comma occurs last.");
				break;
			}
			else if (data1.charAt(i)==','){
				System.out.println("The character comma occurs first and letter o  occurs last.");
                break;
			}

		}
	}
}
