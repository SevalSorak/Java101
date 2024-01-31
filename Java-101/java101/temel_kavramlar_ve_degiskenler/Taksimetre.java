package temel_kavramlar_ve_degiskenler;

import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		// Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
		// Taksimetre KM başına 2.20 TL tutmaktadır.
		// Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
		// Taksimetre açılış ücreti 10 TL'dir.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mesafeyi giriniz: (KM)");
		double mesafe = scan.nextDouble();
		int acilisUcreti = 10;
		double tutar = acilisUcreti + (mesafe * 2.20);
		tutar = (tutar < 20) ? 20 : tutar;
		System.out.println("Taksimetre tıtarı: " + tutar);
	}

}
