package com.codility.practice.twelve.euclidean;

public class ChocolatesByNumbers {
	  public int solution(int N, int M) {
	      
		  int gcd = gcd(N, M);
		  long result = (long) N * M /gcd/M;
		   return (int)result;
		  
	    }
	  
	  public int gcd(int N, int M) {
		  if ( M > N ) {
			  return gcd( M, N);
		  }
		  else
		  {
			  if ( N % M == 0) {
				  return M;
			  }
			  else {
				  return gcd(N-M, M);
			  }
		  }
	  }
	  
	  public static void  main(String arg[]) {
		  System.out.println(new ChocolatesByNumbers().solution(10, 4));
	  }

}
