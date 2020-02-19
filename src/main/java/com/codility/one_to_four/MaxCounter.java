package com.codility.one_to_four;

import java.util.Arrays;

public class MaxCounter {
	
	public int[] solution(int N, int[] A) {
		
		int[] r = new int[N];
		int maxCounter = 0;
		int maxCounterReset = 0;
		for ( int i : A) {
			if ( i <= N ) {
				if ( r[i - 1] >= maxCounterReset) {
					r[i-1]++;
				}else {
					r[i-1] = maxCounterReset + 1;
				}
				if (r[i-1] > maxCounter) {
					maxCounter = r[i-1];
				}
			}else {
		 
				maxCounterReset = maxCounter;
				 
			}
		}
		
		if ( maxCounterReset > 0 ) {
			for ( int i = 0; i < r.length; i++)
			{
				if ( r[i ] < maxCounterReset) {
					r[i] = maxCounterReset;
				}
			}
			 
		}
		
		return r;
        
    }
	
	
	
	public static void main(String[] s) {
		System.out.println(Arrays.toString(new MaxCounter().solution(5, new int[] {3, 4, 4, 6, 1, 4, 4})));
		
	}

}
