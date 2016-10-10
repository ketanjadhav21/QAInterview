package com.interview.programs;

public class ReverseEitherSide {
	
		   public static void main(String[] args) {
		      System.out.println(reverse("ABCDEFG"));
		   }
		   private static String reverse(String str) {
		      if (str.length() <= 1) {
		         return str;
		      }
		      return reverse(str.substring(1)) + str.substring(0, 1);
		   }
		}


