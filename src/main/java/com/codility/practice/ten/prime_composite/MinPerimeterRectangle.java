package com.codility.practice.ten.prime_composite;

public class MinPerimeterRectangle {
	
	
	
	
	  public int solution(int N) {
	        // write your code in Java SE 8
		  int count = 0;
		  int i = 1;
		  for ( ; i  < Math.sqrt(N); i++ ) {
			  if ( N %i == 0)
			    count+= 2;
		  }
		  
		  if (i * i == N) {
			  count++;
		  }
		  return count;
		  
	    }
	  
	  
	  

}
