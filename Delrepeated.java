package Bhar;

import java.util.Scanner;

public class Delrepeated 
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc1.nextLine();
		int count = 1;
		s1 = s1.toLowerCase();
		char [] c1 = s1.toCharArray();
		char t;
		for (int i = 0; i < c1.length; i++) 
		{
			for (int j = 0; j < c1.length-1; j++) 
			{
				if(c1[j]>c1[j+1])
				{
					t = c1[j];
					c1[j] = c1[j+1];
					c1[j+1] = t ;
				}
			}
		}
		
		for (int i = 0; i < c1.length; i++) 
		{
			for (int j = i; j < c1.length-1; j++) 
			{
				if(c1[i] == c1[j+1])
				{
					count++;
				}
			}
			if(count>=2)
			{
				System.out.println(c1[i]+" repeated "+count+" times");
			}
			for (int j = 0; j < c1.length; j++)
			{
				try
				{
				if(c1[i]==c1[i+1])
				{
					i++;
				}
				}
				catch(Exception e)
				{
					System.out.println("");
				}
				
			}
			count = 1;
		}
	}

}
