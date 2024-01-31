package diziler;

import java.util.Arrays;

public class TekrarEdenSayi {
	
	static boolean isFind(int[] arr, int value)
	{
		for(int i : arr)
		{
			if(i == value)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		// Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazınız.
		
		int[] list = {3, 4, 7, 9, 3, 7, 11, 9, 11, 5};
		int[] dublicate = new int[list.length];
		int startIndex = 0;
		
		for(int i = 0; i < list.length; i++)
		{
			for(int j = 0; j < list.length; j++)
			{
				if((i != j) && (list[i] == list[j]))
				{
					if(!isFind(dublicate, list[i]))
					{
						dublicate[startIndex++] = list[i];
					}
					break;
				}
			}
		}
		for(int value : dublicate)
		{
			if(value != 0)
			{
				System.out.print(value + " ");
			}
		}
	}

}
