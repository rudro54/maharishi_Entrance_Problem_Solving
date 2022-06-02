package maharishi;

public class Page90MeeraArray
{

	public static int isMeera(int[] a){
		int isZeroThere=0;
		int isPrimeThere=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				isZeroThere++;
			}

		
			else{
				for (int j = 2; j * j < a[i]; j++)
				{
					if (a[i] % j == 0)
					{

						break;
					}
					isPrimeThere++;
				}
				
			}
		}
		
		if ((isZeroThere > 0 && isPrimeThere > 0) || (isZeroThere == 0 && isPrimeThere == 0))
		{
			return 1;
		}
		return 0;
		
	}

	public static void main(String[] args)
	{
		System.out.println(isMeera(new int[]
		{ 7, 6, 0, 10, 1 }));
		System.out.println(isMeera(new int[]
		{ 6, 10, 1 }));
		System.out.println(isMeera(new int[]
		{ 7, 6, 10 }));
		System.out.println(isMeera(new int[]
		{ 6, 10, 0 }));
		System.out.println(isMeera(new int[]
		{ 3, 7, 0, 8, 0, 5 }));


	}

}
