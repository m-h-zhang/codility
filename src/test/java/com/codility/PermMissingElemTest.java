package com.codility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codility.one_to_four.PermMissingElem;

class PermMissingElemTest {

	@Test
	void test() {
		
		PermMissingElem m = new PermMissingElem();
		 assertEquals(4,  m.solution(new int[] {2,3,1,5}));
		 
		 int[] j = new int[ 100000 ];
		 for (int i = 0; i < j.length ; i++) {
			 j[i] = i + 2;
			
		 }
		 
		 assertEquals(1, m.solution(j));
		 
	}

}
