package com.interview.programs;

public class Palindrome {
	public static void main(String[] args){
		int [] numbers = new int[]{321,21,121,454,444};
		
		for(int i=0; i<numbers.length; i++){
			
			int number = numbers[i];
			int reverseNumber = 0;
			int temp = 0;
			
			while(number>0){
				temp = number%10;
				number = number/10;
				reverseNumber = reverseNumber * 10 + temp;
			}
			if (numbers[i] == reverseNumber)
				System.out.println(numbers[i]+ " is Palindrome");
				else
					System.out.println(numbers[i]+ " is not Palindrome");
				
			}
			
		}
	}


