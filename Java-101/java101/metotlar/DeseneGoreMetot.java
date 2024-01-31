package metotlar;

import java.util.Scanner;

public class DeseneGoreMetot {
	
	public static void recursive(int n)
	{
		System.out.println(n); 

        if (n <= 0) {
            System.out.println(n);
            return;
        }

        recursive(n - 5);
        System.out.println(n);
	}

	public static void main(String[] args) {
		/*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan 
		bir "Recursive" metot yazın.

		Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
		Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan 
		sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
		
		Senaryolar
		N Sayısı : 16
		Çıktısı : 16 11 6 1 -4 1 6 11 16 
		
		
		N Sayısı : 10
		Çıktısı : 10 5 0 5 10 
		
		
		N Sayısı : 25
		Çıktısı : 25 20 15 10 5 0 5 10 15 20 25 
		
		
		N Sayısı : 5
		Çıktısı : 5 0 5*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scan.nextInt();
		
		recursive(sayi);
	}	
}
