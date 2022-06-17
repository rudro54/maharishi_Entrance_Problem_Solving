package maharishi;

public class Page88isHollow
{

	public static int isHollow(int[] a)
	{
		int zeroCount = 0;
		int count = 0;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != 0)
			{
				count++;
			} else
			{
				zeroCount++;
			}
		}

		if (zeroCount >= 3 && count % 2 == 0)
		{
			if (zeroCount == count / 2)
			{
				return 1;
			}

		}
		return 0;


	}

	public static void main(String[] args)
	{

		System.out.println(isHollow(new int[]
		{ 1, 2, 3, 0, 0, 0, 3, 4, 5 }));
	}

}
