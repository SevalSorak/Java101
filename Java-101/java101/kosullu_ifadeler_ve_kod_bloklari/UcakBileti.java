package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		// Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
		// Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
		
		// Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını 
		// hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın.
		
		// Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk 
		// tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" 
		// şeklinde bir uyarı verilmelidir.
		
		// Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
		
		// Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
		
		// Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
		
		// Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim 
		// uygulanır.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mesafeyi giriniz(KM): ");
		double mesafe = scan.nextDouble();
		System.out.println("Yaşınızı giriniz: ");
		int yas = scan.nextInt();
		System.out.println("Yolculuk tipini giriniz(Tek yön -> 1, Gidiş-Dönüş -> 2)");
		int tip = scan.nextInt();
		double toplamFiyat = mesafe * 0.10;
		if(mesafe > 0 && yas > 0 && tip > 0 && tip <=2)
		{
			if(yas <= 12)
			{
				toplamFiyat = toplamFiyat - (toplamFiyat * 0.50);
			}
			else if(yas > 12 && yas < 24)
			{
				toplamFiyat = toplamFiyat - (toplamFiyat * 0.10);
			}
			else if(yas > 65)
			{
				toplamFiyat = toplamFiyat - (toplamFiyat * 0.30);
			}
			if(tip == 2)
			{
				toplamFiyat = (toplamFiyat * 2) - (2 * (toplamFiyat * 0.20));
			}
			System.out.println("Uçak bileti: " + toplamFiyat);	
		}
		else
		{
			System.out.println("Hatalı veri girdiniz!");
		}
		
	}

}
