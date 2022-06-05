package maharishi;

public class Page88IsFibonacci
{

	public static int isFibonacci(int n)
	{

		if (n == 0)
		{
			return 0;
		} else if (n == 1)
		{
			return 1;
		}

		int firstElement = 1;
		int secondElement = 1;

		int sum = firstElement + secondElement;

		while (sum < n)
		{
			sum = firstElement + secondElement;
			firstElement = secondElement;
			secondElement = sum;
		}

		if (n == sum)
		{
			return 1;
		}
		else
			return 0;

	}

	public static void main(String[] args)
	{
		System.out.println(isFibonacci(7));
	}




}
