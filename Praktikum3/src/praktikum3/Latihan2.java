package praktikum3;

import javax.swing.JOptionPane;
public class Latihan2 {

	public static void main(String[] args) {
		Biodata myBio = new Biodata();
		
		myBio.setFullname(JOptionPane.showInputDialog(null, "Masukkan nama anda  : ", "Form Input", JOptionPane.QUESTION_MESSAGE));
		
		myBio.setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan usia anda  : ", "Form Input", JOptionPane.QUESTION_MESSAGE)));
		
		myBio.setAlamat(JOptionPane.showInputDialog(null, "Masukkan alamat anda : ", "Form Input", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null,"                BIODATA                \nNama kamu " + myBio.getFullname() + "\nUsia kamu " + myBio.getAge() + " tahun " + "\nAlamat kamu " + myBio.getAlamat());
	}

}