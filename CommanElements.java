package main;

import java.util.Arrays;
import java.util.HashSet;

public class CommanElements {
 public static void main(String[] args) {
	

     String[] a = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

     String[] b = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
	 
	 HashSet<String> s1 = new HashSet<String>(Arrays.asList(a));
	 HashSet<String> s2 = new HashSet<String>(Arrays.asList(b));
	
	 /*
		 * for(int i=0;i<a.length;i++) { for(int j=0;j<b.length;j++) {
		 * if(a[i].equals(b[j])) { set.add(a[i]); } } } System.out.println(set);
		 */
	 
	 s1.retainAll(s2);
	 System.out.println(s1);
	 
}
}
