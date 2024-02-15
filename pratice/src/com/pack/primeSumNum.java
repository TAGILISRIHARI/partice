package com.pack;

public class primeSumNum implements Cloneable
{
	
	public void printNumber()
	{
		int number=999;
		boolean flag=false;
		for (int i=2 ; i<=number/2 ; ++i)
		{
			if(isPrime(i))
			{
//				System.out.println(i);
				if(isPrime(number-i))
				{
					System.out.println("Sum  : "+ i +" + "+(number-i)+" = "+number);
					flag = true;
				}
			}
			
		}
		
		if(!flag)
			System.out.println(number+" cannot be calculated to prime sum.");
		
	}
	
	static public boolean isPrime(int num)
	{
		boolean prime=true;
		
		for(int i=2; i <=num/2; ++i)
		{
			if(num%i==0)
			{
				prime=false;
				break;
				
			}
		}
		return prime;
	}
	
	public primeSumNum getClone() throws CloneNotSupportedException
	{
		primeSumNum obj = (primeSumNum)super.clone();
		return obj;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		primeSumNum aobj = new primeSumNum();
		primeSumNum aobj2 = aobj.getClone();
		aobj2.printNumber();
	}

}
