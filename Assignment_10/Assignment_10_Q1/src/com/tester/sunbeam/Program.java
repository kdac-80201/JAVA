package com.tester.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.library.sunbeam.Book;

public class Program {
	static Scanner sc = new Scanner(System.in);
	 public static int menu() {
		 
			int choice;
			System.out.println("******************************");
			System.out.println("0. Exit");
			System.out.println("1. Add new book");
			System.out.println("2. Display All books");
			System.out.println("3. show book at given isgn");
			System.out.println("4. Delete Book with index number");
			System.out.println("5. Delete book with given isbn");
			System.out.println("6. Dispaly count of books");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			return choice;
		}
	
	public static void main(String[] args) {

		
		
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("1",1,"sf",4));
		list.add(new Book("2",17,"sf",9));
		list.add(new Book("3",19,"s",2));
		Book lb;
		int choice;
		
		while((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				lb = new Book();
				lb.accept();
				if(list.contains(lb)) {
					Book b;
					b = list.get(list.indexOf(lb));
					b.setQuantity(lb.getQuantity()+b.getQuantity());
					
				}
				list.add(lb);
				break;
			case 2:
		
				for(int i =0; i< list.size();i++)
					System.out.println(list.get(i));
				break;
			case 3:
				System.out.println("Enter isbn value ");
				String no = sc.next();
				Book key = new Book();
//				list.remove(index);
				key.setIsbn(no);
				if (list.contains(key)) {
					int index = list.indexOf(key);
					System.out.println(list.get(index));
				}
				else
					System.out.println("No Book found ");
				
				break;
			case 4:
				System.out.println("Enter index number ");
				int in = sc.nextInt();
				list.remove(in);
				
				break;
			case 5:
				System.out.println("Enter isbn number ");
				String num = sc.next();
				Book ky = new Book();
				ky.setIsbn(num);
				if(list.contains(ky))
					list.remove(ky);
				else
					System.out.println(num+" is not present");
				
				break;
			case 6:
				Collections.reverse(list);
				for(Book ele : list)
				System.out.println(ele);
				break;
			default:
				System.out.println("Invalid entry! ");
				break;
			}
		}
	}
}
