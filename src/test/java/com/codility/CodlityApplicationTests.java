package com.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.codility.one_to_four.BinaryGap;
 
class CodlityApplicationTests {

	@Test
	void contextLoads() {
		BinaryGap o = new BinaryGap();
		
		assertEquals(0, o.getMaxGap("10000"));
	
		
		assertEquals(1, o.getMaxGap("10100"));
		assertEquals(3, o.getMaxGap("100100010"));
		assertEquals(3, o.getMaxGap("0000100100010"));
	}

}
