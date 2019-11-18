package com.interview.programs;

public class RevByWords {
	public static void main(String[] args){
		RevByWords rw = new RevByWords();
		rw.reverseWords("My Name is Ketan");
	}

	private String reverseWords(String str) {
		if(str == null || str.length() == 0){
			return "";
		}
		String[] strArray = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=strArray.length-1; i>=0; i--){
			if(!strArray[i].equals("")){
				sb.append(strArray[i]).append(" ");
			}
		}
		System.out.println(sb);
		return str;
		// TODO Auto-generated method stub
		
	}

}
