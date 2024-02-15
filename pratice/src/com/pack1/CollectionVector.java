package com.pack1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CollectionVector 
{
	public void method1()
	{
		System.out.println("Vector");
		Vector<Object> v = new Vector<Object>();
		v.add(101);//Inserting order in maintained
		v.add("Java");//Hetrogeneous data is allowed
		v.add(null);//null is allowed
		v.add(101);//duplicates data is allowed
		v.add("1.0v");//avabile from java 1.0v legancy class
		v.add(10);//default capacity is 10
		v.add(20);//capacity increses by double
		v.add("synchronized");//It is synchronized
		System.out.println(v);
		
		System.out.println("-----------------------"
				+ "\n====>  for-loop forward");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("-----------------------"
				+ "\n====>  for-loop backward");
		for(int i=v.size()-1;i>=0;i--)
		{
			System.out.println(v.get(i));
		}
		System.out.println("-----------------------"
				+ "\n====>  for each-loop");
		for(Object ob:v)
		{
			System.out.println(ob);
		}
		System.out.println("-----------------------"
				+ "\n====>  Iterator");
		Iterator<Object> i = v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("-----------------------"
				+ "\n====>  Enumeration");
		Enumeration<Object> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
	public static void main(String[] args) 
	{
		new CollectionVector().method1();
		
	}

}
