package com.interview.programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
		System.out.println("Enter the maximum number you want to see prime for:");
        int limit = new Scanner(System.in).nextInt();
        System.out.println("Printing the prime numbers:" +limit);
         for(int number=2; number<=limit; number++){
        	 if(isPrime(number)){
        		 System.out.println(number);
        	 }
         }
	}
  public static boolean isPrime(int number){
	  for(int i=2; i<number; i++){
		  if(number%i==0){
			  return false;
		  }		  
	  } return true;
	  
  }

}
