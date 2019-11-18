package com.interview.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharNo {
	public static void main(String[] args){
		String str = "aabbbccccaaa";
		findRepeatedCharNo(str);
	}

	private static void findRepeatedCharNo(String str) {
		// TODO Auto-generated method stub
		Map<Character, Integer> dupsMap = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		for(Character ch:chars){
			if(dupsMap.containsKey(ch)){
				dupsMap.put(ch, dupsMap.get(ch)+1);
			} else{
				dupsMap.put(ch, 1);
			}
		}
		
		Set<Character> keys = dupsMap.keySet();
		for(Character ch:keys){
			if(dupsMap.get(ch)>1){
				System.out.println(dupsMap+":"+dupsMap.get(ch));
			}
		}
	}

}
