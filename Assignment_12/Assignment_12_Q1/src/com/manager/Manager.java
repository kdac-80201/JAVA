package com.manager;

import com.typeisinterface.Emp;

public class Manager implements Emp {
	double basicSalary;
	double dearanceAllowance;
	
	
	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	@Override
	public double getSal() {
		
		return this.basicSalary+this.dearanceAllowance;
	}
	@Override
	public double calcIncentives() {
		// TODO Auto-generated method stub
		return (this.basicSalary+(0.2*this.basicSalary));
	}

}
