package com.interview.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Occurences {

	public static void main(String[] args){

		Occurences occ = new Occurences();
		String[] arr1 = new String[]{"The" , "QU!CK", "brown", "fox!È"};
		String[] arr2 = new String[]{"jumps over", "the" , "lazy"," brown", "dogggie"};
		occ.swappingArray(arr1, arr2);
		occ.countChar(arr1, arr2);
	}     





	public void swappingArray(String[] arr1, String[] arr2){
		String [] temp= arr1;
		arr1=arr2;
		arr2=temp;
		for(int i=0; i<arr1.length; i++){
			System.out.println("First Array: "+arr1[i]);
		}

		for(int i=0; i<arr2.length; i++){
			System.out.println("Second Array: "+arr2[i]);
		}

	}



	public void countChar(String[] arr1, String[] arr2){
		Map<Character, Integer> dupsMap = new HashMap<Character, Integer>();
		for(int i=0; i<arr1.length; i++){
			char[] chrs1 = arr1[i].toCharArray();
			for(Character ch:chrs1){
				ch= ch.toLowerCase(ch);
				if(dupsMap.containsKey(ch)){
					dupsMap.put(ch, dupsMap.get(ch)+1);
				} else{
					dupsMap.put(ch, 1);
				}
			}
		}
		for(int j=0; j<arr2.length; j++){
			char[] chrs2 = arr2[j].toCharArray();
			for(Character ch:chrs2){
				ch.toLowerCase(ch);
				if(dupsMap.containsKey(ch)){
					dupsMap.put(ch, dupsMap.get(ch)+1);
				} 
					
				
				else{
					dupsMap.put(ch, 1);
				}
			}




		}


		Set<Character> keys = dupsMap.keySet();
		for(Character ch:keys){
			System.out.println(ch+":"+dupsMap.get(ch));
		}

	}
}
