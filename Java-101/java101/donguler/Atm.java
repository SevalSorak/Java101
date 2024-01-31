package donguler;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapınız.
		
		Scanner scan = new Scanner(System.in);
		int kalanHak = 3;
		String kullaniciAdi, parola;
		int secim;
		int para = 1500;
		
		while(kalanHak > 0)
		{
			System.out.println("Kullanıcı adı: ");
			kullaniciAdi = scan.nextLine();
			System.out.println("Parola: ");
			parola = scan.nextLine();
			
			if(kullaniciAdi.equals("patika") && parola.equals("dev123"))
			{
				System.out.println("Merhaba, bankamıza hoşgeldiniz.");
				do
				{
					System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
					secim = scan.nextInt();
					
					if(secim == 1)
					{
						System.out.println("Para miktarı: ");
						int miktar = scan.nextInt();
						para += miktar;
					}
					else if(secim == 2)
					{
						System.out.println("Para miktarı: ");
						int miktar = scan.nextInt();
						if(miktar > para)
						{
							System.out.println("Bakiye yetersiz!");
						}
						else
						{
							para -= miktar;
						}
					}
					else if(secim == 3)
					{
						System.out.println("Bakiyeniz: " + para);
					}
				}while(secim != 4);
				System.out.println("Tekrar görüşmek üzere");
				break;
			}
			else
			{
				kalanHak--;
				System.out.println("Hatalı kullanıcı adı veya şifre, tekrar deneyiniz!");
				if(kalanHak == 0)
				{
					System.out.println("Hesabınız bloke olmuştur.");
				}
				else
				{
					System.out.println("Kalan hakkınız: " + kalanHak);
				}
			}
		}
	}

}
