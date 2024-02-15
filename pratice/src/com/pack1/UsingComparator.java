package com.pack1;

import java.util.Comparator;

public class UsingComparator implements Comparator<UsingComparatorA>
{

	@Override
	public int compare(UsingComparatorA o1, UsingComparatorA o2) {
		// TODO Auto-generated method stub
//		return o1.empId-o2.empId;
//		return o1.empName.compareTo(o2.empName);
//		return (int)o1.empSal-(int)o2.empSal;
//		return o1.getEmpId()-o2.getEmpId();
		return o1.getEmpName().compareTo(o2.getEmpName());
//		return (int)o1.getEmpSal()-(int)o2.getEmpSal();
		
	}

	
	

}
