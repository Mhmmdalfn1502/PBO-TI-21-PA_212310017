package praktikum3;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Latihan3 {
	
	public static void main(String[] args) {
		Biodata myBio = new Biodata();
		
		String Fullname, Age, Alamat;
		
		Fullname = JOptionPane.showInputDialog(null, "Masukkan nama anda  : ", "Form Input", JOptionPane.QUESTION_MESSAGE);
		
		Age = JOptionPane.showInputDialog(null, "Masukkan usia anda  : ", "Form Input",JOptionPane.QUESTION_MESSAGE);
		
		Alamat = JOptionPane.showInputDialog(null, "Masukkan alamat anda : ", "Form Input",JOptionPane.QUESTION_MESSAGE);
		
	
	
		if(Fullname.isEmpty() && Alamat.isEmpty() && Age.isEmpty()) {	
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