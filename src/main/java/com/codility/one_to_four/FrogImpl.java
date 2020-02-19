package com.codility.one_to_four;

public class FrogImpl {
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		
		return  (Y - X) / D + ( (Y - X) % D > 0 ? 1 : 0 );
    }

}
