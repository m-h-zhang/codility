package com.codility.practice.five;

public class PassingCars {
	   public int solution(int[] A) {
	       int [] counter = new int[A.length];
	       int count = 0;
		   for ( int i = A.length - 1; i >= 0; i--)
		   {
			    if ( A[i] == 1) {
			    	count++;			    	
			    }
			    if (count > 1000000000) {
					   return -1;
				}
			    counter[i] = count;
		   }
		   int pairCount = 0;
		   for ( int i = 0; i < A.length -1; i++) {
			   if (A[i]==0) {
				   pairCount += counter[i];
				   if (pairCount > 1000000000) {
					   return -1;
				   }
			   }
		   }
		   return pairCount;
	    }

}
