package com.Basic_java_class_10;

public class ArrayQuestion2 {

		public static void main(String[] args) 
		{
			int[] a = {2,10,9,3};
			int result = isBest(a);
			System.out.println("Result : "+result);	
		}
		
		private static int isBest(int[] a) 
		{
			int i;
			int flagCheck1=0;

			for(i=0;i<a.length-1;i++) 
			{
				int num = a[i];
				int elementMin = num-1;
				int elementPlus = num+1;
				for (int j=0;j<a.length;j++)
				{
					
					if(a[j]==elementMin || a[j]==elementPlus) 
					{
						flagCheck1 = 1;
					}
				}
					
			if(flagCheck1 == 0) {
				return 0;
			}
			}
			return 1 ;
		}
	}

