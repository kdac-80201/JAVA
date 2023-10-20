package com.checkelements;


interface Check<T>{
	boolean compare(T x, T y);
}

public class CheckElements {
	
	static <T> int countif(T[] arr, T key, Check<T> c) {
		
		int count = 0;
		for(T t : arr) {
		boolean	diff = c.compare(t, key);

		if(diff == true)
			count++;
	}
		return count;
	}
	
	public static void main(String[] args) {
		
		Double [] arr = {44.1, 55.36, 77.14,22.0,55.36, 99.0, 22.0, 55.0};
		Double key = 22.0;
		
		int cnt = countif(arr, key, (x,y)-> x.equals(y));
		System.out.println("Occurence = " + cnt); 
		
	}

}
