package com.codility.practice.twelve.euclidean;

import java.util.HashSet;
import java.util.Set;

public class CommonPrimeDivisors {
	
	  public int solution(int[] A, int[] B) {
		  
		 int count = 0;
		  
		  for ( int i = 0; i < A.length; i++) {
			   Set<Integer> aPrimes = getPrimeFactors(A[i]);
			   Set<Integer> bPrimes = getPrimeFactors(B[i]);
			   if ( aPrimes.equals(bPrimes)) {
				   count++;
			   }
		  }
		  
 
		  
		  
		   
		   return count;
	      
	   }
	  
	  
	  public Set<Integer> getPrimeFactors(int N) {
             
		  Set<Integer> s  = new HashSet<>();
		  int num  = N;
		  if ( num % 2 == 0 ) {
			  s.add(2);
			  while ( num % 2 == 0) {
				 
				  num = num /2;
			  }
		  }
		  
		  for ( int i  = 3; i <= Math.sqrt( num); i = i + 2) {
			  if ( num % i == 0) {
				  s.add(i);
				  while ( num % i == 0) {
					  num = num / i;
				  }
			  }
		  }
		  if (num > 2) {
			  s.add(num);
		  }
		  
		  return s;
	  }
	  
	   
	  
	 
	 

	  
	  public static void main(String arg[]) {
		  int A[] = new int[] {15, 10, 3};
		  int B[] = new int[]{ 75, 30, 5};
		  System.out.println( new CommonPrimeDivisors().solution(A, B));
	  }
}
