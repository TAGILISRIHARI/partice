package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionArrayList 
{
	public void method1()
	{
		ArrayList<Object> al=new ArrayList<Object>();
//		Collections.addAll(al, 10, 15, 19, 20, 25, 26, 29, 50, 61, 62, 75, 86, 91, 100, 121, 122, 123, 125, 149, 152, 179, 181, 182, 186, 199, 219, 222, 223, 239, 241, 249, 259, 269, 296, 299, 301, 328, 331, 349, 388, 399, 444, 479, 499, 501, 529, 533, 555, 589, 598, 666, 667, 719, 739, 749, 758, 789, 805, 806, 808, 895, 909, 999, 1000, 1099, 1101, 1102, 1234, 1499, 2499, 2545, 2999, 3178, 3225, 3226,3327,3337, 3662, 4999);
		Collections.addAll(al, 10, 17, 18, 19, 20, 24, 25, 27, 29, 30, 32, 39, 42, 43, 45, 47, 49, 50, 52, 57, 58, 62, 72, 75, 78, 82, 98, 99, 100, 103, 108, 118, 128, 151, 155, 179, 181, 195, 198, 199, 204, 209, 219, 224, 232, 239, 269, 289, 295, 296, 298, 299, 319, 329, 359, 368, 369, 399, 409, 418, 429, 449, 459, 475, 479, 495, 499, 500, 537, 539, 599, 601, 666, 695, 698, 699, 719, 755, 839, 901, 902, 903, 949, 995, 999, 1000, 1066, 1199, 1449, 1495, 1799, 2388, 2695, 2899, 2998, 2999, 3099, 3495, 4695, 5195, 6995);
//		Collections.addAll(al, 10, 15, 19, 20, 25, 26, 29, 50, 61, 62, 75, 86, 91, 100, 121, 122, 123, 125, 149, 152, 179, 181, 182, 186, 199, 219, 222, 223, 239, 241, 249, 259, 269, 296, 299, 301, 328, 331, 349, 388, 399, 444, 479, 499, 501, 529, 533, 555, 589, 598, 666, 667, 719, 739, 749, 758, 789, 805, 806, 808, 895, 909, 999, 1000, 1099, 1101, 1102, 1234, 1499, 2499, 2545, 2999, 3178, 3225, 3226,3327,3337, 3662, 4999);

//		al.add(101);//insertion order is maintained
//		al.add("TAG");//hetrogenous data is allowed
//		al.add(null);//null is allowed
//		al.add(101);//duplicates are allowed
//		al.add(1.2);//avaliable from java 1.2v
//		al.add(10);//default capacity is 10
//		al.add(5);//size increases by 5
//		al.add("not synchronized");//Not synchronized
//		
	
//		System.out.println(al);
	
//		//forloop
//		System.out.println("------------------- for-loop forward");
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
//		System.out.println("-------------------for-loop backward");
//		//printing backward using for Loop
//		for(int i=al.size()-1;i>=0;i--)
//		{
//			System.out.println(al.get(i));
//		}
//		System.out.println("-------------------for each loop");
		//using for each loop
		for(Object ob:al)
		{
			System.out.println(ob);
		}
//		System.out.println("-------------------Iterator");
//		//using iterator interface
//		Iterator<Object> i = al.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
	
	}
	
	public static void main(String[] args) 
	{
		new CollectionArrayList().method1(); 
	}
}
