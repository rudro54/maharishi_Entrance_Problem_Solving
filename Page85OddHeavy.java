package maharishi;

public class Page85OddHeavy
{

	static int isOddHeavy(int[] a)
	{

		boolean hasOdd = false;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 1)
			{
				hasOdd = true;
				for (int j = 0; j < a.length; j++)
				{
					if (a[j] % 2 == 0)
					{
						if (a[i] < a[j])
						{
							return 0;
						}
					}
				}
			}
		}
		return hasOdd ? 1 : 0;
	}

	public static void main(String[] args)
	{
		System.out.println(isOddHeavy(new int[]
		{ 11, 4, 9, 2, 8 }));
		System.out.println(isOddHeavy(new int[]
		{ 11, 4, 9, 2, 3, 10 }));
		System.out.println(isOddHeavy(new int[]
		{ 1, 1, 1, 1, 1, 1 }));
		System.out.println(isOddHeavy(new int[]
		{ 2, 4, 6, 8, 11 }));
		System.out.println(isOddHeavy(new int[]
		{ -2, -4, -6, -8, -11 }));
		System.out.println(isOddHeavy(new int[]
		{ 1 }));
		System.out.println(isOddHeavy(new int[]
		{ 2 }));

	}

}
