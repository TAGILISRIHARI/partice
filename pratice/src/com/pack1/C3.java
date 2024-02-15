package com.pack1;

public class C3 extends C1{

	void method3()
	{
		System.out.println("C3 method called");
	}
	C3()
	{
		
		System.out.println("C3 defalut constructor");
	}
	public static void main(String[] args)
	{
		C3 obj3 =  new C3();
		obj3.method1();
		obj3.method3();
	}
}
