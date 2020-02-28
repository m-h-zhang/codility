package com.codility.practice.ten.prime_composite;

import java.util.ArrayList;

 

public class Peaks {
	
	
	
	
	  public int solution(int[] A) {
	        // write your code in Java SE 8
		  if (A.length <= 2) {
			  return 0;
		  }
		  
		  int peaksCurrent[] = new int[A.length];
		  //java.util.List<Integer> l = new ArrayList<>();
		  
		  
		  for (int i = 1; i < A.length -1; i++ ) {
			  peaksCurrent[i] = peaksCurrent[i-1];
			  if ( A[i]> A[i-1] && A[i]> A[i+1]) {
				  peaksCurrent[i]++;		  
			  }
			  
		  }
		  peaksCurrent[peaksCurrent.length-1] = peaksCurrent[peaksCurrent.length-2];
		  
		  
		  if (peaksCurrent[peaksCurrent.length-1] < 2) {
			  return peaksCurrent[peaksCurrent.length-1];
		  }else {
			 // int peakNums = peaksCurrent[peaksCurrent.length-1];
			  
			  
			  for ( int blocks = A.length; blocks >=1; blocks--) {
				  
				  
				  if ( A.length % blocks == 0) {
					   boolean isGood = true;
					   int size = A.length / blocks;
					   
					  
					   
					   for (int i = size; i < A.length ; i= i + size) {
						   
						   if ( peaksCurrent[i + size -1 ] == peaksCurrent[i -1]) {
							  isGood = false;
							  break;
						   }
					   }
					   
					   if (isGood && peaksCurrent[size -1] > 0) {
						   
						   return blocks;
					   }
				  }
				  
			 }
			  
			  
		  }
		  return 0;
		  
	    }
	  
	  public static void main(String arg[]) {
		  //System.out.println(new Peaks().solution( new int[] {1, 2, 3, 4, 5, 6}));
		  System.out.println(new Peaks().solution( new int[] { 1,2,3,4, 3,4,1, 2, 3, 4, 6,2}));
	  }
	  
	  

}
