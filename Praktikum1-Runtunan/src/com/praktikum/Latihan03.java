package com.praktikum;

public class Latihan03 {

	public static void main(String[] args) {
		
		int d, r, t, v, l, k;
		d = 50;
		r = d*1/2;
		t = 66;
		v = 22/7 * r*r * t;
		
		l = 2 * 22/7 * r * (r+t);
		
		k = 2 * 22/7 * r;
		
		System.out.println("Perhitungan Luas, Keliling, dan Volume ruas Tabung ");
		System.out.println("Volume 	 = " + v);
		System.out.println("Luas 	 = " + l);
		System.out.println("Keliling = " + k);
		System.out.println("  ");
		MenghitungKerucut();
	 
	}
	
		static void MenghitungKerucut () {
		int LK, t, r, s, v;
		r = 25;
		s = 15;
		t = 35;
		LK = 22/7 * r * (s + r);
		
		v = 1/3 * 22/7 * r * r * t;
		
		System.out.println("Menghitung Luas, Volume ruas Kerucut");
		System.out.println("Luas   = " + LK);
		System.out.println("Volume = " + v);

	}

}