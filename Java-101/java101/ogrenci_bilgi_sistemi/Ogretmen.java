package ogrenci_bilgi_sistemi;

public class Ogretmen {
	String isim;
	String telNo;
	String brans;
	
	public Ogretmen(String isim, String telNo, String brans)
	{
		this.isim = isim;
		this.telNo = telNo;
		this.brans = brans;
	}
	
	/*Bu örnekte, this.isim, this.telNo, ve this.brans, sınıfın özelliklerine referans verir. 
	Eğer this kullanmasaydık, Java, metodun içindeki değişkenleri sınıf özellikleri olarak değil, 
	metodun parametreleri olarak algılardı.*/
	void yazdir()
	{
		System.out.println("Adı: " + this.isim);
		System.out.println("Telefonu: " + this.telNo);
		System.out.println("Bölümü: " + this.brans);
	}
}
