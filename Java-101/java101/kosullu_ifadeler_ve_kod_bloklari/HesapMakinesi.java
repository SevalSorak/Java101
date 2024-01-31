package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir seçim yapınız:\n1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
		int secim = scan.nextInt();
		System.out.println("İki sayı giriniz: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		/*if(secim == 1)
		{
			System.out.println("Toplam: " + (a + b));
		}
		else if(secim == 2)
		{
			System.out.println("Fark: " + (a - b));
		}
		else if(secim == 3)
		{
			System.out.println("Çarpım: " + (a * b));
		}
		else if(secim == 4)
		{
			if(b == 0)
			{
				System.out.println("Bir sayı sıfıra bölünemez!");
			}
			else
			{
				System.out.println("Bölüm: " + (a / b));
			}
		}
		else
		{
			System.out.println("Yanlış seçim yaptınız! Tekrar deneyiniz.");
		}*/
		
		// Hesap makinesini switch-case kullanarak yapınız.
		
		switch(secim) 
		{
		case 1:
			System.out.println("Toplam: " + (a + b));
			break;
		case 2:
			System.out.println("Fark: " + (a - b));
			break;
		case 3:
			System.out.println("Çarpım: " + (a * b));
			break;
		case 4:
			if(b == 0)
			{
				System.out.println("Bir sayı sıfıra bölünemez!");
			}
			else
			{
				System.out.println("Bölüm: " + (a / b));
			}
		default:	
			System.out.println("Yanlış seçim yaptınız! Tekrar deneyiniz.");
			break;
		}
	}

}
