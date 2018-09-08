package Bhar;

public class Tria3 
{
	public static void main(String[] args)
	{
		int n=4;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = n; j >=i+1; j--) 
			{
				System.out.print(" ");
			}
			for (int z =1; z<=i; z++) 
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}		
		System.out.println();
		for (int i = 0; i <n; i++) 
		{
			for (int sp = 0; sp<n-1-i ; sp++)
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=2*i; j++) 
			{
			System.out.print("* ");
				
			}
			System.out.println();
		}
	}
}
