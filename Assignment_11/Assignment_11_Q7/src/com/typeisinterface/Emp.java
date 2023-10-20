package com.typeisinterface;

public interface Emp {
	double getSal();
	default double calcIncentives() {
		return 0.0;
	}
	static double calcTotalIncome(Emp arr[]) {
		double total = 0.0;
		for(Emp e : arr) {
			double incen = e.calcIncentives();
			total = total + incen;
		}
		return total;
	}

}
