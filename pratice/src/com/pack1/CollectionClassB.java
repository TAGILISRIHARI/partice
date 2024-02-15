package com.pack1;

public class CollectionClassB 
{
	int empno;
	String branch;
	public CollectionClassB(String branch,int empno)
	{
		this.branch=branch;
		this.empno=empno;
	}
	public String toString()
	{
		return branch+" "+empno;
	}

}
