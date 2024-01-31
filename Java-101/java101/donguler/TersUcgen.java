package donguler;

import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
		// Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, 
		// yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Basamak sayısını giriniz: ");
		int bs = scan.nextInt();
		
		for(int i = bs; i >= 1; i--)
		{
			for(int j = 0; j < bs - i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 2 * i - 1; k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}

}
