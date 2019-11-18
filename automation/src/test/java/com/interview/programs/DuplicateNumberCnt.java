package com.interview.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateNumberCnt {
	public static void main(String[] args){
		DuplicateNumberCnt cnt = new DuplicateNumberCnt();
		int[] array = new int[] {10,20,32,10, 22,32};
		cnt.dupArray(array);
	}

	public void dupArray(int[] array) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> dupsMap = new HashMap<Integer, Integer>();
		for(int i=0; i<array.length; i++){
			if(dupsMap.containsKey(array[i])){
				dupsMap.put(array[i], dupsMap.get(array[i])+1);
			}else{
				dupsMap.put(array[i], 1);

			}
		}
		Set<Integer> keys = dupsMap.keySet();
		for(Integer arrays : keys){
			if(dupsMap.get(arrays)>1){
				System.out.println(arrays+":"+dupsMap.get(arrays));
			}
		}
		
	}

}
