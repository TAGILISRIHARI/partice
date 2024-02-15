package com.pack1;

public class TreeSetClassA  implements Comparable<TreeSetClassA>
{
	int num;
	String branch;
	public TreeSetClassA(int num,String branch)
	{
		this.num=num;
		this.branch=branch;
	}
	public String toString()
	{
		return num+" "+branch;
	}
	@Override
	public int compareTo(TreeSetClassA o) {
		// TODO Auto-generated method stub
//		return this.num-o.num;
		return branch.compareTo(o.branch);
	}
}
