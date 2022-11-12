import javax.management.openmbean.OpenMBeanAttributeInfo;

public class Array {
	
	public static void main(String[] args) {
		int [] angka = new int[5];
		angka[0] = 3;
		angka[1] = 4;
		angka[2] = 5;
		angka[3] = 6;
		angka[4] = 7;
		
		System.out.println(angka[0]);
		System.out.println(angka[1]);
		System.out.println(angka[2]);
		System.out.println(angka[3]);
		System.out.println(angka[4]);
		
		System.out.println("=with loop=");
		for (int i = 0; i < 5; i++) {
			System.out.println("Index ke-" + i+ " adalah" + angka[i]);		
		}
		System.out.println("=foreach=");
		for (int value : angka) {
			System.out.println(value);
		}
	}
}
