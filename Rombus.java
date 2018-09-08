package Bhar;

public class Rombus 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i = 0; i <n; i++) 
		{
			for (int sp = 0; sp<n-1-i ; sp++)
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=2*i; j++) 
			{
				if(j==0||j==2*i)
			System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
		for (int i = 1; i <n; i++)
		{
			for (int sp = 0; sp<i; sp++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j<=2*(n-1-i); j++)
			{
				if(j==0||j==2*(n-1-i))
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
