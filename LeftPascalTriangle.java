package main;

public class LeftPascalTriangle {
public static void main(String[] args) {
	
	
	int i,j,k,alpha=65;
	
	for(i=1;i<=5;i++)
	{
		for(j=0;j<5-i;j++)
		{
			System.out.print(" ");
		}
		
		for(k=0;k<i;k++)
			{
				System.out.print((char) (alpha+k));
				
			}
			
		System.out.println();
		}
	
	for(i=1;i<=5-1;i++)
	{
		for(j=0;j<i;j++)
		{
			System.out.print(" ");
		}
		for(k=0;k<5-i;k++)
		{
			System.out.print((char) (alpha+k));
		}
		System.out.println();
	}
		 
	}
}
