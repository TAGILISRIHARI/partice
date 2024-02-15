package com.pack;

public class C9 implements InterfaceA,InterfaceB
{
	@Override
	public void meth1()
	{
		System.out.println("C9 class meth1() overriding");
	}
	@Override
	public void meth2()
	{
		System.out.println("C9 class meth2() overriding");
	}
	@Override
	public void meth3(int x)
	{
		System.out.println("Overriding meth3");
	}
	@Override
	public void msg() 
	{
		System.out.println("msg() in C9");
	}

	public static void main(String[] args) 
	{
//		// TODO Auto-generated method stub
//		InterfaceA obj1 = new C9();
//		obj1.meth1();
//		obj1.meth2();
//		obj1.meth2("java");
//		obj1.meth3(10);
//		System.out.println("----------");
//		new C9().msg();
		
	}

}
