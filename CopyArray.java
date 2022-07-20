package main;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		
		/*
		 * int a[] = new int[] {1,2,3,4,5}; int b[] = new int[a.length];
		 * 
		 * for(int i=0;i<a.length;i++) { b[i] = a[i]; }
		 * 
		 * 
		 * a[2] = 10;
		 * 
		 * 
		 * for(int j=0;j<b.length;j++) { System.out.println(b[j]); }
		 * 
		 * System.out.println();
		 * 
		 * b[1] = 100;
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
			
		 

		/*
		 * int a[] = new int[] {1,2,3,4,5}; int b[] = a;
		 * 
		 * 
		 * for(int i=0;i<b.length;i++) { System.out.println(b[i]); }
		 * 
		 * 
		 * a[2] = 10;
		 * 
		 * for(int i=0;i<b.length;i++) { System.out.println(b[i]); }
		 * 
		 * System.out.println();
		 * 
		 * b[1] = 100;
		 * 
		 * for(int i=0;i<b.length;i++) { System.out.println(a[i]); }
		 */

		
		/*
		 * int a[] = new int[] {1,2,3,4,5}; int b[] = Arrays.copyOf(a, a.length);
		 * 
		 * for(int i=0;i<b.length;i++) { System.out.println(b[i]); }
		 */
		
		

		  int a[] = new int[] {1,2,3,4,5,6,7,8,9,10}; 
		  int b[] = new int[a.length];
		  
		  System.arraycopy(a, 2, b, 0, 8);
		  
			 for(int i=0;i<b.length;i++)
			 {
				 System.out.println(b[i]);
			 }
			 
		  
		  

		
	}
}
