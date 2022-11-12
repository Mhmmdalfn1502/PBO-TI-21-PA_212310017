package praktikum3;
import java.util.regex.Pattern;

import  javax.swing.JOptionPane;

public class Latihan4 {
	
	public static void main(String[] args) {
		Biodata myBio = new Biodata ();
		
		String Fullname, Age, Alamat, Konfirmasi;
		
		Fullname = JOptionPane.showInputDialog(null, "Masukkan nama anda  : ", "Form Input", JOptionPane.QUESTION_MESSAGE);
		
//		switch (Fullname) {
//		case JOptionPane.CANCEL_OPTION:
//			Konfirmasi = JOptionPane.showMessageDialog(null, "Apakah anda ingin kelluar ?", JOptionPane.YES_NO_OPTION);
//			if(Konfirmasi == 0) {
//				break;
//			}
//			
//			if else (Konfirmasi == 1) {
//				return;
//			}
//			
//		}
		
		Age = JOptionPane.showInputDialog(null, "Masukkan usia anda  : ", "Form Input",JOptionPane.QUESTION_MESSAGE);
		
		Alamat = JOptionPane.showInputDialog(null, "Masukkan alamat anda : ", "Form Input",JOptionPane.QUESTION_MESSAGE);
		
		if(Fullname && Age && Alamat == (JOptionPane.CANCEL_OPTION)) {
			String Konfirmasi = JOptionPane.showMessageDialog(null, "Apakah anda ingin keluar ? ", "Choose", JOptionPane.YES_NO_OPTION);
			
		}
		
		else if(Fullname.isEmpty() && Alamat.isEmpty() && Age.isEmpty()) {	
			JOptionPane.showMessageDialog(null, "Field [fullname/usia/alamat] tidak boleh kosong", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
 
		else if(!Pattern.matches("^[0-9]+$", Age)) {
			JOptionPane.showMessageDialog(null, "Isian usia harus angka", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
		
		else if(Alamat.length() < 10) {
			JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Seluruh informasi telah dimasukan", "Output Message", JOptionPane.INFORMATION_MESSAGE);
		}
	
	}

}
