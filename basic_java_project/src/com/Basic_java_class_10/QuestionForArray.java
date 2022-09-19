package com.Basic_java_class_10;

	import java.util.Arrays;

	public class QuestionForArray {

		public static void main(String[] args) {
		
		String[] datas= {"Apple","Ball","Cat","Dog","Texas"};
		int[] dataInt=new int[datas.length];
		
		for(int i=0;i<datas.length;i++) {
			String data=datas[i];
			int length=data.length();
			dataInt[i]=length;
		}
		System.out.println("Original array: "+Arrays.toString(datas));
		System.out.println("Int Array: "+Arrays.toString(dataInt));
		
	}
	}


