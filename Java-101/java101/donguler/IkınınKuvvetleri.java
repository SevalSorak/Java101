package donguler;

import java.util.Scanner;

public class IkınınKuvvetleri {

	public static void main(String[] args) {
		// Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran 
		// programı yazıyoruz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = scan.nextInt();
		
		/*for(int i = 0; i <= sayi; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}*/
		
		// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran 
		// programı yazıyoruz.
		
		for(int i = 0; i <= sayi; i++)
		{
			if((i % 4 == 0) && (i % 5 == 0))
			{
				System.out.println(i);
			}
		}
	}

}
