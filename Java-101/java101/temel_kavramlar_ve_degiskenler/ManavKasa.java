package temel_kavramlar_ve_degiskenler;

import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		// Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine 
		// göre toplam tutarını ekrana yazdıran programı yazın.
		// Armut : 2,14 TL
		// Elma : 3,67 TL
		// Domates : 1,11 TL
		// Muz: 0,95 TL
		// Patlıcan : 5,00 TL
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç kilo armut aldınız? ");
		int kgArmut = scan.nextInt();
		System.out.println("Kaç kilo elma aldınız? ");
		int kgElma = scan.nextInt();
		System.out.println("Kaç kilo domates aldınız? ");
		int kgDomates = scan.nextInt();
		System.out.println("Kaç kilo muz aldınız? ");
		int kgMuz = scan.nextInt();
		System.out.println("Kaç kilo patlıcan aldınız? ");
		int kgPatlican = scan.nextInt();
		double total = (kgArmut * 2.14) + (kgElma * 3.67) + (kgDomates * 1.11) + (kgMuz * 0.95) + (kgPatlican * 5.00);
		System.out.println("Toplam tutar: " + total);
	}

}
