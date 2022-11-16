package com.praktikum;

import java.util.Scanner;

public class Latihan06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String Usia;
		String Firstname;
		String Lastname;
		String NPM;
		
		System.out.print("Masukkan Usia       : ");
		Usia = input.nextLine();

		System.out.print("Masukkan Nama awal  : ");
		Firstname = input.nextLine();
		
		System.out.print("Masukkan Nama akhir : ");
		Lastname = input.nextLine();
		
		System.out.print("Masukkan NPM        : ");
		NPM = input.nextLine();
		
		System.out.println(Usia.concat(Firstname).concat(Lastname).concat(NPM));
		
		input.close();
	}

}
