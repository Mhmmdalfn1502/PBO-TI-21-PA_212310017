import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Array1Dimesi {
	
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String baris = jop.showInputDialog(null, "Masukkan baris array : ");
		String kolom = jop.showInputDialog(null, "Masukkan kolom array : ");
		
		int row = Integer.parseInt(baris), column=Integer.parseInt(kolom);
		int arr[][] = new int[row][column];
		
		for (int i = 0;i < arr.length; i++) {
			for (int j = 0; j <arr[0].length; j++) {
				String value = jop.showInputDialog(null,"Masukkan angka");
				arr[i][j] = Integer.parseInt(value);
			}	
		}
		
		String output = "";
		
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < column; y++) {
				output += "x["+x+"]["+y+"]="+arr[x][y]+"\n";
			}
		}
		
		jop.showMessageDialog(jop, output);
		
	}
	
}

