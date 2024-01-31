package ogrenci_bilgi_sistemi;

public class Main {

	public static void main(String[] args) {
		
		Ogretmen ogretmen1 = new Ogretmen("Mahmut Hoca", "555", "TRH");
		Ogretmen ogretmen2 = new Ogretmen("Graham Bell", "000", "FZK");
		Ogretmen ogretmen3 = new Ogretmen("Külyutmaz", "111", "BIO");
		
		Ders tarih = new Ders("Tarih", "101", "TRH");
		tarih.ogretmenEkle(ogretmen1);
		Ders fizik = new Ders("Fizik", "102", "FZK");
		fizik.ogretmenEkle(ogretmen2);
		Ders biyo = new Ders("Biyoloji", "101", "BIO");
		
		Ogrenci ogrenci1 = new Ogrenci("İnek Şaban", "123", "4", tarih, fizik, biyo);
		ogrenci1.notEkle(100, 200, 50);
		ogrenci1.gecmeDurumu();
		
		Ogrenci ogrenci2 = new Ogrenci("Güdük Necmi", "444", "4", tarih, fizik, biyo);
		ogrenci2.notEkle(50, 30, 70);
		ogrenci2.gecmeDurumu();
	}

}
