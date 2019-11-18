package com.interview.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedChar {
	public static void main(String[] args){
		FirstNonRepeatedChar c = new FirstNonRepeatedChar();
		c.firstNonRepeat("baabttc");
//		String abc = "baaaabnaat";
//		Character c = firstNonRepeat(abc);
		System.out.println(c);
		
		
				
		
	}
	public static void firstNonRepeat(String str){
		Map<Character,Integer> dupsMap = new HashMap<Character,Integer>();
		char[] chrs = str.toCharArray();
		for(Character ch:chrs){
			if(dupsMap.containsKey(ch)){
				dupsMap.put(ch, dupsMap.get(ch)+1);
			} else{
				dupsMap.put(ch,1);
			}
		}
		
		boolean first= false;
		
	//	Set<Character> sb= dupsMap.keySet();
		
		List<Character> list= new ArrayList();
		
		for(int i=0; i<str.length(); i++){
		Character ch=str.charAt(i);
			if(dupsMap.get(ch)>1){
				list.add(ch);
			}
			
		}
		
		System.out.println(list.get(0) );
//		return null;
			
		
		
		/*for(int i=0; i<str.length(); i++){
			if(dupsMap.get(str.charAt(i))==1){
				char a = str.charAt(i);
				System.out.println(a);
				return str.charAt(i);
			}
			if(dupsMap.get(i)==1){
				char a = str.charAt(i);
				System.out.println(a);
				return str.charAt(i);
			}
		}*/
	
	}

}
