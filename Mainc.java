package Bhar;

public class Mainc 
{
	public static void main(String[] args)
	{
		int n = 10;
		for (int i = 0; i <n; i++)
		{
			for (int sp = 0; sp <n-i-1; sp++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=2*i; j++) 
			{
				if(j==0||j==2*i||j==i||i==(n-1))
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 1; i <n; i++)
		{
			for (int sp = 0; sp <i; sp++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=2*(n-1-i); j++) 
			{
				if(j==0||j==2*(n-1-i)||j==(n-1-i))
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
