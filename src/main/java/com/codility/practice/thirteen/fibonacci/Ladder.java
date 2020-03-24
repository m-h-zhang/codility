package com.codility.practice.thirteen.fibonacci;

import java.util.Arrays;

public class Ladder {
	 
    
public int[] solution(int[] A, int[] B){
		
		int[] fabs = new int[A.length];
		int result[] = new int[A.length];
		 
		 
		for (int i = 0; i < fabs.length; i++)
		{
			if (i == 0  )
			{
				fabs[i] = 1;
			}
			else if (i == 1  )
			{
				fabs[i] = 2;
			}
			else
			{
			
				fabs[i] = (fabs[i - 1] + fabs[i - 2]) % (1 << 30);
			}
		}
		
		for (int i  = 0; i < A.length; i++)
		{
			 
			
			result[i] = fabs[A[i] - 1] % ( 1 << B[i]);
		}
		return result;
        
        
    }
    
    
     
	  
	  public static void  main(String arg[]) {
		 int[] A = new int[] { 4, 4, 5, 5, 1};
		 int[] B = new int[] { 3, 2, 4, 3, 1};
		 
		 System.out.println(Arrays.toString( new Ladder().solution(A, B)));
		 
		 
	  }

}
