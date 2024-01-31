package temel_kavramlar_ve_degiskenler;

import java.util.Scanner;

public class VKI {

	public static void main(String[] args) {
		// Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki 
		// formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
		// Kilo (kg) / Boy(m) * Boy(m)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyunuzu giriniz(m): ");
		double boy = scan.nextDouble();
		System.out.println("Kilonuzu giriniz(kg): ");
		double kilo = scan.nextDouble();
		double vki = kilo / (boy * boy);
		System.out.println("Vücut Kitle İndeksi: " + vki);

	}

}
