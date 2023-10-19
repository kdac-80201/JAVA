package com.student;

import java.util.Scanner;

public class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
public void accept() {
		System.out.println("Enter Rollno ");
		roll = new Scanner(System.in).nextInt();
		System.out.println("Enter Name ");
		name = new Scanner(System.in).next();
		System.out.println("Enter City ");
		city = new Scanner(System.in).next();
		System.out.println("Enter Marks ");
		marks = new Scanner(System.in).nextDouble();
	}
	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student other) {
		int diff = this.roll - other.roll;
		return diff;
	}
	
}

