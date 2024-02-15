package com.pack;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferFileOperations 
{
	void fileoperations()
	{
		System.out.println("Buffered File Operations ");
		try
		{
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\java\\file1.txt"));
			int i;
			while((i=bis.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void main(String[] args) throws Exception
	{
		BufferFileOperations object = new BufferFileOperations();
		object.fileoperations();
		
	}

}
