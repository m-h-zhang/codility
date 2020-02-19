package com.codility.one_to_four;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
	
	  public int solution(int[] A) {
		  Set<Integer> set = new HashSet(A.length);
		  for ( int a : A) {
			  if ( a <= A.length ) {
			  	set.add(a);
			  }
		  }
		  
		  return set.size() == A.length ? 1 : 0;
	  }

}
