package com.tester;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


import com.student.Student;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add");
		System.out.println("2. Find");
		System.out.println("3. Display");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,Student> map = new LinkedHashMap<>();
		
		
		int choice;
		while((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Student b = new Student();
				b.accept();
				map.put(b.getRoll(), b);
				
				break;
			case 2:
				System.out.print("Enter rollno to find ");
				int rollno = sc.nextInt();
				Student f = map.get(rollno);
				System.out.println(f.toString());
				break;
			case 3:
				Set<Entry<Integer, Student>> entries = map.entrySet();
				for(Entry<Integer,Student> entry : entries) {
					System.out.println(entry.getKey()+"  "+entry.getValue());
				}
			
				break;
			default:
				System.out.println("invalid Entry! ");
				break;
			}
			// we don't need to write the equals() and hashCode() in Student class
			// it's because were searching the element of predefined classes that are
			// internally inside the packages and their definition is there
			// like hashCode and equals method
			
		}

	}

}
