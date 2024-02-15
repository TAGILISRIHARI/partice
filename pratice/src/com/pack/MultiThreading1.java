package com.pack;

public class MultiThreading1 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<6;i++)
		{
			System.out.println("run()"+i);
		}
	}
	public static void main(String[] args) 
	{
		MultiThreading1 obj = new MultiThreading1();
		Thread t1 = new Thread(obj);
		
		t1.run();
		t1.start();
	}

}
