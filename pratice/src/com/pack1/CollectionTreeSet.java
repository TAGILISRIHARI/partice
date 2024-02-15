package com.pack1;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTreeSet 
{
	public void meth1()
	{
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(10);//Insertion order is not maintained but Sorting order is maintained 
//		ts.add("Tagili");//Hetrogenous data is not allowed
//		ts.add(null);//null is not allowed
		ts.add(10);//duplicated are not allowed
//		ts.add(1.2);//avaliable from java 1.2v
		ts.add(16);//dedault capacity is 16 LoadFactor[0.75]
		ts.add(32);//size increases by DOUBLE
//		ts.add("Not synchronized");//It is not synchroniszed
		System.out.println(ts);
		
		Iterator<Object> li = ts.descendingIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("headSet: "+ts.headSet(16));
		System.out.println("tailSet: "+ts.tailSet(16));
		System.out.println("lowest: "+ts.first());
		System.out.println("highest: "+ts.last());
		
		TreeSet<Object> ts1 = new TreeSet<Object>(ts);
		System.out.println(ts1);
		System.out.println("Before: "+ts);
		ts.clear();
		
		System.out.println("After; "+ts);
		

	}
	public static void main(String[] args) 
	{
		new CollectionTreeSet().meth1();
	}

}
