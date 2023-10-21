package tester;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


import com.bookwithinputstream.Book;



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
			System.out.println("8. Save Book");
			System.out.println("9. Load Book");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			return choice;
		}
	
	public static void main(String[] args) {
		
		
		List<Book> list = new ArrayList<Book>();
		Book lb;
		int choice;
		
		while((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				lb = new Book();
				lb.accept();
				list.add(lb);
				break;
			case 2:
				for(Book l: list)
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
				Book key = new Book();
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
				
				class PriceComparator implements Comparator<Book>{
							
					public int compare(Book l1, Book l2) {
						int diff = - Double.compare(l1.getPrice(),l2.getPrice());
						return diff;
					}
				}
				PriceComparator comp = new PriceComparator();
				list.sort(comp);

				for(Book ele: list)
					System.out.println(ele+" ");
				break;
				
			case 8:
				try(FileOutputStream fout = new FileOutputStream("SunbeamLibrary.txt")){
					try(DataOutputStream dout = new DataOutputStream(fout)){
						for(Book k : list ) {
							dout.writeUTF(k.getIsbn());
							dout.writeDouble(k.getPrice());
							dout.writeUTF(k.getAuthorName());
							dout.writeInt(k.getQuantity());
						}
					}// dout.close(); closed automatically
				}
				//fout.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Book Saved! ");
				break;
			case 9:
				try(FileInputStream fin = new FileInputStream("SunbeamLibrary.txt")){
					try(DataInputStream din = new DataInputStream(fin)){
						while(true)
						{
							Book gh = new Book();
							gh.setIsbn(din.readUTF());
							gh.setPrice(din.readDouble());
							gh.setAuthorName(din.readUTF());
							gh.setQuantity(din.readInt());
							System.out.println(gh);
						}
					}
				}
				catch (EOFException e) {
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			default:
				System.out.println("Invalid entry! ");
				break;
			}
		}
	}

}




















