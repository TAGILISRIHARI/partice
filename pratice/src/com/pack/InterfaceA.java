package com.pack;

public interface InterfaceA {
	public abstract void meth1();
	abstract void meth2();
	
	private void meth1(int x)
	{
		System.out.println("private interfaceA meth1() overloading");
	}
	default void meth2(String s)
	{
		System.out.println("default interfaceA meth2() overloading");
		//InterfaceA.meth3();
		this.meth1(8);
		
	}
//	private static void meth3()
//	{
//		System.out.println("static interfaceA meth3()");
//	}
	default void meth3(int a) {
		System.out.println("public InterfaceA meth3 parametrized method Overloading");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main() interfaceA");
	}
}
