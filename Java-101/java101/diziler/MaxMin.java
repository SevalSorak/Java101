package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// Dizideki elemanların maksimum ve minimum değerleri bulan program
		
		/*int[] list = {56, 34, 1, 8, 101, -2, -33};
		int sayi = list[0];
		int ek = 0;
		int eb = 0;
		
		for(int i = 0; i < list.length; i++)
		{
			if(list[i] < sayi)
			{
				ek = list[i];
			}
			if(list[i] > sayi)
			{
				eb = list[i];
			}
		}
		System.out.println("Maksimum değer: " + eb);
		System.out.println("Minimum değer: " + ek);*/
		
		// Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
		
		Scanner scan = new Scanner(System.in);
		int[] dizi = {15,12,788,1,-1,-778,2,0};
		System.out.println("Bir sayı giriniz: ");
		int sayi = scan.nextInt();
		Arrays.sort(dizi);
		System.out.println(Arrays.toString(dizi));
		int ks = 0;
		int bs = 0;
		for(int i : dizi)
		{
			if(i < sayi)
			{
				ks = i;
			}
		}
		for(int j : dizi)
		{
			if(j > sayi)
			{
				bs = j;
				break;
			}
		}
		System.out.println("Girilen sayıdan küçük en yakın sayı: " + ks);
		System.out.println("Girilen sayıdan büyük en yakın sayı: " + bs);
	}

}
