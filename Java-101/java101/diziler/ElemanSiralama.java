package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class ElemanSiralama {

	public static void main(String[] args) {
		
		/*Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. 
		izinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizinin boyutunu giriniz: ");
		int boyut = scan.nextInt();
		int[] dizi = new int[boyut];
		System.out.println("Dizinin elemanlarını giriniz: ");
		for(int i = 0; i < dizi.length; i++)
		{
			dizi[i] = scan.nextInt();
		}
		Arrays.sort(dizi);
		System.out.println("Sıralama: " + Arrays.toString(dizi));
	}

}
