package com.tester;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.daoof.user.UserDao;
import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.userspackage.Users;

public class Program {
	static int menu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("***************");
		System.out.println("0. EXIT ");
		System.out.println("1. Add USER ");
		System.out.println("2. Delete USER" );
		System.out.println("3. Display USER ");
		System.out.println("4. Update USER ");
		System.out.print("Enter your choice ");
		choice = sc.nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 
		int choice;
		
		while((choice = menu())!= 0) {
			switch (choice) {
			
			case 1:
				try(UserDao ud = new UserDao()){
					System.out.print("Enter id ");
					int id = sc.nextInt();
					System.out.print("Enter First name ");
					String fName = sc.next();
					System.out.print("Enter Last name ");
					String lName = sc.next();
					System.out.print("Enter Email ");
					String email = sc.next();
					System.out.print("Enter Password ");
					String Pass = sc.next();
					System.out.println("Enter date mm-dd-yyyy");
					String dt = sc.next();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					
					java.util.Date date = sdf.parse(dt);
					System.out.println("Enter status (true/false) ");
					Boolean status = sc.nextBoolean();
					System.out.print("Enter role ");
					String role = sc.next();
					
					int cnt = ud.AddUser(id ,fName, lName, email, Pass, date, status, role);
					System.out.println("Rows affected "+cnt);
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 2: // Delete user
				try(UserDao ud = new UserDao()){
					System.out.println("Enter id to delete");					
					int id = sc.nextInt();
					int count = ud.DeleteUser(id);
					System.out.println("Rows affected: "+count);
				}
				catch(Exception e ) {
					e.printStackTrace();
					
				}
				break;
			case 3:
				try(UserDao ud = new UserDao()){
					System.out.print("Enter id for search ");
					int id = sc.nextInt();
					List <Users> list = ud.DisplayUser(id);
					list.forEach(users -> System.out.println(users));
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case 4:
				try(UserDao ud = new UserDao()){
					System.out.println("Enter user id to update ");
					int id = sc.nextInt();
					System.out.print("Enter First name ");
					String fName = sc.next();
					System.out.print("Enter Last name ");
					String lName = sc.next();
					System.out.print("Enter Email ");
					String email = sc.next();
					System.out.print("Enter Password ");
					String Pass = sc.next();
					System.out.println("Enter date mm-dd-yyyy");
					String dt = sc.next();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					
					java.util.Date date = sdf.parse(dt);
					System.out.println("Enter status (true/false) ");
					Boolean status = sc.nextBoolean();
					System.out.print("Enter role ");
					String role = sc.next();
					
					int count =ud.UpdateUser(id, fName, lName, email, Pass, date, status, role);
					System.out.println("Rows affected: "+count);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
			}
		}
		

	}

}
