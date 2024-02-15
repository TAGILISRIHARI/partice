package com.pack1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionLinkedList 
{
	void meth1()
	{
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);//Insertion order is maintained
		ll.add("Tag");//Hetrogenuos data is allowed
		ll.add(null);//null is allowed
		ll.add(10);//duplicated data is allowed
		ll.add(1.2);//avaliable from java 1.2v
		ll.add(0);//default capacity is 0
		ll.add("Double");//size increase by double
		ll.add("Not Synchronized");//it is not synchronized
		System.out.println(ll);
		
		System.out.println("----------------------iterator");
		Iterator<Object> i1 = ll.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("-----------------------forloop forward");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("------------------------forloop backward");
		for(int i=ll.size()-1;i>=0;i--)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("------------------------ListIterator forward");
		
		ListIterator<Object> li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("------------------------ListIterator backward");
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println("------------------------Enumeration");
		Vector<Object> v = new Vector<Object>();
		v.addAll(ll);
		
		Enumeration<Object>  e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println("=====END======");
	}
	void meth2()
	{
		System.out.println("ListIterator");
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		Iterator<Object> li = ll.descendingIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//		}
//		System.out.println("-------");
//		while(li.hasPrevious())
//		{
//			System.out.println(li.previous());
//		}
	}
	
	public static void main(String[] args) 
	{
		new CollectionLinkedList().meth2();
	}

}
