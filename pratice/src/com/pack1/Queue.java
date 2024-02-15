package com.pack1;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Queue 
{
	void meth1()
	{
		List<Object> l = new LinkedList<Object>();
		l.add(10);
//		l.offer(109);
		//Their is no method offer() in List interface, So Compile time Error
		//If a LinkedList with reference of List it can only access List interface and Collection methods
		LinkedList<Object> li = new LinkedList<Object>();
		li.add(20);
		li.offer(38);
		//LinkedList is avaliable in both Queue and List
		//When a linkedList object is created with reference of likedlist it can 
		//access both queue and List properties and also collection methods
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		pq.add(10);//Insertion order is not maintained, but first element is smallest
//		pq.offer("Tag");//Excepection, Hetrogenous data is not allowed
//		pq.add(null);//Exception, null is not allowed
		pq.offer(10);//Duplicates are allowed
		pq.add(15);//Avaliable from java 1.5 v
		pq.offer(11);//Default capacity is 11
		pq.add(22);//Size increases by DOUBLE
		pq.offer(0);//Not Synchronized
		System.out.println(pq);
	}
	void meth2()
	{
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		pq.add(10);
		pq.offer("Java");
		pq.add(null);
		pq.offer(10);
		pq.add(1.5);
		pq.offer(11);
		pq.add(22);
		pq.offer(0);
		System.out.println(pq);
		System.out.println("------------------------");
		//Methods
		//poll() - removes and returns first element in priority queue
		System.out.println("poll() : "+pq.poll());
		System.out.println("------------------------");
		System.out.println(pq);
		System.out.println("------------------------");
		System.out.println("poll() : "+pq.poll());
		System.out.println("------------------------");
		System.out.println(pq);
		System.out.println("------------------------");
		
		//remove() - removes and return first elemnt in priority queue
		System.out.println("remove() : "+pq.remove());
		System.out.println("------------------------");
		System.out.println(pq);
		System.out.println("------------------------");
		System.out.println("remove() : "+pq.remove());
		System.out.println("------------------------");
		System.out.println(pq);
		System.out.println("------------------------");
		
		//peek()- only returns the first element of priority queue,
		//Note: peel() does not remove first element in priority queue it only returns it 
		System.out.println("peek() : "+pq.peek());
		System.out.println("------------------------");
		System.out.println(pq);
		System.out.println("------------------------");
		System.out.println("peek() : "+pq.peek());
		System.out.println("------------------------");
		System.out.println(pq);
		System.out.println("------------------------");
		
		//What is the diff b/w poll() and remove() ?
		//If a PriorityQueue is empty poll() will return null value
		//but remove() will raise Exception NoSuchElementException
		
		//poll() - remove()
		pq.clear();//Clear all elements from PriorityQueue
		System.out.println(pq);
		System.out.println("------------------------");
		//Performing poll() on empty PriorityQueue
		System.out.println("poll() on empty PriorityQueue : "+pq.poll());
		System.out.println("------------------------");
//		System.out.println("remove() on empty PriorityQueue ; "+pq.remove());
//		Raises Exception - java.util.NoSuchElementException
	}
	public static void main(String[] args) 
	{
//	new Queue().meth1();
	new Queue().meth2();
	}

}
