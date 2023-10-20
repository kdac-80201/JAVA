package com.functionalinterface;

import java.util.Scanner;


interface Arithmetic{
	double calc(double a,double b);
}

public class Functional_Interface {
	
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	
	
	static Scanner sc = new Scanner(System.in);
	
	static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("*******************");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		
		while((choice= menu()) != 0) {
			
			System.out.println("Enter 1st number");
			double num1 = sc.nextDouble();
			System.out.println("Enter 2nd number");
			double num2 = sc.nextDouble();
			
			switch (choice) {
			case 1:
				
				calculate(num1,num2,(x,y)-> x+y);
							break;
				
			case 2:
				calculate(num1,num2,(x,y)-> x*y);
				break;
			case 3:
				calculate(num1,num2,(x,y)-> x/y);
				break;

			default:
				System.out.println("Invalid Entry ");
				break;
			}
			
		}
	}
}
