package com.interview.programs;

public class ReverseWords {
    public static void main(String args[]){
    String str[] = "He is the one".split(" ");
    String finalStr="";
    String revW = "";
        for(int i = str.length-1; i>= 0 ;i--){
//            finalStr += str[i]+" ";
        	finalStr = finalStr + str[i]+" ";
//            System.out.println(finalStr);

        }
        	for(int j=finalStr.length()-1; j>=0; j--){
        		revW = revW + finalStr.charAt(j);
               

        	}
        	 System.out.println(revW);
        }
        

   // }
}