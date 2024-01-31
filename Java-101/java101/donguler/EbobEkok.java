package donguler;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		/*Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.

		EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en 
		büyük ortak böleni, kısaca EBOB‘u denir.

		EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en 
		küçük ortak katı, kısaca EKOK‘u denir.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz: ");
		int sayi1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		int sayi2 = scan.nextInt();
		int kucukSayi;
		int buyukSayi;
		int ebob = 0;
		int ekok = 0;
		
		if(sayi1 < sayi2)
		{
			kucukSayi = sayi1;
			buyukSayi = sayi2;
		}
		else
		{
			kucukSayi = sayi2;
			buyukSayi = sayi1;
		}
		
		for(int i = 1; i <= kucukSayi; i++)
		{
			if(kucukSayi % i == 0 && buyukSayi % i == 0)
			{
				ebob = i;
			}
		}
		System.out.println("EBOB: " + ebob);
		
		for(int i = 1; i <= kucukSayi * buyukSayi; i++)
		{
			if(i % kucukSayi == 0 && i % buyukSayi == 0)
			{
				ekok = i; 
				break;
			}
		}
		System.out.println("EKOK: " + ekok);
	}

}
