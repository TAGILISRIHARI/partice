package com.pack1;

import java.util.Collections;
import java.util.TreeSet;

public class TreeVi 
{
	public void meth1()
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		Collections.addAll(set,10, 17, 18, 19, 19, 19, 19, 20, 24, 24, 25, 27, 29, 29, 30, 32, 39, 39, 39, 42, 43, 45, 47, 49, 49, 49, 50, 52, 57, 58, 62, 72, 75, 78, 82, 82, 98, 99, 99, 100, 103, 108, 118, 118, 128, 151, 151, 151, 155, 155, 179, 179, 181, 181, 195, 195, 198, 199, 199, 204, 209, 219, 224, 232, 239, 239, 269, 289, 295, 296, 298, 298, 299, 299, 299, 319, 329, 359, 359, 368, 368, 369, 369, 399, 399, 409, 409, 418, 429, 449, 459, 475, 475, 479, 479, 479, 479, 479, 495, 499, 499, 499, 500, 537, 539, 539, 539, 539, 599, 599, 666, 666, 666, 695, 698, 699, 699, 699, 699, 719, 719, 719, 719, 719, 755, 839, 839, 839, 839, 839, 901, 901, 902, 903, 903, 949, 995, 999, 1000, 1066, 1066, 1199, 1199, 1449, 1449, 1495, 1799, 1799, 2388, 2695, 2899, 2899, 2899, 2998, 2999, 2999, 3099, 3099, 3099, 3495, 4695, 5195, 6995, 1449,601);
		System.out.println(set);
	}
	public static void main(String[] args) 
	{
		new TreeVi().meth1();
	}
}
