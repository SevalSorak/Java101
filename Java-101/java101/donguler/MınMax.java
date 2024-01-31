package donguler;

import java.util.Scanner;

public class MınMax {

	public static void main(String[] args) {
		// Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları 
		// bulan ve bu sayıları ekrana yazan programı yazın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç tane sayı gireceksiniz? ");
		int n = scan.nextInt();
		System.out.println("1. sayıyı giriniz: ");
		int ilkSayi = scan.nextInt();
		int enBuyuk = ilkSayi;
		int enKucuk = ilkSayi;

		for(int i = 2; i <= n; i++)
		{
			System.out.println(i + ". sayıyı giriniz: ");
			int sayi = scan.nextInt();
			
			if(sayi > enBuyuk)
			{
				enBuyuk = sayi;
			}
			
			if(sayi < enKucuk)
			{
				enKucuk = sayi;
			}
			
		}
		System.out.println("En büyük sayı: " + enBuyuk);
		System.out.println("En küçük sayı: " + enKucuk);
	}

}
