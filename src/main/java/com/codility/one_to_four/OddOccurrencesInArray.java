package com.codility.one_to_four;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
	
	  public int solution(int[] A) {
	       if ( A.length == 1 ) {
	    	   return A[0];
	       }  
	       else {
	    	   Map<Integer, Integer> map = new HashMap<>();
	    	   for ( int a : A) {
	    		   Integer value = map.get(a);
	    		   if ( value == null ) {
	    			   map.put(a, 1);
	    		   }
	    		   else {
	    			   map.remove(a);
	    		   }
	    	   }
	    	   return map.keySet().iterator().next();
	    	   
	       }
	    	   
		  
	    }

}
