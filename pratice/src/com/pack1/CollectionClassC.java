package com.pack1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class CollectionClassC 
{
	static Scanner sc = new Scanner(System.in);	
	public void method1(ArrayList<CollectionClassA> al,Vector<CollectionClassB> v)
	{
		System.out.println("-----------");
		Iterator<CollectionClassA> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("-----------");
		Enumeration<CollectionClassB> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<CollectionClassA> al = new ArrayList<CollectionClassA>();
		CollectionClassA aobj1 = new CollectionClassA(1965,"Tagili");
		CollectionClassA aobj2 = new CollectionClassA(1595,"Roshan");
		CollectionClassA aobj3 = new CollectionClassA(2254,"Panthul");
		System.out.println("Enter names:");
		CollectionClassA aobj4 = new CollectionClassA(sc.nextInt(),sc.next());
		
		al.add(aobj3);
		al.add(aobj2);
		al.add(aobj1);
		al.add(aobj4);
		al.add(new CollectionClassA(2202, "Sravani"));
		
		Vector<CollectionClassB> v = new Vector<CollectionClassB>();
		CollectionClassB bobj1 = new CollectionClassB("Java", 1234);
		CollectionClassB bobj2 = new CollectionClassB("Oracle", 5678);
		CollectionClassB bobj3 = new CollectionClassB("HTML", 1001);
		
		v.add(bobj3);
		v.add(bobj2);
		v.add(bobj1);
		v.add(new CollectionClassB("MME", 12));
		
		new CollectionClassC().method1(al, v);


	}
}
