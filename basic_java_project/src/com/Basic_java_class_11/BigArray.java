package com.Basic_java_class_11;

public class BigArray {

		public static void main(String[] args) {
			
			int[] a = {2,10,3};
			int result = isBig(a);
			System.out.println("Result : "+result);	
		}
		
		private static int isBig(int[] a) 
		{
			int i;
			int flagCheck1=1;

			for(i=0;i<a.length-1;i++) 
			{
				int num = a[i];
				if(num==1) {
					for(int j=0;j<a.length;j++) {
						int num2=a[j];
						if(num2==9) {
							flagCheck1=1;
						}
						else {
							flagCheck1=0;
						}
					}
		
				}
				
				if(num==9) {
					for(int j=0;j<a.length;j++) {
						int num2=a[j];
						if(num2==1) {
							flagCheck1=1;
						}
						else {
							flagCheck1=0;
						}
					}
		
				}
		}
			if(flagCheck1 == 0) {
				return 0;
			}
			
			return 1;
}
}
