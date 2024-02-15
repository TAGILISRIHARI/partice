package com.pack;

public class SynchronizedDemo extends Thread
{
	@Override
	synchronized public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" Started");
		for(int i =1; i<6 ;i++)
		{
			System.out.println(name+" value i : "+i);
		}
		System.out.println(name+ " Ended");
		
	}
	public static void main(String[] args) 
	{
		SynchronizedDemo object = new SynchronizedDemo();
//		object.start();
		Thread t1 = new Thread(object);
		t1.start();
		Thread t2 = new Thread(object);
		t2.start();
		
		for(int i=1;i<6;i++)
		{
			System.out.println("main() "+i);
		}
	}
}
