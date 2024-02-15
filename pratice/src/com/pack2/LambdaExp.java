package com.pack2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class LambdaExp
{
	void method1()
	{
		System.out.println("Implementing Lambda Expression");
		
		System.out.println("----------------------------");
		System.out.println("Lambda Function without any parameters");
		InterfaceA ifa = ()->System.out.println("Without Any parameters");
		ifa.meth1();
		
		System.out.println("----------------------------");
		System.out.println("Lambda Function with a single parameter");
		InterfaceB ifb = (int a)->System.out.println("Number is: "+a);
		ifb.meth2(27);
		
		System.out.println("----------------------------");
		System.out.println("Lambda Function with a Multiple parameters");
		InterfaceC ifc = (int a,int b,int c)->
		{
			System.out.println("First num: "+a);
			System.out.println("Second num: "+b);
			System.out.println("Thrid num: "+c);
			System.out.println("Sum is: "+(a+b+c));
		};
		ifc.meth3(2, 4, 4);
		
		System.out.println("----------------------------");
		System.out.println("Lambda Function with return type");
		InterfaceD ifd = (int a,int b)->{return a+b;};
		System.out.println("With Return type a+b is: "+ifd.meth4(5, 2));
		
		System.out.println("----------------------------");
		System.out.println("Lambda Function without return type");
		InterfaceE ife = ()->System.out.println("Without Return type");
		ife.meth5();
		System.out.println("----------------------------");
		System.out.println("Lambda Function Passing LinkedList, HashTable return type is ArrayList and Print all Values");
		
		LinkedList<Integer> li1 = new LinkedList<Integer>();
		Collections.addAll(li1, 1,56,3,89,67);
		
		Hashtable<Object,Object> ht1 = new Hashtable<Object, Object>();
		ht1.put(101, "srihari");
		ht1.put(102, "harsha");
		ht1.put(103, "roshan");
		ht1.put(104, "ganesh");
		
		InterfaceF iff = (LinkedList<Integer> li2, Hashtable<Object, Object> ht2)->
		{
			
			System.out.println("----------------------------");
			System.out.println("Printing LinkedList Elements");
			Iterator<Integer> it1 = li2.iterator();
			
			while(it1.hasNext())
			{
				System.out.println(it1.next());
			}
			
			System.out.println("----------------------------");
			System.out.println("Printing Hashtable Values");
			Enumeration<Object> e = ht2.elements();
			
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
			
			ArrayList<Object> al = new ArrayList<Object>(ht2.keySet());
			
			System.out.println("----------------------------");
			System.out.println("Printing Hashtable Keys");
			ListIterator<Object> listit1 = al.listIterator();
			while(listit1.hasNext())
			{
				System.out.println(listit1.next());
			}
			System.out.println("----------------------------");
			System.out.println("Printing Hashtable Keys and values using Vector");
			Vector<Object> vc = new Vector<Object>(ht2.entrySet());
			
			Iterator<Object> vit = vc.iterator();
			while(vit.hasNext())
			{
				System.out.println(vit.next());
			}
			
			System.out.println("----------------------------");
			System.out.println("Printing Hashtable Keys and values using ArrayList");
			Iterator<Object> it3 = al.iterator();
			while(it3.hasNext())
			{
				Object ob = it3.next();
				System.out.println("Keys: "+ob+" || Values: "+ht2.get(ob));
			}
			
				
			
			return al;
		};
		
		
		ArrayList<Object> al2 = iff.meth6(li1, ht1);
		System.out.println("----------------------------");
		System.out.println("Printing ArrayList Elements");
		
		System.out.println(al2);
		
		
		
	}
	public static void main(String[] args) 
	{
		new LambdaExp().method1();
	}
}
