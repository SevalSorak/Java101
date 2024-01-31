package donguler;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		// Java ile faktöriyel hesaplayan program yazınız.
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Sayı giriniz: ");
		int sayi = scan.nextInt();
		int f = 1;
		
		for(int i = 1; i <= sayi; i++)
		{
			f = f * i;
		}
		System.out.println("Faktöriyel: " + f);*/
		
		/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı 
		n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde 
		gösterilir.

		Java ile kombinasyon hesaplayan program yazınız.

		Kombinasyon formülü
		C(n,r) = n! / (r! * (n-r)!)*/
		
		System.out.println("Eleman sayısını giriniz: ");
		int eleman = scan.nextInt();
		System.out.println("Küme sayısını giriniz: ");
		int kume = scan.nextInt();
		int n = 1;
		int r = 1;
		int a = 1;
		
		for(int i = 1; i <= kume; i++)
		{
			n = n * i;
		}
		
		for(int i = 1; i <= eleman; i++)
		{
			r = r * i;
		}
		
		for(int i = 1; i <= (kume - eleman); i++)
		{
			a = a * i;
		}
		int c = n / (r * a);
		System.out.println("Kombinasyon: " + c);
	}

}
