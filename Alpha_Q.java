package Bhar;

public class Alpha_Q 
{
	public static void main(String[] args)
	{
		int n=9;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if((i==0||j==0&&i<n/2||i==n/2-1||j==n/2-1&&i<n/2)&&j<n/2||i==j&&(i>=n/4&&i<3*n/4-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
