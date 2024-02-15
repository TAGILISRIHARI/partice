package com.pack;

public class SleepMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("J");
		Thread.sleep(5000);
		System.out.println("A");
		Thread.sleep(3000);
		System.out.println("V");
		Thread.sleep(1000, 100);
		System.out.println("A");
	}

}
