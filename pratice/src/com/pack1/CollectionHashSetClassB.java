package com.pack1;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSetClassB 
{
	public void meth1()
	{
		//In HashSet Insertion Order is not maintained
		HashSet<CollectionHashSetClassA> set = new HashSet<CollectionHashSetClassA>();
		CollectionHashSetClassA obj1 = new CollectionHashSetClassA("Tagili",23,"M");
		CollectionHashSetClassA obj2 = new CollectionHashSetClassA("Srii",22,"M");
		CollectionHashSetClassA obj3 = new CollectionHashSetClassA("Aa",21,"F");
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		Iterator<CollectionHashSetClassA> i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		set.add(new CollectionHashSetClassA("tags", 20, "f"));
		System.out.println("-----------------");
		for(CollectionHashSetClassA a : set)
		{
			System.out.println(a);
		}
		set.add(new CollectionHashSetClassA(null, 0, null));
		System.out.println("-----------------");
		for(CollectionHashSetClassA a : set)
		{
			System.out.println(a);
		}
		
	}
	public static void main(String[] args) 
	{
		new CollectionHashSetClassB().meth1();
	}

}
