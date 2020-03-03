package com.codility.practice.twelve.euclidean;

public class CommonPrimeDivisors {
	
	  public int solution(int[] A, int[] B) {
		  
		 int count = 0;
		  
		  for ( int i = 0; i < A.length; i++) {
			  
			  int gcd = gcd(A[i],  B[i]);
			  if (gcd > 1 ) {
				  
				  if ( gcd == A[i] ||    gcd(gcd, A[i]/gcd) == 1 ) {
					  
					  if ( gcd == B[i] ||   gcd(gcd, B[i]/gcd) == 1 ) {
						  count++;
					  }
				  }					 
					  
			  }
		  }
		  
 
		  
		  
		   
		   return count;
	      
	   }
	  
	  
	  public int gcd(int N, int M) {
             
		  if ( N % M == 0) {
			  return M;
		  }else {
			  return gcd(M, N%M);
		  }
		  
	  }
	  
	   
	  
	 
	 

	  
	  public static void main(String arg[]) {
		  int A[] = new int[] {15, 10, 3};
		  int B[] = new int[]{ 75, 30, 5};
		  System.out.println( new CommonPrimeDivisors().solution(A, B));
	  }
}
