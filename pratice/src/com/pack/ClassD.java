package com.pack;

public class ClassD 
{
	private int empSal;
	private int empExp;
	private String empAdd;
	public int setempExp(int empExp)
	{
		this.empExp=empExp;
		if(empExp>=10)
		{
			empSal=(empSal+(empSal*30/100));
			
		}
		return empExp;
	}
	public int setempsal(int empSal)
	{
		this.empSal=empSal;
		return empSal;
	}
	public int getempSal()
	{
		return empSal;
	}
	public int getempExp()
	{
		return empExp;
	}
	public void setempAdd(String empAdd)
	{
		this.empAdd=empAdd;
	}
	public String getempAdd()
	{
		return empAdd;
	}
	
}

