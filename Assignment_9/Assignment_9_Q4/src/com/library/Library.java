package com.library;

import java.util.Comparator;
import java.util.Scanner;

public class Library implements Comparator<Library>{
	String isbn;
	double price;
	String authorName;
	int quantity;
	Scanner sc = new Scanner(System.in);
	
	public Library() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Library(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public void accept() {
		System.out.print("Enter isbn number: ");
		isbn = sc.next();
		System.out.print("Enter price: ");
		price = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Author Name: ");
		authorName = sc.nextLine();
		System.out.print("Enter Quantity: ");
		quantity = sc.nextInt();
	}


	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	@Override
	public int compare(Library l1, Library l2) {
		int diff = - Double.compare(l1.getPrice(), l2.getPrice());
		return diff;
	}
	
	@Override
	public boolean equals(Object obj) {
		Library other =(Library) obj;
		if(this.isbn.equals(other.isbn)) {
			return true;	
		}
		return false;
	}
	
	

}
