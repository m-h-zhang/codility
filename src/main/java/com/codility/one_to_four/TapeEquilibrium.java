package com.codility.one_to_four;

public class TapeEquilibrium {
	  public int solution(int[] A) {
		     if (A.length == 2) {
		    	 return Math.abs( A[0] - A[1]);
		     }else {
		    	 long sum = 0;
		         for (int i : A) {
		        	 sum += i;
		         }
		         long leftSum = A[0];
		         int minValue  = (int)Math.abs(sum - leftSum  - leftSum );
		         
		         for (int p = 1; p < A.length - 1; p++ ) {
		        	 leftSum += A[p];
		        	 int  difference = (int) Math.abs(sum - leftSum  - leftSum );
		        	 if ( difference < minValue) {
		        		 minValue = difference;
		        	 }
		        	  
		         }
		         return minValue;		    	 
		     }        
	        	 
	    }

}
