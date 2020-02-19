package com.codility.ten;

public class CountFactor {
	
	public int solution(int N)
	{
		
		int num = 2;
		
		int squreRoot = (int)Math.sqrt( N);
		
		for ( int i = 2; i <= squreRoot;  i++) {
			
			if ( N % i == 0 ) {
				num += 2;
				 
			}
		}
		if ( N == squreRoot * squreRoot ) 
		{
			num--;
		}
		return num;
	}
	
	public static void main(String arg[]) {
		new CountFactor().solution(24);
	}
	

}
