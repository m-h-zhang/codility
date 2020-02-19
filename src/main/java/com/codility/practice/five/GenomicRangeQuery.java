package com.codility.practice.five;

import java.util.Arrays;

public class GenomicRangeQuery {
	
	
	 public int[] solution(String S, int[] P, int[] Q) {
	        //A, C, G, T
		   int M = P.length;
		   int[] result = new int[M];
		   
		 
		   long c = S.length() + 1;
		   long g = c * c;
		   long t = c * g;
		   
		   long count[] = new long[S.length()];
		   long sum = 0;
		   for ( int i =0; i < S.length(); i++) {
			   char ch = S.charAt(i);
			   if ( ch == 'A') {
				   sum ++;
			   }else  if ( ch == 'C') {
				   sum += c;
			   }else  if ( ch == 'G') {
				   sum += g;
			   }else  if ( ch == 'T') {
				   sum += t;
			   }
			   count[i] = sum;
		   }
		   
		   
		   for (int i =0; i< M; i++) {
			    long diff = 0;
			    if (P[i] == 0) {
			    	diff = count[Q[i]];
			    }else {
			    	diff = count[Q[i]] - count[P[i] - 1];
			    }
			    if ( diff % c > 0  ) {
			    	result[i] = 1;
			    }else if ( diff % g >= c ) {
			    	result[i] = 2;
			    }else if ( diff % t >= g) {
			    	result[i] = 3;
			    }else  {
			    	result[i] = 4;
			    }
		   }
		  return result;
	 }
	 
	 public static void main(String sa[]) {
		 int P[] = new int[] {2, 5, 0};
		 int Q[] = new int[] {4, 5, 6};
		 String s = "CAGCCTA";
		 System.out.println(Arrays.toString(new GenomicRangeQuery().solution(s, P, Q)));
		 
		  
	 }
}
