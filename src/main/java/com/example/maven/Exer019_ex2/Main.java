package com.example.maven.Exer019_ex2;

public class Main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		double firstNr = 7;
		double secondNr = 0;
		
		System.out.println(cal.addition(firstNr, secondNr));
		System.out.println(cal.subtraction(firstNr, secondNr));
		System.out.println(cal.multiply(firstNr, secondNr));
		System.out.println(cal.divition(firstNr, secondNr));

	}

}
