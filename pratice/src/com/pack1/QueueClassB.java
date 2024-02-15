package com.pack1;

import java.util.Collections;
import java.util.PriorityQueue;

public class QueueClassB 
{
	void meth1()
	{
		PriorityQueue<QueueClassA> q = new PriorityQueue<QueueClassA>();
		q.add(new QueueClassA("Tagili",10));
		q.add(new QueueClassA("Ta",4));
		q.add(new QueueClassA("gili",7));
		q.add(new QueueClassA("agili",1));
		q.add(new QueueClassA("ili",12));
		q.add(new QueueClassA("Tag",6));
		System.out.println(q);
		System.out.println("Kotha Code");
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
	}
	void meth2()
	{
		PriorityQueue<String> q = new PriorityQueue<String>();
		Collections.addAll(q, "tagili","ganesh","harhsa","asharf","ene","doctor","polimera");
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		new QueueClassB().meth1();
//		new QueueClassB().meth2();
	}

}
