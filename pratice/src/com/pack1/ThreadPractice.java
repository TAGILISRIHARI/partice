package com.pack1;

public class ThreadPractice extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(name+"("+priority+") has executed run() : "+i);
		}
	}
	public static void main(String[] args) 
	{
		ThreadPractice obj = new ThreadPractice();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("First");
		t2.setName("Second");
		
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
		
	}

}
