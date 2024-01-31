package metotlar;

public class PalindromSayilar {
	
	static boolean isPalindrom(int sayi)
	{
		int temp = sayi;
		int sonBasamak;
		int tersSayi = 0;
		while(temp != 0)
		{
			sonBasamak = temp % 10;
			tersSayi = (tersSayi * 10) + sonBasamak;
			temp = temp / 10;
		}
		
		if(sayi == tersSayi)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

		// Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
		
		System.out.println(isPalindrom(323));
	}

}
