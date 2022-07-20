package main;

public class HourGlassPattern {
public static void main(String[] args) {
	
	
	int i,j,k,alpha=65;
	
	for(i=0;i<5;i++)
	{
		for(j=0;j<i;j++)
		{
			System.out.print(" ");
		}
		for(k=0 ; k<(5-i)*2-1 ; k++)
		{
			System.out.print((char) (alpha+k));
		}
		System.out.println();
	}
	
	for(i=2;i<=5;i++)
	{
		for(j=5;j>i;j--)
		{
			System.out.print(" ");
		}
		for(k=0;k<i*2-1;k++)
		{
			System.out.print((char) (alpha+k));
		}
		System.out.println();
	}
}
}
