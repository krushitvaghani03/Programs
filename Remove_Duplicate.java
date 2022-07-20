package main;

import java.util.HashSet;

public class Remove_Duplicate
{
	public static void FindDuplicate(int[] a1)
	{
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int ele : a1)
		{
			System.out.println(ele);
			if(!set.add(ele))
			{
				System.out.println("Element : "+ele);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] x = new int[] {10,20,30,20,50,40,10};
		int i,j;
		
	//	FindDuplicate(x);
		
		for(i=0;i<x.length;i++)
		{
			for(j=i+1;j<x.length;j++)
			{
				if(x[i] == x[j])
				{
					System.out.println("Duplicate Elements : "+x[i]);
				}
			}
		}
		
		
		
	}
}
