package com.pack1;

public class QueueClassA implements Comparable<QueueClassA>
{
	String name;
	int id;
	public QueueClassA(String name,int id)
	{
		this.name=name;
		this.id=id;
		
	}
	public String toString()
	{
		return id+" "+name;
	}
	@Override
	public int compareTo(QueueClassA o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
//	[1 agili, 4 Ta, 6 Tag, 10 Tagili, 12 ili, 7 gili]
}
