package com.codility.practice.seven.statch_queue;

import java.util.Stack;

public class Bracket {
	
	
	
	  public int solution(String s) {
		  Stack<Character> stack = new Stack<>();
		  for (char c : s.toCharArray()) {
			  if (c == '{' ||  c == '(' || c == '[') {
			    stack.push(c);
			  }
			  else if (c == '}')
			  {
				 if (stack.isEmpty() ||  stack.pop() != '{') {
					 return 0;
				 }
			  }
			  else if (c == ')')
			  {
				 if (stack.isEmpty() ||  stack.pop() != '(') {
					 return 0;
				 }
			  }
			  else if (c == ']')
			  {
				 if (stack.isEmpty() ||  stack.pop() != '[') {
					 return 0;
				 }
			  }
			  else {
				  return 0;
			  }
			  
		  }
	     
	      if (stack.isEmpty()) {
	    	  return 1;
	      }else {
	    	  return 0;
	      }
	    }
	  
	  
	   
	  
	   public static void main(String arg[])
	   {
		   System.out.println( new Bracket().solution("{[()()]}"));
		   System.out.println( new Bracket().solution("([)()]"));
 
		   
	   }
}
