package com.interview.programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]){
		System.out.println("Enter the string to be reversed:");
		String original = new Scanner(System.in).nextLine();
		String reverse="";
		//int length = original.length();
		for(int i=original.length()-1; i>=0; i--)
			reverse = reverse + original.charAt(i); 
			System.out.println("Reversed string is: " +reverse);
		
		
	}

}
