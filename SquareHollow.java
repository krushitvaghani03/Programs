package main;

public class SquareHollow {
public static void main(String[] args) {
	
	int i,j,alpha=65;
	
	
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			if(i==0 || i==5-1)
			{
				System.out.print((char) (alpha+j));
			}
			else {
				
				if(j==0 || j==5-1)
				{
					System.out.print((char) (alpha+j));
				}
				else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
}
}
