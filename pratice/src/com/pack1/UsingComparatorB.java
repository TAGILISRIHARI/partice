package com.pack1;

import java.util.ArrayList;
import java.util.Collections;

public class UsingComparatorB 
{

	void methodPriorityQueue()
	{
		ArrayList<UsingComparatorA> al = new ArrayList<UsingComparatorA>();
		
		UsingComparatorA a = new UsingComparatorA(1001, "srihari", 23.0f);
		UsingComparatorA b = new UsingComparatorA(2221, "roshan", 45.0f);
		UsingComparatorA c = new UsingComparatorA(1111, "ganesh", 15.0f);
		UsingComparatorA d = new UsingComparatorA(2311, "harsha", 76.0f);
		Collections.addAll(al, a,b,c,d);
		System.out.println("Befor: "+al);
//		Collections.sort(al);
		Collections.sort(al, new UsingComparator());
		System.out.println("After: "+al);
		//sorting based on empId
		//After: [1001 srihari 23.0, 1111 ganesh 15.0, 2221 roshan 45.0, 2311 harsha 76.0]
		//sorting on based on empName
		//After: [1111 ganesh 15.0, 2311 harsha 76.0, 2221 roshan 45.0, 1001 srihari 23.0]
		//sorting based on empSal
		//After: [1111 ganesh 15.0, 1001 srihari 23.0, 2221 roshan 45.0, 2311 harsha 76.0]


	}
	public static void main(String[] args) 
	{
	new UsingComparatorB().methodPriorityQueue();	
	}

}
