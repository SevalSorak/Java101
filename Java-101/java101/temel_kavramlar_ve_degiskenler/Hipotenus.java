package temel_kavramlar_ve_degiskenler;

import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {
		// Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan 
		// programı yazın. c = karekök(a^2 + b^2)
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Dik kenar uzunluklarını giriniz: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		double c = Math.sqrt((a * a) + (b * b));
		System.out.println("Hipotenüs: " + c);*/
		
		// Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
		// Üçgenin çevresi = 2u
		// u = (a + b + c) / 2
		// Alan * Alan = u * (u - a) * (u - b) * (u - c)
		
		System.out.println("Üçgenin kenar uzunluklarını giriniz: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		double u = (a + b + c) / 2;
		double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.println("Üçgenin alanı: " + alan);
		
	}

}
