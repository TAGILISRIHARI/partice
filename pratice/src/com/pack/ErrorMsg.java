package com.pack;

public class ErrorMsg extends Exception
{
	String msg;
	public ErrorMsg(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return msg;
	}

}
