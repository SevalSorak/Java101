package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {
		// Hava Sıcaklığına Göre Etkinlik Önerme
		// Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
		// Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
		// Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
		// Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hava sıcaklığını giriniz(C): ");
		double sicaklik = scan.nextDouble();
		
		if(sicaklik < 5)
		{
			System.out.println("Kayak yapabilirsiniz");
		}
		else if(sicaklik > 5 && sicaklik < 15)
		{
			System.out.println("Sinemaya gidebilirsiniz");
		}
		else if(sicaklik > 15 && sicaklik < 25)
		{ 
			System.out.println("Piknik yapabilirsiniz");
		}
		else
		{
			System.out.println("Yüzme yapabilirsiniz");
		}
	}

}
