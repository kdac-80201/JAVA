package com.tester;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.checkorder_book.Book;

public class Program {

	public static void main(String[] args) {
		 LinkedHashSet<Book> bk = new LinkedHashSet<>();
		 
		 bk.add(new Book("1",152,"Afnan",5));	
		 bk.add(new Book("2",15,"Mahendra",4));
		 bk.add(new Book("2",50,"Adnan",7));
		 bk.add(new Book("8",152,"Afnan",9));
		 bk.add(new Book("30",152,"Afnan",6));
		 
		 Iterator<Book> itr = bk.iterator();
			while(itr.hasNext()) {
				Book e = itr.next();
				System.out.println(e+", ");
			}
			// with using the hashcode we improved our code and 
			// now code only shows distinct elements according to isbn number
			// Code will be displayed according to the order of insertion
	}

}
