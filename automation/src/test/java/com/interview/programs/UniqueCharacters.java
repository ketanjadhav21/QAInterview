package com.interview.programs;

public class UniqueCharacters {
	public static void main(String args []){
		String s = "keAtan";
		UniqueCharacters uc = new UniqueCharacters();
		boolean result = uc.uniqueChars(s);
		if(result)
			System.out.println("String has all unique characters");
		else
			System.out.println("String contains duplicate characters");
	}
		public boolean uniqueChars(String s){
			boolean[] strSet = new boolean[256];
	        for (int i = 0; i < s.length(); i++) {
	        	int val = s.charAt(i);
	            if (strSet[val])
	                return false;
	            strSet[val] = true;
	        }
	        return true;
	    }
		
	}


