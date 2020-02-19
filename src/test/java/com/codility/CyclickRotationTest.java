package com.codility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codility.one_to_four.CyclicRotataion;

class CyclickRotationTest {

	@Test
	void testSolution() {
		CyclicRotataion o = new CyclicRotataion();     
		
		assertArrayEquals(new int[] {}, o.solution(new int[] {}, 4));
		
		assertArrayEquals(new int[] {9, 7, 6, 3, 8}, o.solution(new int[] {3, 8, 9, 7, 6}, 3));		
		assertArrayEquals(new int[] {0, 0, 0}, o.solution(new int[] {0, 0, 0}, 1));
		
		assertArrayEquals(new int[] {1, 2, 3, 4}, o.solution(new int[] {1, 2, 3, 4}, 4));
	}

}


 