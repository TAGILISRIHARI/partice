package com.pack;

public class PrintMsg extends Exception
{
	String msg;
	PrintMsg(String msg)
	{
		this.msg=msg;
	}
	@Override
	public String toString()
	{
		return msg;
	}

}
