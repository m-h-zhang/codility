package com.codility.practice.nine.max_slice_sum;

public class MaxProfit {
	  public int solution(int[] A) {
		   
		  if (A.length < 2) {
			  return 0;
		  }
		  int max = 0;
		  int minNumber = A[0];
		  
		  for (int i = 1; i < A.length ; i++ ) {
			   
			  int temp = A[i] - minNumber;
			  if (temp > max) {
				  max = temp;
			  }
			  if (A[i] < minNumber) {
				  minNumber = A[i];
			  }
		  }
		  
		 return max;
	        
	    }
	  
	  public static void main(String arg[])
	  {
		  System.out.println(new MaxProfit().solution(new int[] {23171,21011,21123,21366,21013,21367}));
		  
		 
	  }

}
