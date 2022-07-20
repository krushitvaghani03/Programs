package main;

public class EqualArray {
public static void main(String[] args) {
	
	int a[] = new int[] {1,2,3,4,5};
	int b[] = new int[] {1,2,3,4,5};
	boolean e = true;
	
	if(a.length == b.length)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != b[i])
			{
				e = false;
			}
		}
	}
	else
	{
		e = false;
	}
	
	if(e)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
		
	
}
}
