package com.pack1;
import java.util.Scanner;

public class C5 {
	void meth1()
	{
		System.out.println("C5 method1()");
	}
	public int meth2(int a)
	{
		System.out.println("C5 method2()");
		return a;
	}
	private void meth3()
	{
		System.out.println("C5 method3()");
	}
	static protected void meth4()
	{
		System.out.println("C5 method4()");
	}
	C5  meth5() //Co-variant return type
	{
		System.out.println("C5 method5()");
		return new C5();
	}
	C5()
	{
		System.out.println("C5 default constructor");
	}
}
