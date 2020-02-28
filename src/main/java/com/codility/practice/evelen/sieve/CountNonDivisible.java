package com.codility.practice.evelen.sieve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNonDivisible {
	  public int[] solution(int[] A) {
		  Map<Integer, Integer> map = new HashMap<>();
	      for ( int a : A) {
	    	 if ( map.containsKey(a)) {
	    		 map.put(a,  map.get(a) + 1);
	    	 }else {
	    		 map.put(a, 1);
	    	 }
	      }
	      
	      int numberOfDivisor[] = new int[A.length];
	      for ( int i = 0 ; i < A.length; i++) {
	    	   if (A[i] == 1) {
	    		   numberOfDivisor[i] = A.length - map.get(1);
	    		   continue;
	    	   }
	    	   int count = 0;
	    	   int sqr = (int) Math.sqrt ( A[i]);
	    	    for ( int j = 1; j <= sqr; j++)
	    	    {
	    	    	if (A[i] % j == 0 ) {
	    	    	 
	    	    		if (map.containsKey(j)) {
	    	    			count += map.get(j);
	    	    		}
	    	    		if (A[i] / j != j && map.containsKey(A[i] / j)) {
	    	    			count += map.get(A[i] / j);
	    	    		}
	    	    	}
	    	    	
	    	    }
	    	    
	    	    numberOfDivisor[i] = A.length - count;
	      }
	    
	      
		 
		  
		  return numberOfDivisor;
	    }
	  
	  
	  public static void main(String arg[]) {
		  
		 int A[] = new int[] {3, 1,2,3, 6}; 
		 System.out.println(Arrays.toString(new CountNonDivisible().solution(A)));
		
		 
	  }

}
