package com.pack;
import java.util.*;

public class secondClass {
	Scanner sc = new Scanner(System.in);
	void method1() 
	{
		firstClass aobj = new firstClass();
		System.out.println("Enter salary");
		int empsal= aobj.setSal(sc.nextInt());
		System.out.println("sal: "+empsal);
		System.out.println("ENter exp");
		int empexp=aobj.setExp(sc.nextInt());
		System.out.println("exp: "+empexp);
	}
	public static void main(String[] args) {
		new secondClass().method1();
	}
}
