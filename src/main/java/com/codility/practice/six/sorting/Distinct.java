package com.codility.practice.six.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
	
	  public int solution(int[] A) {
	     
	       Set<Integer> s = new HashSet<>(A.length);
	       for ( int a : A)
	       {
	    	   s.add(a);
	       }
	       return s.size();
	    }

	   public static void main(String arg[])
	   {
		   System.out.print( new Distinct().solution(new int[] {2, 1,1,2,3,1} ));
 
		   
	   }
}
