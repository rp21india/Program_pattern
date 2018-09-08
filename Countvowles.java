package Bhar;

import java.util.Scanner;

public class Countvowles
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc1.nextLine();
		String s2 = "";
		char [] a1 = s1.toCharArray();
		int count = 0;
		for (int i = 0; i < a1.length; i++) 
		{
			if(a1[i]=='A'|| a1[i]=='E'|| a1[i]=='I'|| a1[i]=='O'|| a1[i]=='U'||a1[i]=='a'||a1[i]=='e'||a1[i]=='i'|| a1[i]=='o'|| a1[i]=='u')
			{
				a1[i]=' ';
				count++;
			}
		}
		for (int i = 0; i < a1.length; i++) 
		{
			s2 = s2+a1[i];
		}
		System.out.println(s2);
		System.out.println("there are "+count+" vowels in the given string");
	}

}
