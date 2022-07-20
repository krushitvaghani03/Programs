package main;

public class JaggedArray {

	public static void main(String[] args) {
		
	
	int a[] = new int[] {1,2,3};
	int b[] = new int[] {10,20,30,40};
	int c[] = new int[] {100,200,300,400,500};
	
	int d[][] = {a,b,c};
	
	for(int i=0;i<d.length;i++)
			{
				for(int j=0 ;j<d.length;j++)
				{
					System.out.println(d[i][j]);
				}
				System.out.println();
			}
	
		
	}
}
