package temel_kavramlar_ve_degiskenler;

import java.util.Scanner;

public class AlanCevre {

	public static void main(String[] args) {
		// Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan 
		// programı yazın.
		// Alan Formülü : π * r * r;
		// Çevre Formülü : 2 * π * r;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz: ");
		int r = scan.nextInt();
		double pi = 3.14;
		/*double alan = pi * r * r;
		double cevre = 2 * pi * r;
		System.out.println("Dairenin alanı: " + alan);
		System.out.println("Dairenin çevresi: " + cevre);*/
		
		// Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
		// 𝜋 sayısını = 3.14 alınız.
		// Formül : (𝜋 * (r*r) * 𝛼) / 360
		
		System.out.println("Merkez açısının ölçüsünü giriniz: ");
		int a = scan.nextInt();
		double aciAlan = (pi * (r * r) * a) / 360;
		System.out.println("Daire diliminin alanı: " + aciAlan);
	}

}
