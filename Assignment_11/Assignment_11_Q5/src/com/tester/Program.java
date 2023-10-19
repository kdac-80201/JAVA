package com.tester;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.search.Book;

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
		
		
		HashMap<String, Book> bk = new HashMap<>();
		
		
		int choice;
		while((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Book b = new Book();
				b.accept();
				bk.put(b.getIsbn(), b);
				
				break;
			case 2:
				System.out.print("Enter isbn number to find ");
				String isbn1 = sc.next();
				Book f = bk.get(isbn1);
				System.out.println(f.toString());
				break;
			case 3:
				Set<Entry<String, Book>> entries = bk.entrySet();
				for(Entry<String,Book> entry : entries) {
					System.out.println(entry.getKey()+"  "+entry.getValue());
				}
			
				break;
			default:
				System.out.println("invalid Entry! ");
				break;
			}
			// No we don't need to write the equals() and hashCode() as we are using the
			// predefined classes for operations
			
		}

	}

}
