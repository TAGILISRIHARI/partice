package com.pack2;

public class NestedInnerClass 
{
	void meth1()
	{
		System.out.println("Outter class method");
	}
	
	{
		System.out.println("Outter class Instance Block");
	}
	static 
	{
		System.out.println("Outter class static Block");
	}
	public NestedInnerClass() 
	{
		System.out.println("Outter class Constructor");
	}
	
	//Nested Inner Class
	public class InnerClassA
	{
		void msg()
		{
			System.out.println("Inner class Method msg()");
		}
		
		{
			System.out.println("Inner class Instance Block");
		}
		
		static
		{
			System.out.println("Inner class static block");
		}
		
		public InnerClassA() 
		{
			System.out.println("Inner class Constructor");
		}
//		public static void main(String[] args) 
//		{
//			System.out.println("Inner Class main()");
//		}
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Outter class Main()");
//		new NestedInnerClass().meth1();
		NestedInnerClass.InnerClassA obj = new NestedInnerClass().new InnerClassA();
		obj.msg();
	}

}
