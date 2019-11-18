package com.interview.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepChar {
	public static void main(String[] args){
		FirstNonRepChar fc = new FirstNonRepChar();
		fc.nonRepChar("sossfrrn");
	}

	private void nonRepChar(String str) {
		// TODO Auto-generated method stub
		Map<Character, Integer> dupsMap = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		for(Character ch:chars){
			if(dupsMap.containsKey(ch)){
				dupsMap.put(ch, dupsMap.get(ch)+1);
			}else{
				dupsMap.put(ch, 1);
			}
		}
		
//		List<Character> list = new ArrayList<Character>();
		for(int i=0; i<str.length(); i++){
			Character ch = str.charAt(i);
			if(dupsMap.get(ch)==1){
				System.out.println("First Non Repeater char is:" +ch);
				return;
//				list.add(ch);
			}
		}
//		System.out.println("First NonRepeated" +list.get(0) );

	}
}
