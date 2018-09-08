package Bhar;

import java.util.Scanner;

public class Initicap 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc1.nextLine();
		char [] a1 = s1.toCharArray();
		lower(a1);
		
			if(a1[0]>=90 && a1[0]<=122)
			{
				a1[0] = (char)(a1[0]-32);
			}
		
		for (int j = 0; j < a1.length; j++)
		{
			System.out.print(a1[j]);
		}
	}
	public static void lower(char [] a1)
	{
		for (int i = 0; i < a1.length; i++)
		{
			if(a1[i]>=65 && a1[i]<=90)
			{
				a1[i] =(char)(a1[i]+32);
			}
		}
	}

}
