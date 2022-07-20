package main;

import java.util.Arrays;

public class Second_Large {

	public static int FindSecondLargestNum(int a[],int total)
	{
		int temp=0,i,j = 0;
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
			
		}
		
		return a[total-2];
		
	}
	
	public static void main(String[] args) {
		
		int x[] = new int[] {10,20,50,5,100,75,80,1,10};
		System.out.println("Second Largect : "+FindSecondLargestNum(x, x.length));
		
		Arrays.sort(x);
		System.out.println(x[x.length-2]);
		
		
		
		
//		int temp = 0;
//		
//		for(int i=0 ; i<4 ; i++)
//		{
//			for(int j=i+1 ; j<4 ; j++)
//			{
//				if(x[i] > x[j])
//				{
//					
//					temp = x[i];
//					x[i] = x[j];
//					x[j] = temp;
//				}
//			}
//			System.out.println(x[i]);
//		}

	}
	
}
