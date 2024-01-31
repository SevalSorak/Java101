package metotlar;

import java.util.Scanner;

public class RecursiveAsal {
	
	static boolean asal(int a)
	{
		boolean asal = true;
		if(a < 2)
		{
			asal = false;
		}
		else
		{
			for(int i = 2; i < Math.sqrt(a); i++)
			{
				if(a % i == 0)
				{
					asal = false;
					break;
				}
			}
		}
		return asal;
	}

	public static void main(String[] args) {
		/*Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" 
		sayı olup olmadığını bulan programı yazın.

		Senaryo
		Sayı Giriniz : 22
		22 sayısı ASAL değildir !
		
		
		Sayı Giriniz : 2
		2 sayısı ASALDIR !
		
		
		Sayı Giriniz : 39
		39 sayısı ASAL değildir !
		
		
		Sayı Giriniz : 17
		17 sayısı ASALDIR !*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scan.nextInt();
		
		if(asal(sayi) == true)
		{
			System.out.println(sayi + " sayısı asaldır.");
		}
		else
		{
			System.out.println(sayi + " sayısı asal değildir.");
		}
	}

}
