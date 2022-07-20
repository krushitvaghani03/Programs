package main;

public class HollowTriangle {

	public static void main(String[] args) {
		
		int s = 5,i,j;
		int alpha = 64;
		
		
//		for(int i = 1;i <= s;i++)
//		{
//			for(int j =0;j < i ;j++)
//			{
//				if(i != s)
//				{
//					if(j == 0 || j == i-1)
//					{
//						System.out.print((char) (alpha + j));
//					}
//					else
//					{
//						System.out.print(" ");
//					}
//				}
//				else
//				{
//					System.out.print((char) (alpha + j));
//				}
//				
//			}
//			System.out.println();
//		}
		
	
		for(i=1;i<=s;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j==1 || i==j || i==s)
				{
					System.out.print((char) (alpha+j));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
}
