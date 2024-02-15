package com.pack;

public class ClassA {

	private String name;
	private int age;
	private char gender;
	private String course;
	private String batch;
	private String address;
	
	public ClassA()
	{
		this(10);
		System.out.println("ClassA Default Constructor");
	}
	public ClassA(int a)
	{
		System.out.println("ClassA Parameterized Constructor: "+a);
	}

	
	
	//getName()
	public String getName() {
		return name;
	}
	//setName()
	public void setName(String name) {
		this.name = name;
	}
	
	//getAge()
	public int getAge() {
		return age;
	}
	//setAge()
	public void setAge(int age) {
		this.age = age;
	}
	
	//getGender()
		public char getGender() {
			return gender;
		}
		
	//setGender()
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//getAddress()
	public String getAddress() {
		return address;
	}
	//setAddress()
	public void setAddress(String address) {
		this.address = address;
	}
	
	//getCourse()
	public String getCourse() {
		return course;
	}
	
	//setCourse()
	public void setCourse(String course) {
		this.course = course;
	}
	
	//getBatch()
	public String getBatch() {
		return batch;
	}
	
	//setBatch()
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	
	
		
	
	
}












































/*
  
private float empSal;
private int empExp;
private String empAddress;

public float getEmpSal() {
	return empSal;
}

public void setEmpSal(float empSal) {
	this.empSal = empSal;
}

public int getEmpExp() {
	return empExp;
}

public void setEmpExp(int empExp) {
	this.empExp = empExp;
	if (this.empExp>=10)
	{
		float newSal=(empSal+(empSal*30/100));
		this.empSal=newSal;
	}
}

public String getEmpAddress() {
	return empAddress;
}

public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}

*/