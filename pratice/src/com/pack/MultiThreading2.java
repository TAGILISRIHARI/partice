package com.pack;

public class MultiThreading2 extends Thread
{
	public void run()
	{
		for(int i=1;i<6;i++)
		{
			String name = Thread.currentThread().getName();
			int priority = Thread.currentThread().getPriority();
			System.out.println(name+"("+priority+")"+" run() executed : "+i);
//			System.out.println(name+" run() executed "+ i);
		}
	}
	public static void main(String[] args) 
	{
		MultiThreading2 obj = new MultiThreading2();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("Thread-First");
		t2.setName("Second-Thread");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
//		obj.run();
		t1.start();
		obj.run();
		System.out.println("------------");
		t2.start();
	}
}
