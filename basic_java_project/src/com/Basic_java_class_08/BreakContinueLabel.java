package com.Basic_java_class_8;

public class BreakContinueLabel {

	public static void main(String[] args) {
		
		firstloop:
		for(int i=0;i<10;i++) {
			secondloop:
			for(int j=0;j<=10;j++) {
				thirdloop:
				for(int k=0;k<=10;k++) {
					if(k==2) {
						break secondloop;
					}
				System.out.println("i="+i+" j= "+j+" k= "+k);
			}
		}
	}
		
	}
}
