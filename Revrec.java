//reverse string using recursion
package Bhar;

public class Revrec 
{
	public static void main(String[] args) 
	{
		String s1 = "face   book";
		int len = s1.length()-1;
		rec(s1,len);
	}
	
	public static void rec(String s1,int l)
	{
		if(l>=0)
		{
		System.out.print(s1.charAt(l));
		l--;
		rec(s1,l);
		}
	}

}
