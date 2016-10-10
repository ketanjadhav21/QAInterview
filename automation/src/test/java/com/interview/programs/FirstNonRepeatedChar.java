package com.interview.programs;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
	public static void main(String[] args){
		String abc = "baaaabnaa";
		Character c = firstNonRepeat(abc);
		System.out.println(c);
		
		
				
		
	}
	public static Character firstNonRepeat(String str){
		Map<Character,Integer> dupsMap = new HashMap<Character,Integer>();
		char[] chrs = str.toCharArray();
		for(Character ch:chrs){
			if(dupsMap.containsKey(ch)){
				dupsMap.put(ch, dupsMap.get(ch)+1);
			} else{
				dupsMap.put(ch,1);
			}
		}
		for(int i=0; i<str.length(); i++){
			if(dupsMap.get(str.charAt(i))==1){
				return str.charAt(i);
			}
		}
		return null;
	}

}
