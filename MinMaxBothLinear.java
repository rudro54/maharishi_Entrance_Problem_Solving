package maharishi;

public class MinMaxBothLinear
{
	// class Pair is used to return two values from getMinMax
	static class Pair
	{
		int min;
		int max;
	}

	static Pair getMinMax(int[] arr, int n)
	{

		Pair minmax = new Pair();
		int i;

		// if there is only one item then return this as min max both ;

		if (n == 1)
		{
			minmax.max = arr[0];
			minmax.min = arr[0];
			return minmax;

		}
		// if there is more than one elements, then initialize min and max

		if (arr[0] > arr[1])
		{
			minmax.max = arr[0];
			minmax.min = arr[1];
		} else
		{
			minmax.max = arr[1];
			minmax.min = arr[0];
		}

		for (i = 2; i < n; i++)
		{
			if (arr[i] > minmax.max)
			{
				minmax.max = arr[i];
			} else if (arr[i] < minmax.min)
			{
				minmax.min = arr[i];
			}
		}

		return minmax;
	}

	public static void main(String[] args)
	{
		// driver program to test above function

		Pair minmax = getMinMax(new int[]
		{ 1000, 11, 445, 1, 330, 3000 }, 6);
		System.out.printf("\nMinimum element is %d", minmax.min);
		System.out.printf("\nMaximum element is %d", minmax.max);
	}

}
