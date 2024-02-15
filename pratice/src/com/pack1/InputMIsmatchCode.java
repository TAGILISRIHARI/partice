package com.pack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMIsmatchCode
{
	void meth1()
	{
		int digit;
		System.out.println("Method1");
		try 
		{
			System.out.print ("Enter Number: ");
			newScan.nextInt() ;
//			System.out.println(digit);
		} 
		catch (InputMismatchException e) 
		{
			 
//			  System.err.println("Entered value is not an integer");
			System.out.println(e.toString());
		}
		meth1();
		
	}
	static Scanner newScan = new Scanner(System.in);
	public static void main(String[] args)
    {
		new InputMIsmatchCode().meth1();
		
    }

}
