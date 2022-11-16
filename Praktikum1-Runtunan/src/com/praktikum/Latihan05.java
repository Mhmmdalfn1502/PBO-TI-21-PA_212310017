package com.praktikum;

import java.util.Scanner;

public class Latihan05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String word;
		
		System.out.print("Masukkan kalimat : ");
		word = input.nextLine();
		
		System.out.println("Kalimat sebelum UpperCase : " + word);
		System.out.println("Kalimat sesudah UpperCase : " + word.toUpperCase());
		
		input.close();
	}
}
