package com.pack;

public class InterruptMethod extends Thread
{
	public void run()
	{
		
		for(int i=1; i< 6 ;i++)
		{
			System.out.println("i value "+i);
		}
		try 
		{
			Thread.sleep(5000);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Sleep disturbed");
		}
		
		System.out.println("Execution cmpleted");
		
	}
	public static void main(String[] args) 
	{
		InterruptMethod iobj = new InterruptMethod();
		
		Thread t1 = new Thread(iobj);
		
		t1.start();
		t1.interrupt();
		
	}

}
