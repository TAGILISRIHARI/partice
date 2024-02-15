package com.pack;
import java.util.Scanner;

public class ClassB extends ClassA{
	
	Scanner sc = new Scanner(System.in);

	ClassB()
	{
		System.out.println("ClassB Default Constructor");
	}
	
	public void method1()
	{
		System.out.println("----");
		ClassA aobj1 = new ClassA();//Has-a-Relation 1st Statement
		ClassA aobj2 = new ClassB();//2nd Statement
		ClassB bobj1 = new ClassB();//Is-A-Relation(Inheritance) 3rd statement
		
		
		System.out.println("\nEnter Your Name: ");
		aobj1.setName(sc.next());
		//We are calling Parent class methods with parent class reference, We not need inheritance for Has-A-Relation .
		//ClassA aobj1 = new ClassA();
		
		System.out.println("Enter Your Age: ");
		aobj2.setAge(sc.nextInt());
		//We can hold Child Class object with Parent Class Reference and we Call call Only Parent Class methods
		//2nd Statement  ClassA aobj2 = new ClassB();
		
		
		System.out.println("Enter Your Gender [M OR F} :");
		bobj1.setGender(sc.next().charAt(0));
		//We can hold Child class object with Parent Class reference and we can call both Parent Class and Child Class methods
		//ClassB bobj1 = new ClassB(); 3rd statement
		
		
		System.out.println("Enter Your Course [Java OR Oracle OR HTML] : ");
		super.setCourse(sc.next());
		//Super keyword is used as we know super key word is used to call Parent class methods , Using Inheritance.
		
		System.out.println("Enter Your batch Timings [7:30am or 4pm or 6pm] :");
		setBatch(sc.next());
		//above statement we no mentioned super keyword by default parent class methods super keyword is added,  As this keyword for present class methods
		
		System.out.println("Enter your Address: ");
		sc.nextLine();
		this.setAddress(sc.nextLine());
		//above statement we are calling Parent class methods by using child class keyword "this"
		//As we know  we can hold child class object with reference of child class Object and call both Parent Class And Child Class methods
		//As this keyword is used to call Child Class Methods , It is Child Class object with child class reference so we can call Parent class method with this keyword

		
		System.out.println("-----  Your Details ------");
		System.out.println("Name     : "+aobj1.getName().toUpperCase());
		System.out.println("Age      : "+aobj2.getAge());
		System.out.println("Gender   : "+bobj1.getGender());
		System.out.println("Course   : "+super.getCourse().toUpperCase());
		System.out.println("Batch    : "+getBatch());
		System.out.println("Address  : "+this.getAddress().toUpperCase());
	}
	
	public void method2()
	{
		System.out.println("------------------------------------------------------------");
		
		System.out.println("\n===   OverRidding in ClassB ===");
		this.method3();
		this.method3(10,20);
		ClassB.method3("Java");
		this.method3(new StringBuilder("Java"));
		this.method3(new StringBuffer("Java"));
	}
	
	public void method3()
	{
		System.out.println("First");
	}
	private int method3(int a,int b)
	{
		System.out.println("Second");
		return a;
	}
	static public void method3(String s)
	{
		System.out.println("Third");
	}
	 protected void method3(StringBuilder b)
	{
		System.out.println("Fourth");
	}
	 final public void method3(StringBuffer s)
	 {
		 System.out.println("Fifth");
	 }
	
	
	public static void main(String[] args) 
	{
		ClassB bobj = new ClassB(); //Is-A-Relation
		bobj.method1();
		bobj.method2();
		
		
	}
}






























/*
  
void method1()
	{
		Scanner sc = new Scanner(System.in);
		ClassA aobj = new ClassA();
		
		System.out.println("Enter emp sal: ");
		aobj.setEmpSal(sc.nextFloat());
		
		System.out.println("Enter emp Experience: ");
		aobj.setEmpExp(sc.nextInt());
		
		System.out.println("Enter emp Address: ");
		sc.nextLine();
		aobj.setEmpAddress(sc.nextLine());
		
		System.out.println("----Details----");
		
		System.out.println("EmpSal: "+aobj.getEmpSal());
		System.out.println("EmpExperience: "+aobj.getEmpExp());
		System.out.println("EmpAddress: "+aobj.getEmpAddress());
		sc.close();
	}


*/