package com.codility.practice.fourteen.binarysearch;

import java.util.Arrays;

public class NailingPlanks {
	public int solution(int[] A, int[] B, int[] C)
	{
		int minIndex = -1;
		
		int[][] sorted = sort(C);
		 
	   for ( int i  = 0; i < A.length; i++)
	   {
		    
		   minIndex = minIndex(minIndex, sorted, 0, sorted.length - 1,  A[i], B[i] );
		   if (minIndex == -1)
		   {
			   return -1;
		   }	   
		   
	   }
	 
		return minIndex + 1;
	 
	}
	
	private int minIndex( int preResult, int[][] sortedNails,  int nailStartIndex, int nailEndIndex, int prankStart, int prankEnd )
	{
		int minIndex = -1;
		
		 
		while ( nailStartIndex <= nailEndIndex)
		{
			int middle = ( nailStartIndex + nailEndIndex) / 2;
			if ( sortedNails[middle][0] < prankStart )
			{
				nailStartIndex = middle + 1;
			}
			else if ( sortedNails[middle][0] > prankEnd)
			{
				nailEndIndex = middle - 1;
			}
			else
			{
			    if ( sortedNails[middle][1] <= preResult)
				{
					return preResult;
				}
			    else if ( sortedNails[middle][1] == 0)
			    {
			    	return 0;
			    }
			    else if ( minIndex == -1 || minIndex > sortedNails[middle][1])
			    {
			    	minIndex = sortedNails[middle][1];
			    	
			    	int leftMinIndex = minIndex( preResult, sortedNails, nailStartIndex, middle - 1, prankStart, prankEnd );
			    	 
			    	if ( leftMinIndex > preResult && leftMinIndex < minIndex )
			    	{
			    		minIndex = leftMinIndex;
			    	}
			    	int rightMinIndex = minIndex( preResult, sortedNails, middle + 1, nailEndIndex, prankStart, prankEnd);
			    	
			    	 if ( rightMinIndex > preResult && rightMinIndex < minIndex)
			    	 {
			    		 minIndex = rightMinIndex;
			    	 }
			    	 return minIndex;
			    	
			    	
			    }
			     
			}
		}
		 
		
		
		return minIndex;
	}
	
	private int[][] sort( int[] C)
	{
		int result[][] = new int[C.length][2];
		for ( int i = 0; i < C.length; i++)
		{
			result[i][0] = C[i];
			result[i][1] = i;
		}
		
		Arrays.sort(result, (int x[], int y[]) -> x[0] - y[0]);
		
		return result;
	}
	  
	
	  
	  public static void main(String arg[]) {
		  
		  int A[] = new int[] { 1, 4, 5, 8};
		  int B[] = new int[] {4, 5, 9, 10};
		  int C[] = new int[] { 4, 6, 7, 10, 2};  
		 
		  System.out.println(new NailingPlanks().solution( A, B, C));
		  
	  }

}



 

