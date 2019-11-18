package com.interview.programs;

import java.util.HashSet;

public class RepeatedChar {
	public static void main(String[] args){
		String str = "keetaan";
		char[] ch = str.toCharArray();
		System.out.println(nonRep(ch));
	}

	private static char nonRep(char[] ch) {
		// TODO Auto-generated method stub
		HashSet<Character> h = new HashSet<>();
		
		for(int i=0; i<ch.length-1; i++){
			char c = ch[i];
			
			if(h.contains(c)){
				return c;
			}else{
				h.add(c);
			}
		}
		return '0';
	}
}
