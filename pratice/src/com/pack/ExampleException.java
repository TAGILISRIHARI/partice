package com.pack;

public class ExampleException 
{
	public static void method1()
	{
		int num1=10,num2=0;
		String s=null;
		
		try 
		{
			System.out.println("try");
//			System.out.println(num1/num2);
			System.out.println(s.length());
		} 
		catch (NullPointerException e) 
		{
			// TODO: handle exception
			System.out.print("Catch Null: ");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.print("Catch By zero: ");
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("Finally");
		}
		System.out.println("Method1() Completed");
	}
	
	public static void main(String[] args) 
	{
		
		ExampleException.method1();
	}

}
