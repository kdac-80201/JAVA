package com.library.sunbeam;

import java.util.Scanner;

public class Book{
	String isbn;
	double price;
	String authorName;
	int quantity;
	Scanner sc = new Scanner(System.in);
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String isbn, double price, String authorName, int quantity) {
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
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Book) {
			Book other =(Book) obj;
			if(this.isbn.equals(other.isbn)) 
				return true;	
		}
		return false;
		
	}
	
	

}
