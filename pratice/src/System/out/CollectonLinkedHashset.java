package System.out;

import java.util.LinkedHashSet;

public class CollectonLinkedHashset 
{
	public void meth1()
	{
		System.out.println("LinkedHashSet\n");
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add(10);//Insertion is Maintained
		lhs.add("Tag");//Hetrogenous data is allowed
		lhs.add(null);//null is allowed
		lhs.add(10);//duplicates data is not allowed
		lhs.add(1.4);//avalabile form java 1.4v 
		lhs.add(16);//default capacity is 16 Load Factor[0.75]
		lhs.add(32);//size increases by DOUBLE
		lhs.add("Not Synchronized");//It is not synchronized
		
		System.out.println(lhs);
		
		
	}
	public static void main(String[] args) {
		new CollectonLinkedHashset().meth1();
	}

}
