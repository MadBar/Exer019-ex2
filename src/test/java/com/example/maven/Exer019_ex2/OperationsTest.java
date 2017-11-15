package com.example.maven.Exer019_ex2;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationsTest {

	Calculator cal = new Calculator();
	double firstTestNr = 12;
	double secondTestNr = 4;

	@Test
	public void testAddition() {
		
		//Antingen assertTrue eller assertEquals
		assertEquals(cal.addition(firstTestNr, secondTestNr), 16, 0);
		
		//Min lösning
		//double result = cal.addition(firstTestNr, secondTestNr);
		//assertTrue(result == 16);
	
		//Raf mod av min lös:
		//assertTrue(cal.addition(firstTestNr, secondTestNr) == 16);
	}

	@Test
	public void testSubtraction() {
//		double result = cal.subtraction(firstTestNr, secondTestNr);
//		assertTrue(result == 8);
		
		assertEquals(cal.subtraction(firstTestNr, secondTestNr), 8, 0);
	}

	@Test
	public void testMultiply() {
//		double result = cal.multiply(firstTestNr, secondTestNr);
//		assertTrue(result == 48);
		
		assertEquals(cal.multiply(firstTestNr, secondTestNr), 48, 0);
	}

	@Test
	public void testDivition() {
//		double result = cal.divition(firstTestNr, secondTestNr);
//		assertTrue(result == 3);
		
		assertEquals(cal.divition(firstTestNr, secondTestNr), 3, 0);
	}
	
	@Test
	public void testDivitionZero() {
		assertEquals(cal.divition(firstTestNr, 0), -0.123456789, 0);
	}

}
