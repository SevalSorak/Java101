package diziler;

public class AHarfi {

	public static void main(String[] args) {
		// Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "A" harfi yazan programı yazınız.
		
		char[][] dizi = new char[6][4];
		
		for(int i = 0; i < dizi.length; i++)
		{
			for(int j = 0; j < dizi[i].length; j++)
			{
				if(i == 0 || i == 2)
				{
					dizi[i][j] = '*';
				}
				else if(j == 0 || j == 3)
				{
					dizi[i][j] = '*';
				}
				else
				{
					dizi[i][j] = ' ';
				}
			}
		}
		
		for(int i = 0; i < dizi.length; i++)
		{
			for(int j = 0; j < dizi[i].length; j++)
			{
				System.out.print(dizi[i][j] + " ");;
			}
			System.out.println();
		}
		
		System.out.println("=======");
		
		// Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
		
		char[][] liste = new char[5][4];
		
		for(int k = 0; k < liste.length; k++)
		{
			for(int l = 0; l < liste[k].length; l++)
			{
				if(k == 0 || k == 2 || k == 4)
				{
					dizi[k][l] = '*';
				}
				else if(l == 0 || l == 3)
				{
					dizi[k][l] = '*';
				}
				else
				{
					dizi[k][l] = ' ';
				}
			}
		}
		
		for(int k = 0; k < liste.length; k++)
		{
			for(int l = 0; l < liste[k].length; l++)
			{
				System.out.print(dizi[k][l] + " ");
			}
			System.out.println();
		}
	}

}
