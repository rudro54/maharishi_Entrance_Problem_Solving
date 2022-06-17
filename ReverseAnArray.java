package maharishi;

import java.util.Arrays;

public class ReverseAnArray
{

	public static int[] reverseArray(int[] arr)
	{

		int start = 0;
		int end = arr.length - 1;
		int temp;

		while (start < end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		return arr;
	}


	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(reverseArray(new int[]
		{ 1, 2, 3, 4, 5 })));

		

	}

}
