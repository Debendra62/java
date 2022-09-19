package com.Basic_java_class_12;

public class CompareToIgnoreToUse {

public static void main(String[] args) {
		
		String data1="TexaS";
		String data2="TexAs";
		
		System.out.println(data1.compareToIgnoreCase(data2));
		
		if(data1.compareToIgnoreCase(data2)==0) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Fail");
		}
	}
// compare to =sab same hunu parxa
// compare to ignore to =same sab sano thulo huda ni hunxa
}
