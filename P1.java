package Bhar;

import java.util.ArrayList;
import java.util.Vector;

import javax.naming.InitialContext;

public class P1 
{
	public static void main(String[] args)
	{
		Vector a1 = new Vector();
		a1.add(100);
		a1.add(0);
		a1.add(20);
		a1.add(80);
		a1.add(40);
		a1.add(100);
		a1.add(null);
		a1.add(null);
		
		for (int i = 0; i <a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
		a1.removeAll(a1);
		System.out.println("size = "+a1.size());
	}

}
