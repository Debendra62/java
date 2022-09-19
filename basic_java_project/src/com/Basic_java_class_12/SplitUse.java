package com.Basic_java_class_12;

import java.util.Arrays;

public class SplitUse {

public static void main(String[] args) {
		
		String data1="Texas,Morgan,Swsc";
		String[] datas=data1.split(",");
		
		for(String val:datas) {
		     System.out.println(val);
		}
		
	}
}
