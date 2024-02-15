package com.pack1;

public class HashMapClassA implements Comparable<HashMapClassA>
{
	int id;
	String name;
	public HashMapClassA(int id,String name)
	{
		this.id = id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	
	@Override
	public int compareTo(HashMapClassA o) {
		return this.id-o.id;
//		return this.name.compareTo(o.name);
		
	}
	
	

}
