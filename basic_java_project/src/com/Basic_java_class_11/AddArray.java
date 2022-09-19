package com.Basic_java_class_11;

public class AddArray {

	public static void main(String[] args) {
		int[][] arrayFirst= {{1,2,3},{4,5,6}};
		int[][] arraySecond= {{1,2,3},{4,5,6}};
        int[][] arrayThird =new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<=2;j++) {
				arrayThird[i][j]=arrayFirst[i][j] + arraySecond[i][j];
                System.out.print(arrayThird[i][j]+ " ");
			}
			System.out.println(" ");
	}
	}
}
