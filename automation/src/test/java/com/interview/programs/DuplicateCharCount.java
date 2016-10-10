package com.interview.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharCount {
	public static void main(String[] args){
		DuplicateCharCount dcc = new DuplicateCharCount();
		dcc.findDuplicateChars("Ketan kkk");
	}
	public void findDuplicateChars(String str){
		Map<Character, Integer> dupsMap = new HashMap<Character, Integer>();
		char[] chrs = str.toCharArray();
		for(Character ch:chrs){
			if(dupsMap.containsKey(ch)){
				dupsMap.put(ch, dupsMap.get(ch)+1);
			} else{
				dupsMap.put(ch, 1);
			}
		}
		
		Set<Character> keys = dupsMap.keySet();
		for(Character ch:keys){
			if(dupsMap.get(ch)>1){
				System.out.println(ch+"---->"+dupsMap.get(ch));
			}
		}
	}

}
