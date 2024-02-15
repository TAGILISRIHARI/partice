package com.pack;

public class CloneExample implements Cloneable
{
	int num1=100;
	int num2=200;
	
	public CloneExample method1() throws CloneNotSupportedException
	{
		CloneExample method1Obj=(CloneExample)super.clone();
		return method1Obj;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneExample obj1= new CloneExample();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		System.out.println("----------------");
		CloneExample obj2= new CloneExample();
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		System.out.println("----------------");
		
		obj2.num1=400;
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		System.out.println("----------------");
		
		
		CloneExample obj3 = obj1.method1();
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		
		System.out.println("-----------------------");
		
		obj3.num1=500;
		obj3.num2=700;
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		
		System.out.println("🫂");
		 
		
		
		
		
		
	}

}
