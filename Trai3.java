package Bhar;

public class Trai3 
{
	public static void main(String[] args)
	{
		int n=3;
		for (int i = 0; i <n; i++)
		{
			for (int sp = 0; sp<i; sp++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j<=2*(n-1-i); j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
