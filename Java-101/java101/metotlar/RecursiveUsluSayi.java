package metotlar;

import java.util.Scanner;

public class RecursiveUsluSayi {
	
	static int us(int a, int b)
	{
		int sonuc = 1;
		for(int i = 1; i <= b; i++)
		{
			sonuc = sonuc * a;
		}
		return sonuc;
	}

	public static void main(String[] args) {
		/*Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" 
		metot kullanarak yapan programı yazınız.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Taban sayıyı giriniz: ");
		int taban = scan.nextInt();
		System.out.println("Üssü giriniz: ");
		int us = scan.nextInt();
		
		System.out.println("Sonuç: " + us(taban, us));
	}

}
