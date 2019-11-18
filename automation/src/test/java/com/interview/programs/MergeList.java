package com.interview.programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
	public static void main(String[] args){
		List<String> s1 = new ArrayList<String>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("");

		
		
		List<String> s2 = new ArrayList<String>();
		s2.add("A");
		s2.add("Z");
		
		System.out.println(s1);
		System.out.println(s2);

		Set<String> set = new LinkedHashSet<String>(s1);
		set.addAll(s2);
		set.remove("");
		List<String> combine = new ArrayList<String>(set);
		System.out.println(combine);
		
		//Other way to do this:Using lambda
//		List<String> combinedList = Stream.of(s1, s2)
//                .flatMap(x -> x.stream())
//                .collect(Collectors.toList());
//		System.out.println(combinedList);		
		
//		   Set<String> set = new LinkedHashSet<>(s1);
//	        set.addAll(s2);
//	        List<String> combinedList = new ArrayList<>(set);
//	         
//	        System.out.println(combinedList);
	}
}
