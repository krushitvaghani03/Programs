package main;

public class PlusPattern {
public static void main(String[] args) {
	
	
	int i, j, s=5, ah=65, av=65;
	
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			if(i == s/2)
			{
				System.out.print((char) (ah+j));
			}
			else
			{
				if(j == s/2)
				{
					System.out.print((char) (av+i));
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
 