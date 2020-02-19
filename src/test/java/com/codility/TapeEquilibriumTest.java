package com.codility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codility.one_to_four.TapeEquilibrium;

class TapeEquilibriumTest {

	@Test
	void testSolution() {
		TapeEquilibrium t = new TapeEquilibrium();
		
		assertEquals(1,  t.solution(new int[] {3, 1, 2, 4, 3}));
	}

}
