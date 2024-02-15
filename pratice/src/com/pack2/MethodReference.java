package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class MethodReference 
{
	void meth1()
	{
		//Method References
		//We refer a  method ,not calling a method 
		//Method Reference are used to alternative for Lambda Expression, 
		//where Lambda Expressions are used to Alternative for Method Overridding
		
		MR_InterfaceA ia =new MethodReferenceA()::show;
		ia.msg();
		System.out.println("----------------------------");
		
		MR_InterfaceB ib = MethodReferenceA::show1;
		ib.msg(10);
		System.out.println("----------------------------");
		
		MR_InterfaceC ic = new MethodReferenceA()::show2;
		ic.msg(2, 6);
		System.out.println("----------------------------");
		
		MR_InterfaceD id = new MethodReferenceA()::show3;
		id.msg("Tagili");
		System.out.println("----------------------------");
		
		MR_InterfaceE ie = MethodReferenceA::new;
		ie.msg();
		
		System.out.println("----------------------------");
		MR_InterfaceF i_f = MethodReferenceA::new;
		i_f.msg(20);
	}
	void meth2()
	{
		//Stream API
		//Mainly used for manipulate data in collection
		//Streap API collects information from collection clasess, and store in a buffer 
		//returns again that collected data
		//Reduces huge amount of code
		ArrayList<String> al = new ArrayList<String>();
		Collections.addAll(al, "Tagili","Ram","Roshan","Ganesh","Harsha","Raju","Ravi","Sai","Gountham");
		
		//Using Stream API
		
		//for-each() method
//		it is present in Consumer Functional Interface
//		The abstarct method present in consumer functional interface is 
//		void accept(T t) it accepts one arugument  it is void
		
		al.forEach((String data)->System.out.println(data));
		System.out.println("----------------------------");

		//Predicate Functional Interface  
//		It is used to filter the data in collections
//		the abstarct method presnt in Predicate Functional interface is 
//		boolena test(T t) , It accepts one parameter, it returs boolean ture or false
//		System.out.println(al.stream().filter(data->data.equals("Tagili")).count());
		
		System.out.println(al.stream().filter(data->data.length()>=6).count());
		
	}
	public static void main(String[] args) 
	{
		new MethodReference().meth2();
//		new MethodReference().meth1();
	}

}
