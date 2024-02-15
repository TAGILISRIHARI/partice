package com.pack1;

import java.util.LinkedList;
import java.util.ListIterator;

public class CollectionLinkedListClassB 
{
	public void meth1()
	{
		LinkedList<CollectionLinkedListClassA> la = new LinkedList<CollectionLinkedListClassA>();
		CollectionLinkedListClassA ob1 = new CollectionLinkedListClassA("Tagili", 23);
		CollectionLinkedListClassA ob2 = new CollectionLinkedListClassA("tag", 22);
		la.add(ob1);
		la.add(ob2);
		System.out.println(la);
		
		ListIterator<CollectionLinkedListClassA> lia = la.listIterator();
		
		
		System.out.println("--------");
		while(lia.hasNext())
		{
			lia.next();
		}
		while(lia.hasPrevious())
		{
			System.out.println(lia.previous());
		}
	}
	public static void main(String[] args)
	{
		new CollectionLinkedListClassB().meth1();
	}

}
