package com.codility.practice.seven.statch_queue;

import java.util.Stack;

public class Fish {
	
	
	
	public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
		Stack<F> stack = new Stack<>();
	 
		for ( int i=0; i < B.length; i++) {
			 F f = new F();
			 f.direction= B[i];
			 f.size = A[i];
		 
			while (stack.isEmpty() == false && B[i] == 0 && stack.peek().direction == 1 && stack.peek().size < A[i]) {
				stack.pop();				
			}
			
			
			if (stack.isEmpty() || B[i] == 1 || stack.peek().direction == 0  ) {
			   stack.push(f);
			}
			 
		}
		return stack.size();
		
		
    }
	  
	
	class F{
		int direction;
		int size;
	}
	  
	   
	  
	   public static void main(String arg[])
	   
	   {
		   
		   int A[] = new int[] {4,3,2,1,5};
		   
		   int B[] = new int[] {0,1,0,0,0};
		   System.out.println( new Fish().solution(A, B));
		   
	   }
}
