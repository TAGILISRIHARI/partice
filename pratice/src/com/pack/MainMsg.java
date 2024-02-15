package com.pack;

import java.util.Scanner;

public class MainMsg 
{
	public static void main(String[] args) 
	{
		int a=10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int b=sc.nextInt();
		
		try 
		{
			if(b==0)
			{
				throw new ErrorMsg("You Entered 0 we dont multiply it");
			}
			else
			{
				System.out.println("Result : "+a*b);
			}
		}
		
		catch (ErrorMsg e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally 
		{
			sc.close();
			
		}
		
		
	}

}
