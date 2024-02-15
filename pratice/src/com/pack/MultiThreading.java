package com.pack;

public class MultiThreading extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" :run() executed 1");
	}
	public static void main(String[] args) 
	{
		MultiThreading obj =new MultiThreading();
		Thread t1 = new Thread(obj);
		
		t1.start();
		
		t1.setName("thread-one");
//		Thread t2 = new Thread();
		System.out.println("---");
//		t2.start();
//		t2.run();
		System.out.println("---");
		t1.run();
		
		
	}
}
