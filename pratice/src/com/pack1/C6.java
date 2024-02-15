package com.pack1;

public class C6 extends C5{
	
	@Override
	public void meth1()
	{
		System.out.println("C6 method1()");
	}
	
	public int meth2(int b)
	{
		System.out.println("C6 method2()");
		return b;
	}
	//Cannot Inherit private methods so cannot overriding 
	private void meth3()
	{
		System.out.println("C6 method3()");
	}
	static protected void meth4()
	{
		System.out.println("C6 method4()");
	}
	@Override
	C5  meth5() //Co-variant return type
	{
		System.out.println("C6 method5()");
		return new C6();
	}
	C6()
	{
		System.out.println("C6 default constructor");
	}
	public static void main(String[] args) 
	{
		C6 bobj1 = new C6(); // IS-a-Relation #3rd statement
		bobj1.meth1();
		System.out.println("-----------------");
		C5 aobj1 = new C6();
		aobj1.meth1();
		aobj1.meth2(9);
//		aobj1.meth3();
		C5.meth4();
		aobj1.meth5();
		
	}
}
