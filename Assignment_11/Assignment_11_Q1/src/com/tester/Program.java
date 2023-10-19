package com.tester;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

import com.book.hashset.Book;

public class Program {
	
//	1. Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. If any book with duplicate
//	isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem

	public static void main(String[] args) {
		HashSet<Book> bk = new HashSet<Book>();
		bk.add(new Book("1",152,"Afnan",5));	
		bk.add(new Book("2",15,"Mahendra",4));
		bk.add(new Book("2",50,"Adnan",7));
		bk.add(new Book("8",152,"Afnan",9));
		bk.add(new Book("30",152,"Afnan",6));
		
		
		Iterator<Book> itr = bk.iterator();
		while(itr.hasNext()) {
			Book e = itr.next();
			System.out.println(e+", ");
			
			// if book with duplicate isbn is added it will display all elements including duplicates
			// Books are stored in any order based on hashCode()
			
			// to solve the duplicate ISBN problem we can use hashcode
			//public int hashCode() { return Objects.hash(this.isbn);}
		}
			
			
		}
		
	}

}
