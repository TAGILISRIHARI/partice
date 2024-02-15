package com.pack1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTask2 
{
	void meth1()
	{
		LinkedList<String> ll = new LinkedList<String>();
		Collections.addAll(ll,"tagili","roshan","harsha","ganesh","madesh","chandu","shiva","krupa","ganesh mech","jhansi","moulika","teju","ramya");
		System.out.println(ll);
		System.out.println(ll.size());
		
		ll.remove((Object)"roshan");
		System.out.println(ll);
		
		Iterator<String> i = ll.iterator();
		while(i.hasNext())
		{
			String s = i.next();
			if(s.contains("li"))
			{
				i.remove();
			}
		}
		System.out.println("-----");
		System.out.println(ll);
		System.out.println(ll.size());
		
	}
	public static void main(String[] args) 
	{
		new CollectionTask2().meth1();
		
	}
}

