package com.minarray;

public class MinArray {
	
	public static <T extends Number> T findMin(T[] arr) {
		
		
		T temp = arr[0];
		for(int i = 1 ; i< arr.length ; i++) {
			if(arr[i].doubleValue() < temp.doubleValue())
				temp = arr[i];	
		}
		return temp;
		
		}
 
		public static void main(String[] args) {
		MinArray b = new MinArray();

		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		System.out.println("min value is "+min1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println("Min value "+min2);
		
		
		}
		
		
		
}

