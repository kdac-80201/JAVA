package com.display;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class DisplayFourLine {

	public static void main(String[] args) {
		try(FileWriter fwr = new FileWriter("MyNewData.txt")){
			BufferedWriter bwr = new BufferedWriter(fwr);
			Scanner sc = new Scanner(System.in);
			for(int i = 0; i<4; i++) {
				System.out.println("Enter a "+i+" line");
				String line  = sc.nextLine();
				bwr.write(line);
//				bwr.newLine();
				bwr.write("\n");
				//
			}
			bwr.flush(); // telling buffer to flush all the program and give it to secondary memory
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
