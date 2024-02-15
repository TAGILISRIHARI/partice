package com.pack;

public class JoinMethod extends Thread
{
	public void run()
	{
		String name =  Thread.currentThread().getName();
		System.out.println(name+" run() executed");
		for(int i=1 ; i<6 ; i++)
		{
			System.out.println("\t"+name+" value "+i);
		}
		System.out.println(name+" run() ended");
	}
	public static void main(String[] args) throws InterruptedException
	{
	JoinMethod jobj = new JoinMethod();
	
	Thread t1 = new Thread(jobj);
	
	jobj.start();

	jobj.join();
	
	t1.start();
//	t1.join();
	
	String name =  Thread.currentThread().getName();
	System.out.println(name+" run() executed");
	for(int i=1 ; i<6 ; i++)
	{
		System.out.println("\t"+name+" value "+i);
	}
	System.out.println(name+" run() ended");

	
	
	
	}

}
