package com.codility.practice.five;

public class CountDiv {
	
	public int solution(int A, int B, int K) {
		int count = 0;
		
		int firstRemainder = A % K;
		
		int firstDivisor = A + ( firstRemainder == 0 ? 0 : K - firstRemainder );
		
		
		int lastDivisor = B - ( B % K );
		 
      
         if ( lastDivisor < Integer.MAX_VALUE) {
        	 count = ( lastDivisor - firstDivisor)/K + 1;
         }
         
         return count;
    }

	   public static void main(String arg[])
	   {
		   System.out.print( new CountDiv().solution(6, 11, 2));
		   
	   }
}
