package com.findmax.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxString {
	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add(new String("z"));
		s.add(new String("tw"));
		s.add(new String("thr"));
		s.add(new String("four"));
		s.add(new String("five "));
		
		String maxLength = Collections.max(s);
		System.out.println(maxLength);
	}

}
