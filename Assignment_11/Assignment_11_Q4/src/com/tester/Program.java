package com.tester;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import com.descendingorder.ofprice.Book;


public class Program {

	public static void main(String[] args) {class PriceComparator implements Comparator<Book>{

		@Override
		public int compare(Book b1, Book b2) {
			int diff = Double.compare(b1.getPrice(),b2.getPrice());
			return diff;
		}
		 
	 }
	 
	 	PriceComparator pc = new PriceComparator();
		
		TreeSet<Book> bk = new TreeSet<>(pc);
		
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
		 
		 		 
		System.out.println("*****************************");
		System.out.println("Decending Order");
		 
		 Iterator<Book> ok = bk.descendingIterator();
		 while(ok.hasNext()) {
			 Book bok = ok.next();
			 System.out.println(bok+", ");
		 }
	}

}
