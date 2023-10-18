package com.tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

import com.employee.sunbeam.Employee;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		int choice;
		System.out.println("******************");
		System.out.println("0. Exit ");
		System.out.println("1. Add ");
		System.out.println("2. Delete ");
		System.out.println("3. Find ");
		System.out.println("4. Sort ");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		 LinkedList<Employee> e = new LinkedList<Employee>();
		 e.add(new Employee(1,"abc",55.2));
		 e.add(new Employee(2,"def",67.2));
		 e.add(new Employee(3,"ghi",89.2));
		 e.add(new Employee(4,"jkl",1011.2));
		 Employee emp;
		 int choice;
		 while((choice = menu())!=0) {
			 switch (choice) {
			case 1:
				emp = new Employee();
				emp.accept();
				e.add(emp);
				break;
			case 2:
				System.out.println("Enter emp id of Employee ");
				int id = sc.nextInt();
				
				Employee r = new Employee();
				r.setEmpid(id);
				if(e.contains(r)) {
				int index = e.indexOf(r);
				e.remove(index);
				}
				else
					System.out.println("Employee doesn't exist ");
				break;
			case 3:
				System.out.println("Enter Id to find Employee ");
				int id1 = sc.nextInt();
				Employee key = new Employee();
				key.setEmpid(id1);
				if(e.contains(key)) {
					int index = e.indexOf(key);
					System.out.println(e.get(index));
				}
				else
					System.out.println("Employee not found ");
					
				break;
			case 4:
				class Findsort implements Comparator<Employee>{

					@Override
					public int compare(Employee e1, Employee e2) {
						int diff = Integer.compare(e1.getEmpid(), e2.getEmpid());					
						return diff;
					}
				}
				
				Findsort f = new Findsort();
				
				
				Collections.sort(e,f);
				
				for(Employee ele : e)
					System.out.println(ele);
				
				break;

			default:
				break;
			}
		 }
	}

}
