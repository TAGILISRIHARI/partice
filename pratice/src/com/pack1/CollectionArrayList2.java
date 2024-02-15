package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList2 
{
	public void method1()
	{
		ArrayList<CollectionArrayList1> al = new ArrayList<CollectionArrayList1>();
		CollectionArrayList1 obj1 = new CollectionArrayList1(101, "Tagili");
		CollectionArrayList1 obj2 = new CollectionArrayList1(102, "Srihari");
		al.add(obj1);
		al.add(obj2);
		al.add(new CollectionArrayList1(103, "Srii"));
		System.out.println(al);
		System.out.println("-----------");
		//Iterator
		Iterator<CollectionArrayList1> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	public static void main(String[] args) 
	{
		new CollectionArrayList2().method1();
	}
}
