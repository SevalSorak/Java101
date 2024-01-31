package diziler;

import java.util.Arrays;

public class TersiniAlma {
	
	public static int[] reverse(int[] list)
	{
		int[] result = new int[list.length];
		for(int i = 0, j = list.length - 1; i < list.length; i++, j--)
		{
			result[j] = list[i];
		}
		return result;
	}

	public static void main(String[] args) {
		
		int[] list = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(reverse(list)));
		
	}

}
