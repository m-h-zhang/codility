package com.codility.practice.ten.prime_composite;

import java.util.ArrayList;

 

public class Peaks {
	
	
	
	
	  public int solution(int[] A) {
	        // write your code in Java SE 8
		  if (A.length <= 2) {
			  return 0;
		  }
		  java.util.List<Integer> peakIndexs = new ArrayList<>();
		  
		  for (int i = 1; i < A.length -1; i++ ) {
			  if ( A[i]> A[i-1] && A[i]> A[i+1]) {
				  peakIndexs.add(i);
				  i++;				  
			  }
			  
		  }
		  
		  
		  if (peakIndexs.size() < 2) {
			  return peakIndexs.size();
		  }else {
			  
			   for (int size = 1; size <= A.length; size++) {
				   if ( A.length % size == 0 ) {
					   int blocks = A.length / size;
					   int find = 0;
					   boolean ok = true;
					   for(int peakIdx : peakIndexs){
					        if(peakIdx/size > find){
					          ok = false;
					          break;
					        }
					        if(peakIdx/size == find) {
					        	find++;
					        }
					   }
				      if(find != blocks) {
				    	  ok = false;
				      }
				      if(ok) {
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
