package Praktikum;
import java.util.Scanner;

public class Latihan02 {

		public static void main(String[] args) {
		
			int NPM, x, y;
			Scanner input = new Scanner(System.in);
			System.out.println("Menentukan Bilangan Prima dari sebuah NPM");
			System.out.print("Masukkan NPM anda : ");
			NPM = input.nextInt();
			x = 0;
		
			for ( y=1; y<=NPM; y++) {
				if(NPM % y == 0) {
				x = x +1;
				}
			}
				if ( x == 2) {
				System.out.println("Termasuk bilangan prima");
			} else {
				System.out.println("Bukan bilangan prima");
		}
		
	}
}