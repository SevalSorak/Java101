package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		/*Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

		Çin Zodyağı nedir?
		4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik 
		burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece 
		genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

		Çin Zodyağı nasıl hesaplanır?
		Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

		Doğum Tarihi %12 = 0 ➜ Maymun
		Doğum Tarihi %12 = 1 ➜ Horoz
		Doğum Tarihi %12 = 2 ➜ Köpek
		Doğum Tarihi %12 = 3 ➜ Domuz
		Doğum Tarihi %12 = 4 ➜ Fare
		Doğum Tarihi %12 = 5 ➜ Öküz
		Doğum Tarihi %12 = 6 ➜ Kaplan
		Doğum Tarihi %12 = 7 ➜ Tavşan
		Doğum Tarihi %12 = 8 ➜ Ejderha
		Doğum Tarihi %12 = 9 ➜ Yılan
		Doğum Tarihi %12 = 10 ➜ At
		Doğum Tarihi %12 = 11 ➜ Koyun*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Doğum yılınızı giriniz: ");
		int dogumTarihi = scan.nextInt();
		int sonuc = dogumTarihi % 12;
		
		switch(sonuc)
		{
		case 0:
			System.out.println("Çin Zodyağı: Maymun");
			break;
		case 1:
			System.out.println("Çin Zodyağı: Horoz");
			break;
		case 2:
			System.out.println("Çin Zodyağı: Köpek");
			break;	
		case 3:
			System.out.println("Çin Zodyağı: Domuz");
			break;
		case 4:
			System.out.println("Çin Zodyağı: Fare");
			break;
		case 5:
			System.out.println("Çin Zodyağı: Öküz");
			break;
		case 6:
			System.out.println("Çin Zodyağı: Kaplan");
			break;
		case 7:
			System.out.println("Çin Zodyağı: Tavşan");
			break;
		case 8:
			System.out.println("Çin Zodyağı: Ejderha");
			break;
		case 9:
			System.out.println("Çin Zodyağı: Yılan");
			break;	
		case 10:
			System.out.println("Çin Zodyağı: At");
			break;	
		case 11:
			System.out.println("Çin Zodyağı: Koyun");
			break;	
		default:
			System.out.println("Yanlış değer girdiniz!");
			break;	
		}
	}

}
