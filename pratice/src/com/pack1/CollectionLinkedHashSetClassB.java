package com.pack1;

import java.util.LinkedHashSet;

public class CollectionLinkedHashSetClassB 
{
	public void meth1()
	{
		//In LinkedHashSet Insertion Order is maintained
		LinkedHashSet<CollectionLinkedHashSetClassA> set = new LinkedHashSet<CollectionLinkedHashSetClassA>();
		
		CollectionLinkedHashSetClassA obj1 = new CollectionLinkedHashSetClassA(0, null);
		CollectionLinkedHashSetClassA obj2 = new CollectionLinkedHashSetClassA(1965, "Tagili");
		CollectionLinkedHashSetClassA obj3 = new CollectionLinkedHashSetClassA(2254, "Harsha");
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(null);
		set.add(new CollectionLinkedHashSetClassA(1595, "Roshan"));
		for(CollectionLinkedHashSetClassA a : set)
		{
			System.out.println(a);
		}

		
	}
	public static void main(String[] args) 
	{
		new CollectionLinkedHashSetClassB().meth1();
	}

}
