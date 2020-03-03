package com.codility.practice.evelen.sieve;

import java.util.Arrays;

public class CountSemiprimes {
	 public int[] solution(int N, int[] P, int[] Q) {
	        // write your code in Java SE 8
		 
		  int semiPrime[] = new int[N + 1];
		  for ( int i =  2; i <= Math.sqrt(N); i++ ) {
			  int sum = i + i;
			  while (sum <= N) {
				  if (semiPrime[sum] == 0 ) {
					  semiPrime[sum] = i; 
				  }
				  sum +=i;
			  }
		  }
		  
		  boolean semiPrimeFlags[] = new boolean[ N + 1];
		  
		  for ( int i = 2; i <= N; i++)
		  {
			  if ( semiPrime[i] != 0) {
				  if ( semiPrime[i] != i && i % semiPrime[i] == 0  && semiPrime[i /semiPrime[i]] == 0) {
					  semiPrimeFlags[i] = true;
				  }
			  }
		  }
		 
		 
		  
		  int semiToCurrent[] = new int[N + 1];
		  for (int i = 1; i <= N; i++) {
			  semiToCurrent[i] = semiToCurrent[i-1];
			  if ( semiPrimeFlags[i] == true) {
				  semiToCurrent[i] ++;
			  }
		  }
		   
		 
		 
		   int r[] = new int[P.length];
		   for ( int i = 0; i < P.length; i++) {
			  
			   r[i] = semiToCurrent[Q[i]] - semiToCurrent[P[i] - 1];
		   }
		   
		   return r;
	    }
	  
	  
	  public static void main(String arg[]) {
		  
		 int P[] = new int[] {1, 4, 16}; 
		 int Q[] = new int[] { 26, 10, 20};
		 System.out.println(Arrays.toString(new CountSemiprimes().solution(26, P, Q)));
		
		 
	  }

}
