package donguler;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// Java döngüler ile fibonacci serisi bulan program yazınız. 
		// Fibonacci serisinin eleman sayısını kullanıcıdan alın.
		// 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Eleman sayısını giriniz: ");
		int elemanSayisi = scan.nextInt();
		int ilkEleman = 0;
		int ikinciEleman = 1;
		for(int i = 1; i <= elemanSayisi; i++)
		{
			System.out.print(ilkEleman + " ");
			int gecici = ilkEleman + ikinciEleman;
			ilkEleman = ikinciEleman;
			ikinciEleman = gecici;
		}
	}

}
