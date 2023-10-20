package com.findfactorial;

import java.util.stream.Stream;

public class CalculateFactorial {
	public static void main(String[] args) {
		
		int num = 6;
		
		Stream<Integer> s = Stream.iterate(1, i->i+1).limit(num);
			  int	res = s.reduce(1,(a,e)-> a* e);
		System.out.println(res);
	}
	

}
