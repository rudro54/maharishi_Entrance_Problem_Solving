package maharishi;

public class FirstQuestionThirdWay
{

	public static int equivalentArrays(int a1[], int a2[])
	{

		int[] flag = new int[a2.length];
		for (int i = 0; i < flag.length; i++)
		{
			flag[i] = 0;
		}

		for (int i = 0; i < a1.length; i++)
		{
			int temp = 0;
			for (int j = 0; j < a2.length; j++)
			{
				if (a1[i] == a2[j])
				{
					flag[j] = 1;
					temp = 1;

				}
			}
			if (temp == 0)
			{
				return 0;
			}
		}

		for (int i = 0; i < flag.length; i++)
		{
			if (flag[i] == 0)
			{
				return 0;
			}
		}

		return 1;

	}

	public static void main(String[] args)
	{
		System.out.println(equivalentArrays(new int[]
		{ 0, 1, 2 }, new int[]
		{ 2, 0, 1 }));
		System.out.println(equivalentArrays(new int[]
		{ 0, 1, 2, 1 }, new int[]
		{ 2, 0, 1 }));
		System.out.println(equivalentArrays(new int[]
		{ 2, 0, 1 }, new int[]
		{ 0, 1, 2, 1 }));
		System.out.println(equivalentArrays(new int[]
		{ 0, 5, 5, 5, 1, 2, 1 }, new int[]
		{ 5, 2, 0, 1 }));
		System.out.println(equivalentArrays(new int[]
		{ 5, 2, 0, 1 }, new int[]
		{ 0, 5, 5, 5, 1, 2, 1 }));
		System.out.println(equivalentArrays(new int[]
		{ 0, 2, 1, 2 }, new int[]
		{ 3, 1, 2, 0 }));
		System.out.println(equivalentArrays(new int[]
		{ 3, 1, 2, 0 }, new int[]
		{ 0, 2, 1, 0 }));
		System.out.println(equivalentArrays(new int[]
		{ 1, 1, 1, 1, 1, 1 }, new int[]
		{ 1, 1, 1, 1, 1, 2 }));
		System.out.println(equivalentArrays(new int[]
		{}, new int[]
		{ 3, 1, 1, 1, 1, 2 }));
		System.out.println(equivalentArrays(new int[]
		{}, new int[]
		{}));

	}

}
