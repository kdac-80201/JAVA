package com.book.tester;

import java.util.Iterator;
import java.util.TreeSet;

import com.book.treeset.Book;

public class Program {

	public static void main(String[] args) {
		TreeSet<Book> bk = new TreeSet<>();
		
		 bk.add(new Book("a",152,"Afnan",5));	
		 bk.add(new Book("d",15,"Mahendra",4));
		 bk.add(new Book("z",50,"Adnan",7));
		 bk.add(new Book("e",20,"Afnan",9));
		 bk.add(new Book("q",152,"Afnan",6));
		 bk.add(new Book("e",30,"Afnan",9));
		 
		
		 Iterator<Book> b = bk.iterator();
		 while(b.hasNext()){
			 Book k = b.next();
			 System.out.println(k+", ");
		 }
		 
		 // Elements stored in sorted order
		 // Elements that are duplicate such as "e" are eliminated and not considered
	}

}
