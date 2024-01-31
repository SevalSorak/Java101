package ogrenci_bilgi_sistemi;

public class Ders {
	/*Bu satırda, Ders sınıfının içinde Ogretmen türünden bir özellik (dersOgretmeni) 
	tanımlanmıştır. Bu özellik, Ogretmen sınıfından türetilmiş bir nesneyi referans alabilir. 
	Yani, bir ders oluşturulduğunda, bu dersin öğretmeni Ogretmen sınıfından türetilmiş bir 
	nesne olarak atanabilir.*/
	Ogretmen ogretmen;
	String isim;
	String kod;
	String onEk;
	int not;	
	int sozlu;
	
	/*Yapıcı metodun amacı, sınıfın örneklerini oluştururken kullanılabilecek başlangıç değerlerini 
	tanımlamaktır. Bu durumda, isim, kod, ve onEk değerleri parametre olarak alınıyor ve not
	değeri varsayılan olarak 0 olarak atanıyor.*/
	public Ders(String isim, String kod, String onEk)
	{
		this.isim = isim;
		this.kod = kod;
		this.onEk = onEk;
		this.not = 0;
	}
	
	void ogretmenEkle(Ogretmen ogretmen)
	{
		if(ogretmen.brans.equals(this.onEk))
		{
			this.ogretmen = ogretmen;
		}
		else
		{
			System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
		}
	}
	
	void ogretmeniYazdir()
	{
		this.ogretmen.yazdir();
	}
}
