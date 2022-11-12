import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ArrayPenjumlahan {
	public static void main(String[] args) {
		
		int [][] a= {
				{2,8},
				{9,3}
		};
		int [][] b= {
				{2,4},
				{4,6}
		};
		printArray(a);
		printArray(b);
		
		System.out.println("Penjumlahan");
		int[][] hasilTambah = tambah(a,b);
		printArray(hasilTambah);
	}
	private static int [][] tambah(int [][]a, int [][]b) {
		int baris_a = a.length;
		int kolom_a = b[0].length;
		
		int baris_b = a.length;
		int kolom_b = b[0].length;

		int [][] hasil = new int [baris_a][kolom_a];
		
		for(int i=0; i<kolom_a; i++) {//baris
			for(int  j=0; j<kolom_a; j++) {//kolom
				hasil[i][j] = a[i][j] + b[i][j];
			}
		}
		return hasil;
		
	}
	
	public static void printArray(int[][] a) {
		int row = a.length;
		int column = a[0].length;
		for(int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}

