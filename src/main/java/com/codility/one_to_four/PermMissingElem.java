package com.codility.one_to_four;

public class PermMissingElem {
	
	  public int solution(int[] A) {
	       int sum = 0;
		  for (int i : A) {
			  sum += i;
		  }
		  
		  long total = ((long)A.length + 2) * (A.length + 1)/2;
		  
		  return (int)total - sum;	    	   
		  
	    }

}
