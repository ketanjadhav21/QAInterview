
package com.interview.programs;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args){
		System.out.println("Enter integer to be reversed");
		int number = new Scanner(System.in).nextInt();
		int temp;
		int reverseNumber=0;
	while(number>0){
		
		temp = number%10;
		number = number/10;
		reverseNumber = reverseNumber * 10 + temp;
		
	}
	System.out.println("Reverse No is:" +reverseNumber);
		
	}

}
