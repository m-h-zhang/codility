package com.codility.one_to_four;


// 1- binary string
public class BinaryGap {
	
	public int solution(int N) {
		
		return getMaxGap(Integer.toBinaryString(N));
	}
	
	public int getMaxGap(String s) {
		int maxGap = 0;
		int startIndex = -1;
		for ( int i = 0; i < s.length(); i++) {
			if ( s.charAt(i) == '1') {
				if (startIndex != -1 ) {
					maxGap = (i - startIndex -1 ) > maxGap ? i - startIndex -1 : maxGap;
					
				}
				startIndex = i;
			}
		}
		return maxGap;
		
		 
	}
	
	public   static void main(String[] args)
	{
		 long i  = ((long)Integer.MAX_VALUE/2) * Integer.MAX_VALUE ;
		 System.out.println( i);
	}

}
