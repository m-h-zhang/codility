package com.codility.practice.ten.prime_composite;

public class CountFactors {
	
	
	
	
	  public int solution(int N) {
	        // write your code in Java SE 8
		  int min = Integer.MAX_VALUE;
		  int i = 1;
		  for ( ; i  < Math.sqrt(N); i++ ) {
			  if ( N %i == 0  ) {
				int p = (i + N/i)*2;
				if ( p < min ) {
					min = p;
				}
			     
			  }
		  }
		  
		  if (i * i == N && 4*i < min) {
			  min = i * 4;
		  }
		  return min;
		  
	    }
	  
	  
	  

}
