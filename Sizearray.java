//anagram
package Bhar;

import java.util.Scanner;

public class Sizearray 
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the two strings");
		String s3 = sc1.nextLine();
		String s4 = sc1.nextLine();
		String s1 = "";
		String s2 = "";
		String s5 = "";
		String s6 = ""; 
		char [] a3 = s3.toCharArray();
		char [] a4 = s4.toCharArray();
		
		for (int i = 0; i < a3.length; i++) 
		{
			if(a3[i]!=' ')
			{
				s1 =s1+a3[i] ;
			}
		}
		for (int i = 0; i < a4.length; i++) 
		{
			if(a4[i]!=' ')
			{
				s2 =s2+a4[i] ;
			}
		}
		if(s1.length()!=s2.length())
		{
			System.out.println("not anagram");
			return;
		}
		char [] a1 = s1.toCharArray();
		char [] a2 = s2.toCharArray();
		
			lowercase(a1);
			lowercase(a2);
			sort1(a1);
			sort1(a2);
			for (int i = 0; i < a2.length; i++)
			{
				s5 = s5+a1[i];
			}
			for (int i = 0; i < a2.length; i++)
			{
				s6 = s6+a2[i];
			}
			if(s5.equals(s6))
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
	}
	public static void sort1(char [] a1)
	{
		char t ;
		for (int i = 0; i <a1.length; i++) 
		{
			for (int j = 0; j < a1.length-1; j++)
			{
				if(a1[j]>a1[j+1])
				{
					t = a1[j];
					a1[j] = a1[j+1];
					a1[j+1] = t;
				}
			}
		}
	}
	public static void lowercase(char [] a1)
	{
		for (int i = 0; i < a1.length; i++) 
		{
			if(a1[i]>=65 && a1[i]<=90)
			{
				a1[i] = (char)(a1[i]+32);
			}
		}
	}
}
