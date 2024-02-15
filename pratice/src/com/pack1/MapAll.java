package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.Vector;

public class MapAll 
{
	void methodHashMap()
	{
		System.out.println("HashMap - Insertion Order is Not maintained");
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put(101,"Tagili");//Insertion order is not maintained
		map.put("Tagili",1965);//Hetrogeneous keys Allowed & Hetrogeneous Values Allowed
		map.put(null,null);//null keys Allowed & null Values Allowed
		map.put(102,"Tagili");//Duplicate Values is allowed
		map.put("Java",1.2);//Avaliable from java 1.2v
		map.put(16,"Capacity");//Default capacity is 16 [Load factor 0.75]
		map.put(32,"Double");//Size increases by double
		map.put(0,"Not Syn");//It is not Synchronized
		
		System.out.println(map);
		
		//Retrive data from Map
		//get() - it is a prameterized method (keys as parameter) returns values
		System.out.println(map.get(101));
		System.out.println(map.get(102));//Duplicated value
		System.out.println(map.get("Java")+"\n");
		System.out.println("Before : "+map.get(16));
		
		map.put(16, "Default Capacity");
		//If duplited key value is added we not get any error but the OLD value assoited with key 
		//will be replaced with new value
		System.out.println("After : "+map.get(16));

		
//		In for data is accessed with index but in map data is stored in the form
//		key value pairs so with index we cannot access in maps
		
//		for each loop can be accessed but no directly we need to is to 
//		collection interface classes
		
		ArrayList<Object> al = new ArrayList<Object>(map.keySet());
		System.out.println("\nUsing for each loop ArrayList-map keySet()");
		for(Object o : al)
		{
			System.out.print(o+" ");
		}
		System.out.println("\n");
		System.out.println("Using Iterator on ArrayList-map keySet()");
		Iterator<Object> i = al.iterator();
		
		while(i.hasNext())
		{
			Object ob = i.next();
			System.out.println(ob+"-"+map.get(ob)+" ");
		}
		
		System.out.println("\n");
		System.out.println("Using Enumeration on Vector-map entrySet()");
		
		Vector<Object> v = new Vector<Object>(map.entrySet());
		Enumeration<Object> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}
	void methodLinkedHashMap()
	{
		System.out.println("LinkedHashMap - Insertion Order is maintained");

		LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put(10,"Java");//Insersertion order is Maintained
		map.put("tagili",10);//Hetrogeneous keys Allowed & Hetrogeneous Values Allowed
		map.put(null,null);//null keys Allowed & null Values Allowed
		map.put(10,"Java");//Duplicate Values are allowed
		map.put("Java",1.4);//Avaliable from java 1.4 version
		map.put(16,"Capacity");//Default Capacity is 16 LoadFactor [0.75]
		map.put(32,"Double");//Size increases by Double
		map.put(0,"Not SYNC");//It is Not Synchronized
		
		System.out.println(map);
		
		HashSet<Object> set = new HashSet<Object>(map.keySet());
		System.out.println(set);
		LinkedList<Object> l = new LinkedList<Object>(set);
		ListIterator<Object> li = l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("-----------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}
	void methodTreeMap()
	{
		System.out.println("LinkedHashMap - Insertion Order is maintained");
		TreeMap<Object, Object> map = new TreeMap<Object, Object>();
		map.put(10,"Java");//Insersertion order is not maintined but sorting order is maintained based on keys
		map.put(11,10);//Hetrogeneous keys Are not allowed & Hetrogeneous Values Allowed
		map.put(14,null);//null keys Not Allowed & null Values Allowed
		map.put(56,"Java");//Duplicate Values are allowed
		map.put(12,1.4);//Avaliable from java 1.4 version
		map.put(16,"Capacity");//Default Capacity is 16 LoadFactor [0.75]
		map.put(32,"Double");//Size increases by Double
		map.put(90,"Not SYNC");//It is Not Synchronized
		
		System.out.println(map);
		map.put(55, "Value");
		PriorityQueue<Object> pq = new PriorityQueue<Object>(map.keySet());
		Iterator<Object> i =  pq.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
	void userDefinedOnHashMap()
	{
		HashMap<HashMapClassA, HashMapClassB> map = new HashMap<HashMapClassA, HashMapClassB>();
		HashMapClassA a1 = new HashMapClassA(1008,"Java");
		HashMapClassA a2 = new HashMapClassA(1002,"micro");
		HashMapClassA a3 = new HashMapClassA(1003,"aws");
		
		HashMapClassB b1 = new HashMapClassB("Tagili");
		HashMapClassB b2 = new HashMapClassB("Srii");
		HashMapClassB b3 = new HashMapClassB("Tags");
		
		map.put(a1, b1);
		map.put(a2, b2);
		map.put(a3, b3);
		map.put(new HashMapClassA(1004,"html"),new HashMapClassB("Srihari"));
		
		System.out.println(map);
	}
	void userDefinedOnLinkedHashMap()
	{
		LinkedHashMap<HashMapClassA, HashMapClassB> map = new LinkedHashMap<HashMapClassA, HashMapClassB>();
		HashMapClassA a1 = new HashMapClassA(1008,"Java");
		HashMapClassA a2 = new HashMapClassA(1002,"oracle");
		HashMapClassA a3 = new HashMapClassA(1003,"css");
		
		HashMapClassB b1 = new HashMapClassB("Tagili");
		HashMapClassB b2 = new HashMapClassB("Srii");
		HashMapClassB b3 = new HashMapClassB("Tags");
		
		map.put(a1, b1);
		map.put(a2, b2);
		map.put(a3, b3);
		map.put(new HashMapClassA(1004,"aws"),new HashMapClassB("Srihari"));
		
		System.out.println(map);
	}
	void userDefinedOnTreeMap()
	{
		TreeMap<HashMapClassA, HashMapClassB> map = new TreeMap<HashMapClassA, HashMapClassB>();
		HashMapClassA a1 = new HashMapClassA(1008,"Java");
		HashMapClassA a2 = new HashMapClassA(1006,"Oracle");
		HashMapClassA a3 = new HashMapClassA(1001,"CSS");
		
		HashMapClassB b1 = new HashMapClassB("Tagili");
		HashMapClassB b2 = new HashMapClassB("Srii");
		HashMapClassB b3 = new HashMapClassB("Tags");
		
		map.put(a1, b1);
		map.put(a2, b2);
		map.put(a3, b3);
		map.put(new HashMapClassA(14,"AWS"),new HashMapClassB("Srihari"));
		
		System.out.println(map);
//		{14 AWS=Srihari, 1001 CSS=Tags, 1008 Java=Tagili, 1006 Oracle=Srii}
//		{14 AWS=Srihari, 1001 CSS=Tags, 1006 Oracle=Srii, 1008 Java=Tagili}

	}
	
	void passingCollectionsToHashMap()
	{
		System.out.println("Passing key and value to HashMap from priority queue");
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		PriorityQueue<Object> pq1 = new PriorityQueue<Object>();
		PriorityQueue<Object> pq2 = new PriorityQueue<Object>();
		Collections.addAll(pq1, 101,192,165,178,333);
		Collections.addAll(pq2, "Tagili","Harsha","Roshan","Ganesh","Chandu");
		
		System.out.println(pq1);
		System.out.println(pq2);
		int a = pq1.size();
		int b = pq2.size();
		System.out.println(a+" "+b);
		for(int i=0;i<a&&i<b;i++)
		{
			map.put(pq1.poll(), pq2.poll());
			
		}
		System.out.println(map);
		
		System.out.println("----------------------------");
		System.out.println("Passing key and value to HashMap from ArrayList");
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<String> al2 = new ArrayList<String>();
		Collections.addAll(al1, 1,3,5,4,8,6,0);
		Collections.addAll(al2, "Tagili","Roshan","Ganesh","Harsha","Chandu");
		System.out.println("al1 size(): "+al1.size()+" al2 size(): "+al2.size());
		
		System.out.println(al1);
		System.out.println(al2);
		Iterator<Integer> i1 = al1.iterator();
		Iterator<String> i2 = al2.iterator();
		
		while(i1.hasNext()&&i2.hasNext())
		{
//			System.out.println(+" ==>"+i2.next());
			map2.put(i1.next(), i2.next());
		}
		System.out.println(map2);
		System.out.println("------------------------------");
		System.out.println("Passing key and value to HashMap from LinkedHashSet");
		
		LinkedHashSet<Object> lh1 = new LinkedHashSet<Object>();
		LinkedHashSet<Object> lh2 = new LinkedHashSet<Object>();
		HashMap<Object, Object> map3 = new HashMap<Object, Object>();
		
		lh1.add('A');
		lh1.add('B');
		lh1.add('C');
		lh1.add('D');
		lh1.add('E');
		lh1.add('F');
		
		lh2.add(1);
		lh2.add(2);
		lh2.add(3);
		lh2.add(4);
		lh2.add(5);
		
		System.out.println("lh1 size() "+lh1.size()+ " lh2 size() "+lh2.size());
		System.out.println("LinkedHashSet lh1 : "+lh1);
		System.out.println("LinkedHashSet lh1 : "+lh2);
		
		Vector<Object> v1 = new Vector<Object>(lh1);
		Vector<Object> v2 = new Vector<Object>(lh2);
		System.out.println("Vector v1 : "+v1);
		System.out.println("Vector v2 : "+v2);
		
		Enumeration<Object> e1 = v1.elements(); 
		Enumeration<Object> e2 = v2.elements(); 
		
		while(e1.hasMoreElements()&&e2.hasMoreElements())
		{
//			System.out.println(e1.nextElement()+" "+e2.nextElement());
			map3.put(e1.nextElement(), e2.nextElement());
		}
		System.out.println(map3);

		

		
	}
	public static void main(String[] args) 
	{
		MapAll obj = new MapAll();
//		obj.methodHashMap();
//		obj.methodLinkedHashMap();
//		obj.methodTreeMap();
//		obj.userDefinedOnHashMap();
//		obj.userDefinedOnLinkedHashMap();
		obj.userDefinedOnTreeMap();
//		obj.passingCollectionsToHashMap();
	}

}
