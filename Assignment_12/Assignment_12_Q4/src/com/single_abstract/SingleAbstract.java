package com.single_abstract;

interface Check<T>{
	boolean compare(T x, T y);
}

public class SingleAbstract {
	
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
		
		Integer [] arr = {44, 55, 77, 99, 22, 55};
		Integer key = 50;
		
		int cnt = countif(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); 
		
	}
	
	
	
	

}
