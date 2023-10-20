package com.checkingintstream;

import java.util.stream.IntStream;

public class CheckingInstream {
	public static void main(String[] args) {
		IntStream s = IntStream.range(1, 10);

		System.out.println("sum"+s.sum());
		
		IntStream s2 = IntStream.range(1, 10);
		System.out.println("summaryStatistics"+s.summaryStatistics());
	}

}
