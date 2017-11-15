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

	@Test
	public void testSubtraction() {
		double result = cal.subtraction(firstTestNr, secondTestNr);
		assertTrue(result == 8);
	}

	@Test
	public void testMultiply() {
		double result = cal.multiply(firstTestNr, secondTestNr);
		assertTrue(result == 48);
	}

	@Test
	public void testDivition() {
		double result = cal.divition(firstTestNr, secondTestNr);
		assertTrue(result == 3);
	}

}
