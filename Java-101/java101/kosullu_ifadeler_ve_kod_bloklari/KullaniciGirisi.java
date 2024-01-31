package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		// Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yazın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullanıcı adını giriniz: ");
		String kullaniciAdi = scan.nextLine();
		System.out.println("Şifreyi giriniz: ");
		String sifre = scan.nextLine();
		
		/*if(kullaniciAdi.equals("patika") && sifre.equals("java123"))
		{
			System.out.println("Giriş başarılı");
		}
		else
		{
			System.out.println("Kullanıcı adı veya şifre yanlış, tekrar deneyiniz!");
		}*/
		
		// Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
		// eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu 
		// şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana 
		// "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" 
		// yazan programı yazınız.
		
		if(kullaniciAdi.equals("patika") && sifre.equals("java123"))
		{
			System.out.println("Giriş başarılı");
		}
		else if(!(kullaniciAdi.equals("patika")) && !(sifre.equals("java123")))
		{
			System.out.println("Kullanıcı adı ve şifre yanlış, tekrar deneyiniz!");
		}
		else if(!(kullaniciAdi.equals("patika")) && (sifre.equals("java123")))
		{
			System.out.println("Kullanıcı adı yanlış, tekrar deneyiniz!");
		}
		else
		{
			System.out.println("Şifre yanlış, sıfırlamak ister misiniz? ");
			String cevap = scan.nextLine();
			if(cevap.equals("Evet"))
			{
				System.out.println("Yeni şifrenizi giriniz: ");
				String yeniSifre = scan.nextLine();
				if(!yeniSifre.equals(sifre))
				{
					System.out.println("Şifre oluşturuldu.");
					
				}
				else
				{
					System.out.println("Şifre oluşturulamadı, eski veya hatalı şifrenizi girmeyin!.");
				}
			}
			else
			{
				System.out.println("Şifre sıfırlama işlemi iptal edildi.");
			}
		}

	}

}
