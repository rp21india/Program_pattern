package Bhar;

public class Alpha_N 
{
	public static void main(String[] args)
	{
		int n = 5;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if(j==0||j==n-1||i==j)
						System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
