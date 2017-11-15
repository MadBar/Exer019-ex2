package com.example.maven.Exer019_ex2;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationsTest {

	Calculator cal = new Calculator();
	double firstTestNr = 12;
	double secondTestNr = 4;

	@Test
	public void testAddition() {
		double result = cal.addition(firstTestNr, secondTestNr);
		assertTrue(result == 16);
	}
/*
	@Test
	public void testSubtraction() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivition() {
		fail("Not yet implemented");
	}
*/
}
