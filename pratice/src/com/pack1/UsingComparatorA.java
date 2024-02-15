package com.pack1;

public class UsingComparatorA 
{
//	POJO class does not depends any other clases means not use of extends or implements
//	In POJO class the variable are decalred as private
	private int empId;
	private String empName;
	private float empSal;
	
	public UsingComparatorA(int empId, String empName, float empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+" "+empName+" "+empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getEmpSal() {
		return empSal;
	}
	

}
