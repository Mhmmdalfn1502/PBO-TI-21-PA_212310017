package Praktikum;

import java.util.Scanner;

public class Latihan03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Menu Sarapan");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Bubur Ayam");
		System.out.println("3. Soto Ayam");
		System.out.println("Piilhan menu diatas : ");
		int pilihan = input.nextInt();
		
		
		switch (pilihan) {
		case 1: {
			System.out.println("Anda memesan Nsi Goren dengan harga Rp.22.000");
		break;
		}
		case 2: {
			System.out.println("Anda memesan Bubur Ayam dengan harga Rp.15.000");			
			break;
		}
		case 3: {
			System.out.println("Anda memesan Soto Ayam dengan harga Rp.25.000");
			break;
		}
		}
	}
}
