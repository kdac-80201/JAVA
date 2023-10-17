package com.tester;
import java.util.Arrays;
import java.util.Comparator;

import com.sortstudent.*;

public class Program {

	public static void main(String[] args) {
		 Student[] arr = new Student[5];
		 arr[0] = new Student(1,"b","beed",89);
		 arr[1] = new Student(14,"a","beed",9);
		 arr[2] = new Student(6,"d","mumbai",5);
		 arr[3] = new Student(8,"z","idd",7);
		 arr[4] = new Student(7,"g","gh",85);
		 
		 for(Student s : arr) {
			 System.out.println(s);
		 }
		 
		 Arrays.sort(arr);
		 System.out.println("*********************");
		 
		 for(Student s : arr) {
			 System.out.println(s);
		 }
		 
		 
		 class StudentCity implements Comparator<Student>{

			@Override
			public int compare(Student s1, Student s2) {
				int diff = -(s1.getCity().compareTo(s2.getCity()));
				return diff;
			} 
		 }
		 
		 StudentCity scity = new StudentCity();
		 Arrays.sort(arr,scity);
		 System.out.println("Sorting by City");
		 for(Student s : arr)
			 System.out.println(s);
		 
		 class StudentMarks implements Comparator<Student>{

			@Override
			public int compare(Student s1, Student s2) {
				int diff = -(Double.compare(s1.getMarks(), s2.getMarks()));
				return diff;
			}
			 
		 }
		 
		 StudentMarks Smarks = new StudentMarks();
		 Arrays.sort(arr,Smarks);
		 System.out.println("Sorting by Marks");
		 for(Student s : arr)
			 System.out.println(s);
		 
		 class Studentname implements Comparator<Student>{

			@Override
			public int compare(Student s1, Student s2) {
				int diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
			 
		 }
		 
		 Studentname Sname  = new Studentname();
		 Arrays.sort(arr,Sname);
		 System.out.println("Sorting by Name");
		 for(Student s : arr) {
			 System.out.println(s);
		 }
		 
		 
	}

}
