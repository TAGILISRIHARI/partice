package com.pack;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPooling  extends Thread
{
	private String msg;
	
	public ThreadPooling(String s)
	{
		this.msg=s;
	}
	
	synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName()+" Begin msg "+msg);
		processMsg();
		System.out.println(Thread.currentThread().getName()+" End");
		processMsg();
	}
	
	private void processMsg()
	{
		try 
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		ExecutorService executor1 = Executors.newFixedThreadPool(3);
		for(int i=1;i<6;i++)
		{
			ThreadPooling tpobject = new ThreadPooling(""+i);
			Thread t = new Thread(tpobject);
			
			executor1.execute(t);
		}
		executor1.shutdown();
		while(!executor1.isTerminated()) {}
		System.out.println("Finised Pooling 1");
		
		ExecutorService executor2 = Executors.newFixedThreadPool(3);
		for(int i=1;i<6;i++)
		{
			ThreadPooling tpobject = new ThreadPooling(""+i);
			Thread t = new Thread(tpobject);
			
			executor2.execute(t);
		}
		executor2.shutdown();
		while(!executor2.isTerminated()) {}
		System.out.println("Finished Pooling 2");
		
	}
}

/*
 pool-1-thread-2 Begin msg 2
pool-1-thread-3 Begin msg 3
pool-1-thread-1 Begin msg 1
pool-1-thread-3 End
pool-1-thread-2 End
pool-1-thread-1 End
pool-1-thread-3 Begin msg 4
pool-1-thread-1 Begin msg 5
pool-1-thread-3 End
pool-1-thread-1 End
Finished Pooling 1
pool-2-thread-1 Begin msg 1
pool-2-thread-2 Begin msg 2
pool-2-thread-3 Begin msg 3
pool-2-thread-3 End
pool-2-thread-1 End
pool-2-thread-2 End
pool-2-thread-3 Begin msg 4
pool-2-thread-2 Begin msg 5
pool-2-thread-2 End
pool-2-thread-3 End
Finished Pooling 2
*/
