package com.praktikum;

import java.util.Scanner;

public class Latihan07 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String Nama;
		
		System.out.print("Masukkan Nama : ");
		Nama = input.nextLine();
		
		System.out.println("Kalimat awal  : " + Nama);
		System.out.println("Kalimat edit  : " + Nama.replaceAll("[aiueo]", "X"));
		
		input.close();
	}
		
}
