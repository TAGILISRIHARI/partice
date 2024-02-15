package com.pack1;

import java.util.Enumeration;
import java.util.Hashtable;

public class MapHashTablePar 
{
	static public void meth1()
	{
		System.out.println("Implementing Hashtable");
		Hashtable<Object, Object> table = new Hashtable<Object, Object>();
		
		table.put(10, "tagili");//Insertion order is not maintained
		table.put("Srihari", 20);//Hetrogeneous data is allowed
		table.put("tags",22);//null keys &values are not allowed
		table.put(10, "tagili");//Duplicate values are allowed
		table.put(1.0, "JavaVersion");//Avaliable Java 1.2v [Legacy class]
		table.put(11, "Capacity");//Default capacity is 11 Load Factor[0.75]
		table.put(22, "Size");//Size increases by Double
		table.put(1, "SYN");//Yes it is synchronized
		System.out.println("-----------------------------");
		
		System.out.println("HashTable elememnts");
		System.out.println(table);
		System.out.println("-----------------------------");
		
		System.out.println("Using enumeration on Hashtable");
		Enumeration<Object> e = table.elements();
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
		}
	}
	public static void userDefinedHashtable()
	{
		Hashtable<HashtableA, HashtableB> table = new Hashtable<HashtableA, HashtableB>();
		
		HashtableA a1 = new HashtableA(1965);
		HashtableA a2 = new HashtableA(2254);
		HashtableA a3 = new HashtableA(1595);
		
		HashtableB b1 = new HashtableB("Tagili");
		HashtableB b2 = new HashtableB("Harsha");
		HashtableB b3 = new HashtableB("Roshan");
		
		table.put(a1, b1);
		table.put(a2, b2);
		table.put(a3, b3);
		table.put(new HashtableA(1682), new HashtableB("Ganesh"));
		System.out.println("HashTable elememnts");
		System.out.println(table);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		MapHashTablePar.meth1();
		MapHashTablePar.userDefinedHashtable();

	}

}
