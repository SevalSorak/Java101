package temel_kavramlar_ve_degiskenler;

import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		// Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını 
		// kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Matematik notunuz: ");
		double mat = scan.nextDouble();
		System.out.println("Fizik notunuz: ");
		double fizik = scan.nextDouble();
		System.out.println("Kimya notunuz: ");
		double kimya = scan.nextDouble();
		System.out.println("Türkçe notunuz: ");
		double turkce = scan.nextDouble();
		System.out.println("Tarih notunuz: ");
		double tarih = scan.nextDouble();
		System.out.println("Müzik notunuz: ");
		double muzik = scan.nextDouble();
		double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
		System.out.println("Not ortalaması: " + ort);
		
		// Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 
		// 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
		// Not : If ve Else kullanılmayacak...
		
		String durum = (ort > 60) ? "Sınıfı geçti" : "Sınıfta kaldı";
		System.out.println("Durum: " + durum);
	}

}
