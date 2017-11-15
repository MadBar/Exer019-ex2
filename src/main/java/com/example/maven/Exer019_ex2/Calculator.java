package com.example.maven.Exer019_ex2;

public class Calculator {
	public double addition(double firstNr,
			double secondNr) {
		double result = 0.0;

		result = firstNr + secondNr;

		return result;
	}

	public double subtraction(double firstNr,
			double secondNr) {
		double result = 0.0;

		result = firstNr - secondNr;

		return result;
	}

	public double multiply(double firstNr,
			double secondNr) {
		double result = 0.0;

		result = firstNr * secondNr;

		return result;
	}

	public double divition(double firstNr,
			double secondNr) {
		double result = 0.0;

		if (secondNr == 0.0) {
			System.out.println("Can't devide by 0");
			//result = -100;
			return -100;
		}

		result = firstNr / secondNr;

		return result;
	}

}
