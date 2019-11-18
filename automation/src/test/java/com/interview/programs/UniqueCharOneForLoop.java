package com.interview.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCharOneForLoop {

	public static void main(String[] args) {
		String abc = "baaaabnaa";
		Character c = firstNonRepeatingChar(abc);
		System.out.println(c);

	}
	public static Character firstNonRepeatingChar(String word) {
		Set<Character> repeating = new HashSet<Character>();
		List<Character> nonRepeating = new ArrayList<Character>();
		for (int i = 0; i < word.length(); i++) 
		{ 
			char letter = word.charAt(i);
			if (repeating.contains(letter)) 
			{ 
				continue; 
			} 
			if (nonRepeating.contains(letter))
			{ 
				nonRepeating.remove((Character) letter);
				repeating.add(letter); 
			}
			else 
			{ 
				nonRepeating.add(letter); 
			} 
		} 
		return nonRepeating.get(0); } 

}
