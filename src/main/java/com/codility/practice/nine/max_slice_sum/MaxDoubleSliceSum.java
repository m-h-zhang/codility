package com.codility.practice.nine.max_slice_sum;

public class MaxDoubleSliceSum {
	  public int solution(int[] A) {
		  int length = A.length;
		  int left[] = new int[length];
		  int right[] = new int[length];
		  
		 
		  
		  for (int i = 1; i < length -1; i++ ) {
			  int sum = A[i] + left[i  - 1];
			  left[i] = sum > 0 ? sum : 0;
			  
		  }
		  
		  for (int i = length -2; i > 0 ; i-- ) {
			  int sum = A[i] + right[i  + 1];
			  right[i] = sum > 0 ? sum : 0;
			  
		  }
		  
		  int max = 0;
		  
		  for (int i = 1; i < length -1; i++) {
			  int sum = left[i - 1] + right[i + 1];
			  if (sum > max ) {
				  max = sum;
			  }
		  }
		  return max;
	        
	    }
	  
	  public static void main(String arg[])
	  {
		  System.out.println(new MaxDoubleSliceSum().solution(new int[] {3,2,6,-1,4,5,-1,2}));
		  
		  
	  }

}
