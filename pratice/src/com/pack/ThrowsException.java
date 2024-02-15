package com.pack;

import java.io.FileReader;


public class ThrowsException extends Exception
{
	public void fileopen()throws Exception
	{
		System.out.println("File Open");
		FileReader fr = new FileReader("C:\\Users\\sriha\\OneDrive\\Desktop\\oracle.txt");
		System.out.println("END");
		fr.close();
	}
	public static void main(String[] args) throws Exception
	{
		ThrowsException obj = new ThrowsException();
		obj.fileopen();
		System.out.println(obj);
	}

}
