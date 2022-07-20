package main;

public class RightPascalTriangle {
public static void main(String[] args) {
	
	int i,j,alpha=65;
	
	for(i=1;i<=5;i++)
	{
		for(j=0;j<i;j++)
		{
			System.out.print((char) (alpha+j));
		}
		System.out.println();
	}
	
	for(i=4;i>=1;i--)
	{
		for(j=0;j<i;j++)
		{
			System.out.print((char) (alpha+j));
		}
		System.out.println();
	}
}
}
