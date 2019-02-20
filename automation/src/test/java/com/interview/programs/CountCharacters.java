package com.interview.programs;

public class CountCharacters {
	 
	   public static void main(String args[]){
	 
	      String str="aabc";
	      String temp="";
	 
	      for (int i = 0; i < str.length(); i++) {
	    	  System.out.println("Unique character count: "+temp.indexOf(str.charAt(i)));
	         if(temp.indexOf(str.charAt(i)) == -1 ){
	             temp = temp + str.charAt(i);
	         }
	      }
	 
	     
	      System.out.println("Unique character count: " + temp.length());
	 
	   }
	}