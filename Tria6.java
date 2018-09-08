package Bhar;

public class Tria6
{
	public static void main(String[] args) 
	{
		int n = 4;
		//char c = 65;
		//int a = ch+1;
		//System.out.println(a);
		//System.out.println(ch++);implicit casting
		for (int i = 0; i < n; i++) 
		{
			char count = 65;
			for (int j = 0; j <n-i-1; j++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=2*i; j++) 
			{
				System.out.print((int)count+++" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; i++) 
		{
			char count = 65;
			for (int j = 0; j <n-i-1; j++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=2*i; j++) 
			{
				System.out.print(count+++" ");
			}
			System.out.println();
		}
	}

}
