package com.pack;

final public class FinalKeywordB extends FinalKeywordA
{
	
	public void meth1()
	{
		System.out.println("\n\tFinalKeywordB meth1() called");
	}
	public static void main(String[] args) 
	{
		FinalKeywordA objectA1 = new FinalKeywordB();
		objectA1.meth1();
//		FinalKeywordA objectA2 = new FinalKeywordA();
//		objectA2.meth1();
		
	}

}
