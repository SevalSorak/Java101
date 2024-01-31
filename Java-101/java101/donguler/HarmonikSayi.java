package donguler;

import java.util.Scanner;

public class HarmonikSayi {

	public static void main(String[] args) {
		// Java ile girilen sayının harmonik serisini bulan program yazınız.
		// 1 + 1/2 + 1/3 + 1/n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayıyı giriniz: ");
		int sayi = scan.nextInt();
		double toplam = 0.0;
		
		for(int i = 1; i <= sayi; i++)
		{
			toplam = toplam + (1.0 / i);
		}
		System.out.println("Harmonik sayı: " + toplam);
	}

}
