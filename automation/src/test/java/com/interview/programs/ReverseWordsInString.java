package com.interview.programs;

public class ReverseWordsInString {
	public static void main(String args[]){
	String result = reverseWords("My Name is Ketan");
	System.out.println(result);
	}
	
		public static String reverseWords(String s) {
			if (s == null || s.length() == 0) {
				return "";
			}
	 
			// split to words by space
			String[] arr = s.split(" ");
			StringBuilder sb = new StringBuilder();
			for (int i = arr.length - 1; i >= 0; i--) {
				if (!arr[i].equals("")) {
					sb.append(arr[i]).append(" ");
				}
			}
			return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
		}
	}

