package com.sort;

import java.util.Comparator;

public class Sort {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		}
	
	public static void main(String[] args) {
//		Double[] a = {11.2,56.6,98.5,41.9};
		Double[] a = {65.32,65.95,14.36};
		
		selectionSort(a,new DoubleComparator());
		
		for(Double ele : a) {
			System.out.print(ele+" ");
		}
		
	}
	
	static class DoubleComparator implements Comparator<Double>{

		@Override
		public int compare(Double arg0, Double arg1) {
			
			return Double.compare(arg0, arg1) ;
		}
		
	}

}
