package com.codility.practice.thirteen.fibonacci;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class FibFrog {
	 
    
    public int solution(int[] A) {
        Set<Integer> fibs = getFibonaci(A.length + 1);
        boolean[] accessed = new boolean[A.length]; 
        Stack<Integer> positions = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        positions.push(-1);
        
        int count = 1;
        
        while (positions.isEmpty() == false)
        {
	        int position = positions.pop();
	       
	        for ( int fib : fibs )
	        {
	        	 int newPosition = position + fib;
	        	 if ( newPosition == A.length)
	        	 {
	        		 return count ;
	        	 }
	        	 else if ( newPosition > A.length )
	        	 {
	        		 continue;
	        	 }
	        	 if ( A[newPosition] == 1)
	        	 {
	        		 if ( accessed[newPosition] == false)
	        		 {
	        			 accessed[newPosition] = true;
	        			 temp.push(newPosition);
	        		 }	        		  
	        	 }
	        }
	        if ( positions.isEmpty() && temp.isEmpty() == false)
	        {
	        	positions = temp;
	        	temp = new Stack<>();
	        	count++;
	        }
        }
        return -1;
        
    }
    
    
    
    
    public Set<Integer> getFibonaci(int max) {
        Set<Integer> fibs = new HashSet<>();
        int pre2 = 0; 
        int pre1 = 1;
        int fib = pre2 + pre1;
        while(fib <= max) {
            fibs.add( fib);
            pre2 = pre1;
            pre1 = fib;
            fib = pre2 + pre1;
        }        
        return fibs;
    }
	  
	 
	  
	  public static void  main(String arg[]) {
		
		int A[] = new int[] {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0}; 
		 
	 
		    
		  int B[] = new int[] {1, 1, 0, 0, 0};
		    
		    
		   System.out.println(new FibFrog().solution(A));
		   System.out.println(new FibFrog().solution(B));
	  }

}
