package com.codility.one_to_four;

import java.util.HashSet;
import java.util.Set;

public class FrogRiver {
	  public int solution(int X, int[] A) {
	        // write your code in Java SE 8
		  int r = -1;
		  if ( X ==0 )
		  {
			 return 0;
		  }else {
			  Set<Integer> set = new HashSet<>(A.length);
			  for ( int i = 0; i < A.length; i++) {
				  set.add(A[i]);
				  if (set.size() == X) {
					  return i;
				  }
			  }
		  }
		  return -1;
		  
	    }

}
