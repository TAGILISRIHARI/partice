package com.pack;

public class sub {
	void meth1()
	{
		int a=10;
		int b=5;
		int sub=a+~b+1;
		System.out.println(sub);
	}
	public static void main(String[] args) 
	{
		sub obj = new sub();
		obj.meth1();
	}
	
}
