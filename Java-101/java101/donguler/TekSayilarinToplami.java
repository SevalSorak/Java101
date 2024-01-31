package donguler;

import java.util.Scanner;

public class TekSayilarinToplami {

	public static void main(String[] args) {
		// Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul 
		// eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
		
		Scanner scan = new Scanner(System.in);
		/*int toplam = 0;
		int sayi;
		
		do
		{
			System.out.println("Değer giriniz: ");
			sayi = scan.nextInt();
			if(sayi % 2 == 1)
			{
				toplam = toplam + sayi;
			}
		} while(sayi > 0);
		
		System.out.println("Toplam: " + toplam);*/
		
		// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve 
		// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan 
		// programı yazıyoruz.
		
		int toplam = 0;
		int sayi;
		
		do
		{
			System.out.println("Değer giriniz: ");
			sayi = scan.nextInt();
			if(sayi % 4 == 0)
			{
				toplam = toplam + sayi;
			}
		}while(sayi % 2 == 0);
		
		System.out.println("Toplam: " + toplam);
	}
}
