package com.codility.practice.eight.leader;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {
	
	   public int solution(int[] A) {
		   if (A.length < 2) {
			   return 0;
		   }
		   Integer leader = null;
		    int half = A.length/2;
	         Map<Integer, Integer> map = new HashMap<>();
	         for (int i = 0; i < A.length; i++)
	         {
	        	 Integer currentValue = map.get(A[i]);
	        	 if (currentValue == null) {
	        		 map.put(A[i], 1);
	        	 }
	        	 else
	        	 {
	        		 currentValue++;
	        		 if (currentValue > half ) {
	        			 leader= A[i];
	        		 }
	        		 
	        		 map.put(A[i], currentValue);
	        		  
	        	 }
	         }
	         
	         int count = 0;
	         if ( leader == null) {
	        	 return 0;
	         }
	         int numOfLeader = map.get(leader);
	         
	         int currentNum = 0;
	        
	         for (int i = 0; i < A.length -1; i++) {
	        	 if (A[i] == leader)
	        	 {
	        		 currentNum++;
	        	 }
        		 if ( currentNum > (i + 1)/2 &&  (numOfLeader - currentNum) > (A.length - i - 1) / 2 ) {
        			 count++;
        		 }
	        	  
	         }
	         
	         return count;
	         
	    }
	   
	   
	   public static void main(String ar[]) {
		   
		   System.out.println(new EquiLeader().solution(new int[] { 4, 4, 2, 5, 3, 4, 4, 4 }));
	   }
	   
	 
}

 