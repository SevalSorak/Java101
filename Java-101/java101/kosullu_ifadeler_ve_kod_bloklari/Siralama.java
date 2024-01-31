package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class Siralama {

	public static void main(String[] args) {
		// Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3 sayı giriniz: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if((a < b) && (a < c))
		{
			if(b < c)
			{
				System.out.println("Sıralama: " + a + " < " + b + " < " + c);
			}
			else
			{
				System.out.println("Sıralama: " + a + " < " + c + " < " + b);
			}
		}
		else if((b < a) && (b < c))
		{
			if(a < c)
			{
				System.out.println("Sıralama: " + b + " < " + a + " < " + c);
			}
			else
			{
				System.out.println("Sıralama: " + b + " < " + c + " < " + a);
			}	
		}
		else
		{
			if(a < b)
			{
				System.out.println("Sıralama: " + c + " < " + a + " < " + b);
			}
			else
			{
				System.out.println("Sıralama: " + c + " < " + b + " < " + a);
			}	
		}	
	}

}
