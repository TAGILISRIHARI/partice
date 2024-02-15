package com.pack1;

public class C2 extends C1{
	void method2()
	{
		System.out.println("C2 method Called");
	}
	C2()
	{
		
		System.out.println("C2 defalut constructor");
	}
	C2(int i)
	{
		this();
		System.out.println("C2 Parameterized Constructor :"+i);
	}
	public static void main(String[] args)
	{
		C2 obj2 =  new C2(9);
		obj2.method1();
		obj2.method2();
	}
}
