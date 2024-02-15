package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ClassA 
{
	public void meth1()
	{
		ArrayList<String> al = new ArrayList<String>();
		Collections.addAll(al,"plain rava dosa","masala dosa","pizza dosa","corn dosa","raggi dosa","plain dosa","onion dosa");
		

		System.out.println(al);
		Iterator<String> i = al.iterator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item You need: ");
		String tiffinName = sc.next().toLowerCase();
		
		while(i.hasNext())
		{
			String s = i.next();
			if(s.contains(tiffinName))
			{
				System.out.println(s);
			}
		}
		sc.close();
	}
	public static void main(String[] args) 
	{
		new ClassA().meth1();
	}
}
