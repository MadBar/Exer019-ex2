package com.example.maven.Exer019_ex2;

public class Calculator {
	public double addition(double firstNr,
			double secondNr) {
		double result = firstNr + secondNr;

		return result;
	}

	public double subtraction(double firstNr,
			double secondNr) {
		double result = firstNr - secondNr;

		return result;
	}

	public double multiply(double firstNr,
			double secondNr) {
		double result = firstNr * secondNr;

		return result;
	}

	public double divition(double firstNr,
			double secondNr) {
		// Option Niklas:
		// double result = 0.0;
		// if (secondNr == 0.0) {
		// System.out.println("Can't devide by 0");
		// //result = -100;
		// return -100;
		// }
		// result = firstNr / secondNr;

		// Raf: delar och kollar sen om det blev fel och hanterar det.
		double result = firstNr / secondNr;
		if (Double.isInfinite(result)) {
			System.out.println("Can't devide by 0");
			// result = -100;
			return -0.123456789;
		}

		return result;
	}

}
