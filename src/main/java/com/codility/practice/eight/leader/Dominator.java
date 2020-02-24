package com.codility.practice.eight.leader;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
	
	   public int solution(int[] A) {
		   if (A.length == 0) {
			   return -1;
		   }
		   else if (A.length == 1)
		   {
			   return 0;
		   }
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
	        			 return i;
	        		 }
	        		 else
	        		 {
	        			 map.put(A[i], currentValue);
	        		 }
	        	 }
	         }
	         
	         return -1;
	         
	         
	    }
	   
	   
	   public static void main(String ar[]) {
		   
		   System.out.println(new Dominator().solution(new int[] { 3 }));
	   }
	   

}

 