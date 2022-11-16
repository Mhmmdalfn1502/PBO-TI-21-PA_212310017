package com.praktikum;

public class Latihan02 {

	public static void main(String[] args) {
	
		int F, C, K;
		C = 90;
		F = (9/5 * C) + 32;
		K = (C + 273);

		System.out.println("Convert Celcius to Fahrenheit");
		System.out.println("C = " + C);
		System.out.println("F = (9/5 * C) + 32");
		System.out.println("  = " + F);
		System.out.println("   ");
		System.out.println("Convert Celcius to Kelvin");
		System.out.println("K = (C + 273)");
		System.out.println("  = " + K);
		System.out.println("  ");
	}
	
	static void CelciusToFahrenheit() {
		int C = 90;
		int F = (9/5 * C) + 32;
		
		System.out.println("Conver Celcius to Fahrenheit");
		System.out.println("C = " + C);
		System.out.println("F = " + F);
	}
	
}