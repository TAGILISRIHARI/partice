package com.pack1;

public class C8 extends C7{
	@Override
	public void meth1()
	{
		System.out.println("Method Overriding of abstract meth1()");
	}
	@Override
	public int meth2(int r)
	{
		System.out.println("Method Overriding of abstract meth2()");
		return r;
	}
	@Override
	public String meth3(String s)
	{
		System.out.println("Method Overriding of abstract meth3()");
		return s;
	}
	public static void main(String[] args) 
	{
		C7 obj = new C8();
		obj.meth1();
		obj.meth2(9);
		obj.meth3("Java");
		System.out.println("---------------------------");
		obj.meth1(9);
		obj.meth1("srii");
		
	}
}
