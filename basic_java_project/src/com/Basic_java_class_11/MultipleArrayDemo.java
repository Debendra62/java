package com.Basic_java_class_11;

public class MultipleArrayDemo {

   public static void main(String[] args) {
	int[][] arryFirst= {{1,2,3},{4,5,6}};
	for(int i=0;i<2;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(arryFirst[i][j]+ " ");

		}
		System.out.println();
	}

}
}
