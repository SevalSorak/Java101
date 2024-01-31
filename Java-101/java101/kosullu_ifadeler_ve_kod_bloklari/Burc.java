package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class Burc {

	public static void main(String[] args) {
		// Burç bulan program
		// Koç Burcu : 21 Mart - 20 Nisan
		// Boğa Burcu : 21 Nisan - 21 Mayıs
		// İkizler Burcu : 22 Mayıs - 22 Haziran
		// Yengeç Burcu : 23 Haziran - 22 Temmuz
		// Aslan Burcu : 23 Temmuz - 22 Ağustos
		// Başak Burcu : 23 Ağustos - 22 Eylül
		// Terazi Burcu : 23 Eylül - 22 Ekim
		// Akrep Burcu : 23 Ekim - 21 Kasım
		// Yay Burcu : 22 Kasım - 21 Aralık
		// Oğlak Burcu : 22 Aralık - 21 Ocak
		// Kova Burcu : 22 Ocak - 19 Şubat
		// Balık Burcu : 20 Şubat - 20 Mart
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Doğduğunuz ay:(rakamla) ");
		int ay = scan.nextInt();
		System.out.println("Doğduğunuz gün: ");
		int gun = scan.nextInt();
		
		switch(ay)
		{
		case 1:
			if(gun >= 1 && gun < 22)
			{
				System.out.println("Oğlak Burcu");
			}
			else
			{
				System.out.println("Kova Burcu");
			}
			break;
		case 2:
			if(gun >= 1 && gun < 19)
			{
				System.out.println("Kova Burcu");
			}
			else
			{
				System.out.println("Balık Burcu");
			}
			break;
		case 3:
			if(gun >= 1 && gun < 20)
			{
				System.out.println("Balık Burcu");
			}
			else
			{
				System.out.println("Koç Burcu");
			}
			break;
		case 4:
			if(gun >= 1 && gun < 20)
			{
				System.out.println("Koç Burcu");
			}
			else
			{
				System.out.println("Boğa Burcu");
			}
			break;
		case 5:
			if(gun >= 1 && gun < 21)
			{
				System.out.println("Boğa Burcu");
			}
			else
			{
				System.out.println("İkizler Burcu");
			}
			break;
		case 6:
			if(gun >= 1 && gun < 22)
			{
				System.out.println("İkizler Burcu");
			}
			else
			{
				System.out.println("Yengeç Burcu");
			}
			break;
		case 7:
			if(gun >= 1 && gun < 22)
			{
				System.out.println("Yengeç Burcu");
			}
			else
			{
				System.out.println("Aslan Burcu");
			}
			break;	
		case 8:
			if(gun >= 1 && gun < 22)
			{
				System.out.println("Aslan Burcu");
			}
			else
			{
				System.out.println("Başak Burcu");
			}
			break;
		case 9:
			if(gun >= 1 && gun < 22)
			{
				System.out.println("Başak Burcu");
			}
			else
			{
				System.out.println("Terazi Burcu");
			}
			break;
		case 10:
			if(gun >= 1 && gun < 21)
			{
				System.out.println("Terazi Burcu");
			}
			else
			{
				System.out.println("Akrep Burcu");
			}
			break;
		case 11:
			if(gun >= 1 && gun < 21)
			{
				System.out.println("Akrep Burcu");
			}
			else
			{
				System.out.println("Yay Burcu");
			}
			break;	
		default:
			System.out.println("Yay Burcu");
			break;
		}
	}

}
