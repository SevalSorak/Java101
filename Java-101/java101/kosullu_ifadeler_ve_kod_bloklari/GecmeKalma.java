package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class GecmeKalma {

	public static void main(String[] args) {
		// Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
		// Geçme Notu : 55
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Matematik notunu giriniz: ");
		double mat = scan.nextDouble();
		System.out.println("Fizik notunu giriniz: ");
		double fizik = scan.nextDouble();
		System.out.println("Türkçe notunu giriniz: ");
		double turkce = scan.nextDouble();
		System.out.println("Kimya notunu giriniz: ");
		double kimya = scan.nextDouble();
		System.out.println("Müzik notunu giriniz: ");
		double muzik = scan.nextDouble();
		double ort = (mat + fizik + turkce + kimya + muzik) / 5;
		if(ort >= 55)
		{
			System.out.println("Sınıfı geçtiniz. Ortalamanız: " + ort);
		}
		else
		{
			System.out.println("Sınıfta kaldınız. Ortalamanız: " + ort);
		}*/
		
		// Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
		
		int toplamDers = 5;
		int dersAzalt = 0;
		System.out.println("Matematik notunu giriniz: ");
		double mat = scan.nextDouble();
		System.out.println("Fizik notunu giriniz: ");
		double fizik = scan.nextDouble();
		System.out.println("Türkçe notunu giriniz: ");
		double turkce = scan.nextDouble();
		System.out.println("Kimya notunu giriniz: ");
		double kimya = scan.nextDouble();
		System.out.println("Müzik notunu giriniz: ");
		double muzik = scan.nextDouble();
		
		if(mat < 0 && mat > 100)
		{
			mat = 0;
			dersAzalt++;
		}
		if(fizik < 0 && fizik > 100)
		{
			fizik = 0;
			dersAzalt++;
		}
		if(turkce < 0 && turkce > 100)
		{
			turkce = 0;
			dersAzalt++;
		}
		if(kimya < 0 && kimya > 100)
		{
			kimya = 0;
			dersAzalt++;
		}
		if(muzik < 0 && muzik > 100)
		{
			muzik = 0;
			dersAzalt++;
		}
		
		double ort = (mat + fizik + turkce + kimya + muzik) / (toplamDers - dersAzalt);
		
		if(ort >= 55)
		{
			System.out.println("Sınıfı geçtiniz. Ortalamanız: " + ort);
		}
		else
		{
			System.out.println("Sınıfta kaldınız. Ortalamanız: " + ort);
		}
	}

}
