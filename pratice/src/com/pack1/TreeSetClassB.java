package com.pack1;

import java.util.TreeSet;

public class TreeSetClassB 
{
	public void meth1()
	{
		System.out.println("User-defined Class Object");
		TreeSet<TreeSetClassA> set = new TreeSet<TreeSetClassA>();
		TreeSetClassA obj1 = new TreeSetClassA(92,"CSE");
		TreeSetClassA obj2 = new TreeSetClassA(2,"MME");
		TreeSetClassA obj3 = new TreeSetClassA(18,"ECE");
		set.add(obj1);
		
		set.add(obj3);
		
//		set.add(null);//C.E null is not allowed
		set.add(new TreeSetClassA(897,"EEE"));
		set.add(obj2);
		System.out.println(set);
	}
	public static void main(String[] args) 
	{
		new TreeSetClassB().meth1();
	}

}
