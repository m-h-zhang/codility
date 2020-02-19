package com.codility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codility.one_to_four.FrogImpl;

class FrogImplTest {

	@Test
	void testSolution() {
		 FrogImpl f = new FrogImpl();
		
		assertEquals(3,  f.solution(10, 85, 30));
	}

}
