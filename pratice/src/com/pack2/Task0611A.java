package com.pack2;

public class Task0611A implements Comparable<Task0611A>
{
	int age;
	String name;
	int salary;
	
	public Task0611A(int age,String name,int salary) 
	{
	// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return name+" "+" "+age+" "+salary;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	@Override
	public int compareTo(Task0611A o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
	

}
