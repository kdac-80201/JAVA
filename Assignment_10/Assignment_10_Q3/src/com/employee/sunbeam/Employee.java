package com.employee.sunbeam;

import java.util.Scanner;

import com.library.sunbeam.Book;

public class Employee {
	int empid;
	String name;
	double salary;
	Scanner sc = new Scanner(System.in);
	public int getEmpid() {
		return empid;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public void accept() {
		System.out.println("Enter Id");
		empid = sc.nextInt();
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Salary");
		salary = sc.nextDouble();		
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}		
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Employee) {
			Employee other =(Employee) obj;
			if(this.empid == other.empid) 
				return true;	
		}
		return false;
		
	}

}
