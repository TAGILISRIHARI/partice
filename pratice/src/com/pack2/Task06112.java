package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task06112 
{
	void meth1()
	{
		ArrayList<String> name1 = new ArrayList<String>();
		ArrayList<Integer> age1= new ArrayList<Integer>();
		ArrayList<Integer> sal1= new ArrayList<Integer>();
		Collections.addAll(name1,"tagili","harsha","ganesh","roshan","chandu");
		Collections.addAll(age1,12,17,20,19,24);
		Collections.addAll(sal1,19000,20000,21000,22000,23000);
		
		Interface06112 A=(ArrayList<String>name,ArrayList<Integer>age,ArrayList<Integer>sal)->{
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(sal);
			
//			System.out.println(age.stream().sorted().collect(Collectors.toList()));
			Stream<Integer> s1 =age.stream().filter(a->a>=18);
//			Stream<Integer> s2 = 
			ArrayList<Object>al=new ArrayList<Object>();
			return al;
		
		};
		A.meth1(name1, age1, sal1);
		
		
	}

	public static void main(String[] args) {
	 new Task06112().meth1();	
	}

}
