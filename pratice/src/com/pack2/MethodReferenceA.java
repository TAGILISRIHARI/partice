package com.pack2;

public class MethodReferenceA 
{
	public void show()
	{
		System.out.println("Method Without parameters");
	}
	public static void show1(int num)
	{
		System.out.println("Staic Method, With single parameter valuse num : "+num);

	}
	public void show2(int num1, int num2)
	{
		System.out.println("Method With Two or more(Multiple) parameters, sum is: "+(num1+num2));

	}
	public String show3(String name)
	{
		System.out.println("Method With Return Type name: "+name);

		return name;
	}
	
	public MethodReferenceA()
	{
		System.out.println("Default Constructor");

	}
	
	public MethodReferenceA(int a)
	{
		System.out.println("Parametrized Constructor value a : "+a);

	}
}
