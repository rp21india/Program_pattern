package Bhar;

public class Tria5 
{
	public static void main(String[] args) 
	{
		int n = 7;
		for (int i = 0; i <n; i++) 
		{
			int count = 1;

			for (int j = 0; j <n-i-1; j++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=2*i; j++) 
			{
				if(j%2==0)
					System.out.print(count+++" ");
				else
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
