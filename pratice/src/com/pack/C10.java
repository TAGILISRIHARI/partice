package com.pack;

public class C10 extends C9{
	private void display()
	{
		meth1();
		msg();
		meth2();
		meth2("java");
		meth3(90);
		//InterfaceA.meth3();
	}
	public static void main(String[] args) 
	{
		C10 obj1 = new C10();
		obj1.display();
		
	}
}
