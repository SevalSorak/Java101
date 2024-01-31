package donguler;

import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		// Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Taban sayıyı giriniz: ");
		int taban = scan.nextInt();
		System.out.println("Üssünü giriniz: ");
		int us = scan.nextInt();
		int sonuc = 1;
		
		/*for(int i = 1; i <= us; i++)
		{
			sonuc = sonuc * taban;
		}
		System.out.println("Sonuç: " + sonuc);*/
		
		// Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı 
		// "While Döngüsü" kullanarak yapınız.
		
		int i = 1;
		while(i <= us)
		{
			sonuc = sonuc * taban;
			i++;
		}
		System.out.println("Sonuç: " + sonuc);
	}

}
