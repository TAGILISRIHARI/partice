package com.pack;

public class MinimumAccountBalance extends Exception
{
	String message;
	
	public MinimumAccountBalance(String message)
	{
		this.message=message;
	}
	
	@Override
	public String toString()
	{
		return message;
	}
}
