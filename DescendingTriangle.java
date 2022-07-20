package main;

public class DescendingTriangle {

	public static void main(String[] args) {
		
		
		int i,j;
		
		for(i=1;i<=8;i++)
		{
			for(j=8;j>=i;j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
