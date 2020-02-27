package com.codility.practice.ten.prime_composite;

import java.util.ArrayList;

 

public class Flags {
	
	
	
	
	  public int solution(int[] A) {
	        // write your code in Java SE 8
		  if (A.length <= 1) {
			  return 0;
		  }
		  java.util.List<Integer> l = new ArrayList<>();
		  
		  for (int i = 1; i < A.length -1; i++ ) {
			  if ( A[i]> A[i-1] && A[i]> A[i+1]) {
				  l.add(i);
				  i++;				  
			  }
			  
		  }
		  if (l.size() < 2) {
			  return l.size();
		  }else {
			  int gap = l.get(l.size() - 1) - l.get(0);			  
			  
			  for ( int maxFlagNum = (int)Math.sqrt(gap) + 1; maxFlagNum >=0; maxFlagNum--) {
				  
				  int currentIndex = l.get(0);
				  int count = 1;
				  for (int i = 1; i < l.size();  i++) {
					  if (l.get(i) - currentIndex >= maxFlagNum) {
						  count++;
						  if ( count >= maxFlagNum) {
							  return maxFlagNum;
						  }
						  currentIndex = l.get(i);
					  }
				  }
				  
				  
			  }
			  
			  
		  }
		  return 0;
		  
	    }
	  
	  public static void main(String arg[]) {
		  System.out.println(new Flags().solution( new int[] {1, 2, 3, 4, 5, 6}));
		  //System.out.println(new Flags().solution( new int[] { 1,5,3,4, 3,4,1, 2, 3, 4, 6,2}));
	  }
	  
	  
	  

}
