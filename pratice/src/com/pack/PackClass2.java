package com.pack;

public class PackClass2 extends packClass1{
	public void method2()
	{
		System.out.println("com.pack PackClass2 Method2()");
		
	}
	public static void main(String[] args) 
	{
		
		packClass1 obj1 = new packClass1(); 
//		We can hold Parent Class Object With Parent class reference
//		And with that reference we can only call only parent class methods
		System.out.println("====Parent Class Reference & Parent Class Object ====");
		obj1.method1();
//		obj1.method2(); //C.E error because with Parent class reference we can only can parent class methods
		
		
		packClass1 obj2 =  new PackClass2();
		//We can hold Child Class Object With parent Class reference 
		//AND with that reference we can only call parent class methods
		System.out.println("====Parent Class Reference & Child Class Object ====");
		obj2.method1();
//		obj2.method2() //C.E error because with Parent class reference  and child class objects we can only call Parent class methods
		
		 PackClass2 obj3 = new PackClass2();
//		 We can hold Child Class Object with Child Class reference and 
//		 With that reference we can call BOTH parent class & Child Class  Methods
		 System.out.println("====Child  Class Reference & Child Class Object ====");
		 obj3.method1();
		 obj3.method2();
	}
	
}
