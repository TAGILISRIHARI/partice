package com.pack1;

public class C4 extends C3{
	void method4()
	{
		System.out.println("C4 method called");
	}
	public static void main(String[] args)
	{
		C4 obj4 =  new C4();
		obj4.method4();
		obj4.method3();
		obj4.method1();
		
	}
}
