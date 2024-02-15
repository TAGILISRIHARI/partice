package com.pack1;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStrings 
{
	public void meth1()
	{
		TreeSet<String> set = new TreeSet<String>();
		Collections.addAll(set,"Tagili","srihari","panthul","roshan","ganesh","goutham","madesh");
		Iterator<String> i = set.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	public static void main(String[] args) 
	{
		new TreeSetStrings().meth1();
	}

}
