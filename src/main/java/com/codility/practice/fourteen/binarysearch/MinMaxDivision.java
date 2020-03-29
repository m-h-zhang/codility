package com.codility.practice.fourteen.binarysearch;

public class MinMaxDivision {
	  public int solution(int K, int M, int[] A) {
	        // write your code in Java SE 8
		  if (A.length == 0)
		  {
			  return 0;
		  }
		  
		
		  
		  int sum = 0;
		  int maxNum = Integer.MIN_VALUE;
		  for ( int i : A)
		  {
			  if ( i > maxNum)
			  {
				  maxNum = i;
			  }
			  sum += i;
		  }
		  
		  
		  if ( K == 1)
		  {
			  return sum;
		  }
		  
		  if ( K >= A.length)
		  {
			  return maxNum;
		  }
		  
		  
		  
		  
		  int lowBoundary = maxNum;
		  int highBoundary = sum;
 
		  
		  while ( lowBoundary < highBoundary )
		  {
			  int middle = (lowBoundary + highBoundary)/2;			 
			  if ( isGood(middle, A, K) )
			  {
				  highBoundary = middle;
				  
			  }
			  else
			  {
				  lowBoundary = middle + 1;
			  } 
		  }
		  
		  return highBoundary;
	    }
	  
	  
	  
	  public boolean isGood( int maxBlockSum, int[] A,  int maxBlocks )
	  {
		  int block = 1;
		  int tempBlockSum = 0;
		  for ( int i : A)
		  {
			  
			  if (tempBlockSum + i <= maxBlockSum ) 
			  {
				  tempBlockSum += i;
			  }
			  else
			  {
				  block++;
				  
				  if ( block > maxBlocks)
				  {
					  return false;
				  }
				  
				  tempBlockSum = i ;
			  }
		  }
		  return true;
		  
		  
		  
	  }
	  
	  
	  public static void main(String arg[]) {
		  //int A[] = new int[] {42};
		  
		  //A[0] = 0;
		 
		  int A[] = new int[] {2, 1, 5, 1, 2, 2, 2};
		  
	 
		  
		 
		  System.out.println(new MinMaxDivision().solution( 3, 5, A));
		  
	  }

}



 

