package com.codility.practice.seven.statch_queue;

import java.util.Stack;

public class StoneWall {
	
	
	
    public int solution(int[] H) {
          Stack<Integer> stack = new Stack<>();
          
          int count = 0;
         
		 for (int loop = 0; loop < H.length; loop++)
		 {
			 int i = H[loop];
			 if ( stack.isEmpty())
			 {
				 stack.push(i);				  
				 count++;
			 }
			 else
			 {
				 int stackHeight = H[loop-1];		
					 
				 while (i < stackHeight)
				 {
					 stackHeight -= stack.pop();
					 
				 }
				 if ( i > stackHeight) {
					 stack.push(i - stackHeight);
					 count++;
				 }
				 
			 }
		 }
		 return count;
          
    }
	  
	  
	   
	  
	   public static void main(String arg[])
	   {
		   System.out.println( new StoneWall().solution( new int[] {8,8,5,7,9,8,7,4,8}));
		   
 
		   
	   }
}
