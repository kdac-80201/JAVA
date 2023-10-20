package com.sum;

import java.util.Random;
import java.util.stream.Stream;

public class Sumof_10_Random {
	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> s = Stream.generate(()->r.nextInt(10)).limit(5);
		int res = s.reduce(0,(a,e)->a+e);
		System.out.println("Sum "+res);
	}
	

}
