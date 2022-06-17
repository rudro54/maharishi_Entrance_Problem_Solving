package maharishi;

import java.util.Arrays;

public class ReverseAnArrayWithRecursion
{

	public static void reverseArrayWithRecursion(int[] arr, int start, int end)
	{

		int temp;

		if (start >= end)
		{
			return;
		}

		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArrayWithRecursion(arr, start + 1, end - 1);

	}

	public static void printArray(int[] arr, int size)
	{
		for (int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");
			System.out.print(" ");
		}
	}

	public static void main(String[] args)
	{
		int[] arrayToReverse =
		{ 1, 2, 3, 4, 5, 6 };

		reverseArrayWithRecursion(arrayToReverse, 0, 5);
		System.out.println(Arrays.toString(arrayToReverse));
	}

}
