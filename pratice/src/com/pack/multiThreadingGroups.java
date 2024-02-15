package com.pack;

public class multiThreadingGroups implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) 
	{
		multiThreadingGroups object  = new multiThreadingGroups();
		ThreadGroup tg = new ThreadGroup("Parent Group");
		
		Thread t1 = new Thread(tg,object);
		t1.start();
		Thread t2 = new Thread(tg,object);
		t2.start();
		Thread t3 = new Thread(tg,object);
		t3.start();
		
		System.out.println("Thread Group Name : "+tg.getName());
		System.out.println("Active Threads : "+tg.activeCount());
		tg.setMaxPriority(10);
		
	}
}


/*Thread-0
5
Thread-2
5
Thread-1
5
Thread Group Name : Parent Group
Active Threads : 0
*/