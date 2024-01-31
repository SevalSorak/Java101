package temel_kavramlar_ve_degiskenler;

import java.util.Scanner;

public class KdvTutari {

	public static void main(String[] args) {
		// Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp 
		// ekrana bastıran programı yazın.
		// Not : KDV tutarını 18% olarak alın)
		// KDV'siz Fiyat = 10;
		// KDV'li Fiyat = 11.8;
		// KDV tutarı = 1.8;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Paranın değerini giriniz: ");
		double fiyat = scan.nextDouble();
		double kdvli_fiyat;
		/*double kdvli_fiyat = fiyat + (fiyat * 0.18);
		System.out.println("KDV'siz Fiyat: " + fiyat);
		System.out.println("KDV'li fiyat: " + kdvli_fiyat);
		System.out.println("KDV tutarı: " + fiyat * 0.18);*/
		
		// Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük 
		// ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
		
		if(fiyat > 0 && fiyat < 1000)
		{
			kdvli_fiyat = fiyat + (fiyat * 0.18);
		}
		else
		{
			kdvli_fiyat = fiyat + (fiyat * 0.08);
		}
		System.out.println("KDV'siz Fiyat: " + fiyat);
		System.out.println("KDV'li fiyat: " + kdvli_fiyat);
		System.out.println("KDV tutarı: " + fiyat * 0.18);
	}

}
