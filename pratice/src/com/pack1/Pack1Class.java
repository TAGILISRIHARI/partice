package com.pack1;

import com.pack.PackClass2;

public class Pack1Class extends PackClass2{
	public void method3()
	{
		System.out.println("com.pack1 pack1Class method3()");
	}
	public static void main(String[] args) {
		Pack1Class object=new Pack1Class();
		object.method3();
		object.method2();
		object.method1();
		
	}
}
