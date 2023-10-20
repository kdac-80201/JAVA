package com.laborpackage;

import com.typeisinterface.Emp;

public class Labor implements Emp {
	int hours;
	int rate;
	
	
	public Labor(int hours, int rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}
	
	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return this.hours*this.rate;
	}
	@Override
	public double calcIncentives() {
		double incentive;
		if(this.hours > 300)
		  	incentive = this.getSal() + (this.getSal()*0.05);
		else
			incentive = 0;
			
		return incentive;
	}

}
