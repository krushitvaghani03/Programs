package main;

public class BInaryNumber {
public static void main(String[] args) {
	
	int i,j;
	
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=8;j++)
		{
			if(j % 2 == 0)
			{
				System.out.print("0");
			}
			else {
				System.out.print("1");
			}
		}
		System.out.println();
	}
}
}
