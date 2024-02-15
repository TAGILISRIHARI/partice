package com.pack;

public class SynchronizedBlock implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" Started");
		
		
		synchronized (this) 
		{
			for(int i =1 ; i<6 ;i++)
			 {
				 System.out.println("\t"+name+ " block");
			 }
		}
	
		System.out.println(name+" Ended");
	}
	public static void main(String[] args) 
	{
	 	SynchronizedBlock object = new SynchronizedBlock();
	 	Thread t1 = new Thread(object);
	 	
	 	Thread t2 = new Thread(object);
	 	t1.start();
	 	t2.start();
	}

}
