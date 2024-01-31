package ogrenci_bilgi_sistemi;

public class Ogrenci {
	Ders c1;
	Ders c2;
	Ders c3;
	String isim;
	String ogrenciNumarası;
	String siniflar;
	double ort;
	boolean gecmeDurumu;
	
	public Ogrenci(String isim, String ogrenciNumarası, String siniflar, Ders c1, Ders c2,
			Ders c3) 
	{
		this.isim = isim;
		this.ogrenciNumarası = ogrenciNumarası;
		this.siniflar = siniflar;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.ort = 0.0;
		this.gecmeDurumu = false;
	}
	
	void notEkle(int not1, int not2, int not3)
	{
		if(not1 >= 0 && not1 <= 100)
		{
			this.c1.not = not1;
		}
		
		if(not2 >= 0 && not2 <= 100)
		{
			this.c2.not = not2;
		}
		
		if(not3 >= 0 && not3 <= 100)
		{
			this.c3.not = not3;
		}
	}
	
	void gecmeDurumu()
	{
		System.out.println("=========================");
		this.ort = (this.c1.not + this.c2.not + this.c3.not) / 3.0;
		if(this.ort > 55)
		{
			System.out.println("Sınıfı geçtiniz.");
			this.gecmeDurumu = true;
		}
		else
		{
			System.out.println("Sınıfta kaldınız!");
			this.gecmeDurumu = false;
		}
		notuYazdir();
	}
	
	void notuYazdir()
	{
		System.out.println(this.c1.isim +  " Notu\t: " + this.c1.not);
		System.out.println(this.c2.isim +  " Notu\t: " + this.c2.not);
		System.out.println(this.c3.isim +  " Notu\t: " + this.c3.not);
		System.out.println("Ortalamanız: " + this.ort);
	}
}
