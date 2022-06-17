package maharishi;

import java.util.Arrays;

public class Page88intFill
{

	public static int[] fill(int[] arr, int k, int n)
	{

		if (k <= 0 || n <= 0)
		{
			return null;
		}

		int[] arr2 = new int[n];

		for (int i = 0; i < k; i++)
		{
			arr2[i] = arr[i];
		}
		int i = 0;
		while (k < n)
		{
			arr2[k] = arr2[i];
			i++;
			k++;

		}

		if (arr2.length == n)
		{
			return arr2;
		} else
		{
			return null;
		}

	}

	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(fill(new int[]
		{ 1, 2, 3, 5, 9, 12, -2, -1 }, 3, 10)));

		System.out.println(Arrays.toString(fill(new int[]
		{ 4, 2, -3, 12 }, 1, 5)));

		System.out.println(Arrays.toString(fill(new int[]
		{ 2, 6, 9, 0, -3 }, 0, 4)));
	}

}
