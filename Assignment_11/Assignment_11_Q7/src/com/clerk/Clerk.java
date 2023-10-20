package com.clerk;

import com.typeisinterface.Emp;

public class Clerk implements Emp {
	double salary;
	
	

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}



	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return this.salary;
	}
	

}
