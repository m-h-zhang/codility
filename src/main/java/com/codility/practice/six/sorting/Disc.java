package com.codility.practice.six.sorting;

public class Disc {
	
	  public int solution(int[] A) {
	        int count = 0;
	        for (int i = 0; i < A.length -1 ; i++) {
	        	for (int j = i + 1; j< A.length; j++) {
	        		if ((long)A[i] + i >= j - A[j] ) {
	        			count++;
	        			if (count > 10000000) {
	        				return -1;
	        			}
	        		}
	        	}
	        }
	        return count;
	    }

	   public static void main(String arg[])
	   {
		   System.out.print( new Disc().solution(new int[] {1, 5,2,1,4,0} ));
 
		   
	   }
}
 

