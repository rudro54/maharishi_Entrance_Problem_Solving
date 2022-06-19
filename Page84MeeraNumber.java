package maharishi;

public class Page84MeeraNumber
{

	static int isMeera(int n)
	{
		int count = 0;

		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				count++;
			}
		}
		if (count > 1 && n % count == 0)
		{
			return 1;
		}
		else
			return 0;
	}

	public static void main(String[] args)
	{
		System.out.println(isMeera(6));

	}

}
