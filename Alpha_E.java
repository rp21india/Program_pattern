package Bhar;

public class Alpha_E 
{
	public static void main(String[] args) 
	{
		int n = 9;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j <n; j++) 
			{
			  	if(j==0||(i==0||i==n/2||i==n-1)&&j<n-4)
			  		System.out.print("* ");
			  	else
			  		System.out.print("  ");
			}
			System.out.println();
		}
	}

}
