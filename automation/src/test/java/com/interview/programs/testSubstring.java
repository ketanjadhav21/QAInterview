package com.interview.programs;


	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class testSubstring {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String str = scanner.next();
	        String[] strArr = SmallestAndLargestSubstring(str);
	        for (int i = 0; i < strArr.length; i++) {
	            System.out.println(strArr[i]);
	        }
	        scanner.close();
	    }

	    static int[] vowelChecking = { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 };

	    static String[] SmallestAndLargestSubstring(String input) {

	        char[] charArray = input.toLowerCase().toCharArray();

	        String maxString = null;
	        String minString = null;

	        List<Integer> vowelOccurences = new ArrayList<Integer>();
	        List<Integer> consonentOcc = new ArrayList<Integer>();

	        for (int i = 0; i < charArray.length; i++) {
	            if (isVowel(charArray[i])) {
	                vowelOccurences.add(i);
	            } else {
	                consonentOcc.add(i);
	            }
	        }

	        for (Integer vowelOccur : vowelOccurences) {

	            for (Integer consonentOccu : consonentOcc) {
	                if (consonentOccu > vowelOccur) {
	                    if (null == maxString && null == minString) {
	                        maxString = input.substring(vowelOccur, consonentOccu + 1);
	                        minString = input.substring(vowelOccur, consonentOccu + 1);
	                    }

	                    if (maxString.compareTo(input.substring(vowelOccur, consonentOccu + 1)) < 0) {
	                        maxString = input.substring(vowelOccur, consonentOccu + 1);
	                    }

	                    if ((input.substring(vowelOccur, consonentOccu + 1)).compareTo(minString) < 0) {
	                        minString = input.substring(vowelOccur, consonentOccu + 1);
	                    }
	                }
	            }

	        }

	        String[] result = new String[2];
	        result[0] = maxString;
	        result[1] = minString;

	        return result;
	    }

	    private static boolean isVowel(char ch) {
	        if (vowelChecking[(int) ch - 97] == 1) // 114-65
	            return true;

	        return false;
	    }

	}


