package metotlar;

import java.util.Scanner;

public class HesapMakinesi {
		
	static void toplam()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz: ");
		int a = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		int b = scan.nextInt();
		int sonuc = a + b;
		System.out.println("Toplam: " + sonuc);
	}
	
	static void fark()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz: ");
		int a = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		int b = scan.nextInt();
		int sonuc = a - b;
		System.out.println("Fark: " + sonuc);
	}
	
	static void carpim()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz: ");
		int a = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		int b = scan.nextInt();
		int sonuc = a * b;
		System.out.println("Çarpım: " + sonuc);
	}
	
	static void bolum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz: ");
		double a = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		double b = scan.nextInt();
		
		if(b == 0)
		{
			System.out.println("Payda 0 olamaz");
		}
		double sonuc = a / b;
		System.out.println("Toplam: " + sonuc);
	}
	
	static void us()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Taban sayıyı giriniz: ");
		int a = scan.nextInt();
		System.out.println("Üs sayıyı giriniz: ");
		int b = scan.nextInt();
		int sonuc = 1;
		
		for(int i = 0; i < b; i++)
		{
			sonuc = sonuc * a;
		}
		System.out.println("Üs: " + sonuc);
	}
	
	static void fakt()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen sayıyı giriniz: ");
		int a = scan.nextInt();
		int sonuc = 1;
		for(int i = 1; i <= a; i++)
		{
			sonuc = sonuc * i;
		}
		System.out.println("Faktöriyel: " + sonuc);
	}
	
	static void mod()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz: ");
		double a = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		double b = scan.nextInt();
		double sonuc = a % b;
		System.out.println("Mod: " + sonuc);
	}
	
	static void alan_cevre()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Kısa kenarı giriniz: ");
		int a = scan.nextInt();
		System.out.println("Uzun kenarı giriniz: ");
		int b = scan.nextInt();
		int alan = a * b;
		int cevre = 2 * (a + b);
		System.out.println("Alan: " + alan + "\nÇevre: " + cevre);
	}

	public static void main(String[] args) {
		/*Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapınız.

		Hesap makinesinin fonksiyonları:
		
		1- Toplama İşlemi
		2- Çıkarma İşlemi
		3- Çarpma İşlemi
		4- Bölme işlemi
		5- Üslü Sayı Hesaplama
		6- Faktoriyel Hesaplama
		7- Mod Alma
		8- Dikdörtgen Alan ve Çevre Hesabı*/
		
		Scanner scan = new Scanner(System.in);
		int secim;
		String menu = "1 - Toplama İşlemi\n"
				+ "2 - Çıkarma İşlemi\n"
				+ "3 - Çarpma İşlemi\n"
				+ "4 - Bölme işlemi\n"
				+ "5 - Üslü Sayı Hesaplama\n"
				+ "6 - Faktoriyel Hesaplama\n"
				+ "7 - Mod Alma\n"
				+ "8 - Dikdörtgen Alan ve Çevre Hesabı\n"
				+ "0 - Çıkış";
		
		System.out.println(menu);
		
		do
		{
			System.out.println("Lütfen bir işlem seçiniz: ");
			secim = scan.nextInt();
			
			switch(secim)
			{
			case 1:
				toplam();
				break;
			case 2:
				fark();
				break;
			case 3:
				carpim();
				break;
			case 4:
				bolum();
				break;
			case 5:
				us();
				break;
			case 6:
				fakt();
				break;
			case 7:
				mod();
				break;
			case 8:
				alan_cevre();
				break;
			case 0:
				break;
			default:
				System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz!");
			}
		}while(secim != 0);
	}

}
