package com.codility.one_to_four;


// 2.1 -array
public class CyclicRotataion {
	
	 public int[] solution(int[] A, int K) {
		
		   if ( A == null || A.length <= 1 || K < 1) {
			   return A;
		   }
	     
		   int num = K % A.length;
	       if ( num == 0 )
	       {
	    	   return A;
	       }
	       else
	       {
	    	   int [] result = new int[A.length];
	    	   for ( int i = 0; i < A.length; i++) {
	    		   if ( A[i] > 1000 || A[i] < -1000) {
	    			  // throw new RuntimeException();
	    		   }
	    		   
	    		   if ( i + num < A.length) {
	    			   result[ i + num ] = A[i];
	    			   
	    		   }
	    		   else {
	    			   result[ i + num - A.length] = A[i];
	    		   }
	    	   }
	       
	    	   return result;
	       }
	    }

}
