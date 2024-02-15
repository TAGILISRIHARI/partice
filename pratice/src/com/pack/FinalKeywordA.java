package com.pack;

public class FinalKeywordA 
{
	public void meth1()
	{
		final int number=10;
		System.out.println(number);
//		System.out.println(number--);C.E
		System.out.println(number);
		
	}
	public static void main(String[] args) 
	{
		//FinalKeywordA.meth1();
		
	}
	
	//final is used  for a variable [final variables are constant]
	//final is used  for a method   [ A method can be static it can be inherit but we cannot overridden final methods
	//final is used  for a class    [A class can be final we can not inherit class so and we can't  overridden class
}
