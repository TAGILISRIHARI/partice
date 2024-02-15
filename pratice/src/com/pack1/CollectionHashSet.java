package com.pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionHashSet 
{
	public void meth1()
	{
		HashSet<Object> hs = new HashSet<Object>();
		//Any child class of set elements are stored in hash values so we cannot access them by index values
		//for loop access by index so it is not appicable for set classes
		//And methods like get cannont use to set classes
		hs.add(10);//Insertion order is not maintained
		hs.add("Tag");//Hetrogeneous data is allowed
		hs.add(null);//null is allowed
		hs.add(10);//duplicates are not allowed
		hs.add(1.2);//avaliable from java 1.2v
		hs.add(16);/*default capacity is 16 loadfactor[0.75]
					hashset does not wait for to fill 16 if it is filled with 12 and
					we try to fill 13 element its size will be increases*/
		hs.add(32);//size increase by DOUBLE
		hs.add("Not Synchronized");//it is not synchronized
		
		System.out.println(hs);
		
		System.out.println("------------------foreach loop");
		for(Object o : hs)
		{
			System.out.println(o);
		}
		hs.add(100);
		hs.add(200);
		System.out.println(hs);
		System.out.println("------------------Iterator");
		Iterator<Object> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Vector<Object> v =  new Vector<Object>(hs);
		System.out.println("------------------ListIterator forward");
		ListIterator<Object> li = v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("--------------ListIterator backward");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		new CollectionHashSet().meth1();
	}
}
