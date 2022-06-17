package maharishi;

public class Page86minDistance
{
	public static int minDistance(int n)
	{

		int minDistance = Integer.MAX_VALUE;
		int previousFactor = 1;

		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				if ((i - previousFactor) < minDistance)
				{
					minDistance = i - previousFactor;
					previousFactor = i;
				}
			}
		}
		return minDistance;

	}

	public static void main(String[] args)
	{
		System.out.println(minDistance(9));
	}

}
