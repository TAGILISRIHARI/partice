package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task0611 
{
	void meth1()
	{
		List<Task0611A> list = new ArrayList<Task0611A>();
		
		Task0611A obj1 = new Task0611A(12, "Tagili", 19000);
		Task0611A obj2 = new Task0611A(17, "Roshan", 25000);
		Task0611A obj3 = new Task0611A(20, "Ganesh", 15000);
		Task0611A obj4 = new Task0611A(19, "Harsha", 23000);
		Task0611A obj5 = new Task0611A(24, "Chandu", 18000);
		Task0611A obj6 = new Task0611A(29, "Shiva", 28000);
		Task0611A obj7 = new Task0611A(27, "Madesh", 12000);
		Task0611A obj8 = new Task0611A(32, "Goutham", 10000);
		
		Collections.addAll(list, obj1,obj2,obj3,obj4,obj5,obj6,obj7,obj8);
		
		list.forEach(data->System.out.println(data));
		
		System.out.println("------------------------");
		
		System.out.println(list.stream().filter(i->i.age>25).sorted().collect(Collectors.toList()));
		System.out.println(list.stream().sorted().filter((Task0611A i)->i.age>25).map((Task0611A j)->j.salary+(j.salary*10/100)).collect(Collectors.toList()));
		
	}
	public static void main(String[] args) 
	{
		new Task0611().meth1();
	}

}
