package com.praktikum;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan04 {
	
	public static void main(String[] args) {
		LocalDateTime waktuSekarang = LocalDateTime.now();
		DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");
		Scanner input = new Scanner(System.in);
		String waktu = waktuSekarang.format(formatWaktu);
		double jumlahBeli;
		double Harga = 6300;
		double Total;
		double Diskon;
		double Sub_Total;
		
		System.out.println("=======================================================");
		System.out.println("\t \tTOKO SERBAGUNA IBIK");
		System.out.println("=======================================================");
		
		System.out.print("Masukkan jumlah produk yang dibeli : ");
		jumlahBeli = input.nextDouble();
		Total = jumlahBeli * Harga;
		
		System.out.println("\n" + waktu);
		
		System.out.println("ITEM \t\t QTY \t\t HARGA \t\t TOTAL");
		
		System.out.println("=======================================================");
		System.out.print("ROTI ENAK.  \t " + jumlahBeli + "\t \tRp " + Harga + "\tRp " + Total + "\n\n");
		
		if (jumlahBeli % 3 == 0) {
			Diskon = 0.05 * Total;
			Sub_Total = Total - Diskon;
			System.out.println("Diskon    : 5%");
		} else {
			Diskon = 0.1 * Total;			
			Sub_Total = Total - Diskon;
			System.out.println("Diskon    : 10%");
		}
		
		System.out.println("Sub Total : Rp " + Sub_Total);
		
		input.close();
	}

}
