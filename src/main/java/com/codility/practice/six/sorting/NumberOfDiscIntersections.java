package com.codility.practice.six.sorting;

import java.util.Arrays;

public class  NumberOfDiscIntersections {
	
	  public int solution(int[] A) {
	        int count = 0;
	         long left[] = new long[A.length];
	         long right[] = new long[A.length];
	        for ( int i  = 0; i < A.length; i++) {
	        	left[i] = i - A[i];
	        	right[i] = i + (long)A[i];
	        }
	        Arrays.sort(left);
	        Arrays.sort(right);
	        int rightPo = 0;
	        
	        int open = 0;
	        for ( long l : left)
	        {
	        	while ( l > right[rightPo]) {
	        		open--;
	        		rightPo++;
	        	}
	        	
	        	count += open;
	        	
	        	if (count > 10000000) {
	        		return -1;
	        	}
	        	
	        	open++;        	
	        	
	        }
	        
	        
	        return count;
	    }
	  
	  
	  

	   public static void main(String arg[])
	   {
		  System.out.print( new NumberOfDiscIntersections().solution(new int[] {1, 2147483647, 0} ));

		 // System.out.println(Integer.MAX_VALUE);
		  //		   int[] i = new int[] {2, 3,6, 7, 8, 10, 20, 50};
//		   System.out.println(Arrays.binarySearch(i, 5));
// 
//		   
	   }
}
 
 
