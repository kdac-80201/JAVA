package com.showpackage;

import java.io.BufferedReader;
import java.io.FileReader;

public class ShowFile {

	public static void main(String[] args) {
		 try(FileReader fr = new FileReader("/home/afnan/Practice_Sunbeam_Dac_All/Java_Practice/Assignment_13_Q3/MyNewData.txt")){
			 BufferedReader br = new BufferedReader(fr);
			 String b;
			 
			 while((b =  br.readLine())!= null) {
			    
				System.out.println(b);
				 
			 }
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}

	}

}
