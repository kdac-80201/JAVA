package com.tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.library.Library;

public class Program {
	static Scanner sc = new Scanner(System.in);
	 public static int menu() {
		 
			int choice;
			System.out.println("******************************");
			System.out.println("0. Exit");
			System.out.println("1. Add new book");
			System.out.println("2. Display All books");
			System.out.println("3. Delete at given index");
			System.out.println("4. Check Book with isbn number");
			System.out.println("5. Delete all books");
			System.out.println("6. Dispaly count of books");
			System.out.println("7. Sort books in decs order");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			return choice;
		}
	
	public static void main(String[] args) {
		
		
		List<Library> list = new ArrayList<Library>();
		Library lb;
		int choice;
		
		while((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				lb = new Library();
				lb.accept();
				list.add(lb);
				break;
			case 2:
				for(Library l: list)
					System.out.println(l);
				break;
			case 3:
				System.out.println("Enter index value ");
				int index = sc.nextInt();
				list.remove(index);
				break;
			case 4:
				System.out.println("Enter isbn number ");
				String num = sc.next();
				Library key = new Library();
				key.setIsbn(num);
				if(list.contains(key))
					System.out.println(num+" is present");
				else
					System.out.println(num+" is not present");
				break;
			case 5:
				list.clear();
				break;
			case 6:
				System.out.print("Size: "+list.size());
				break;
			case 7:
				class PriceComparator implements Comparator<Library>{
							
					public int compare(Library l1, Library l2) {
						int diff = - Double.compare(l1.getPrice(),l2.getPrice());
						return diff;
					}
				}
				PriceComparator comp = new PriceComparator();
				list.sort(comp);

				for(Library ele: list)
					System.out.println(ele+" ");
				break;

			default:
				System.out.println("Invalid entry! ");
				break;
			}
		}
	}
}
