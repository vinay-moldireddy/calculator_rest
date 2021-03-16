package com.moldireddy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {
	CalculatorController cc = new CalculatorController();
	@Test
	void test() {
		assertEquals(13, cc.add(5, 8));
	}
	
}
