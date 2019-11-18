package com.interview.programs;

public class Prime {
	public static void main(String[] args){
		int limit = 100;
//		isPrime(number);
		
		for(int number=2; number<=limit; number++){
		 if(isPrime(number)){
    		 System.out.println(number);
    	 }
		}
	}

	private static boolean isPrime(int number) {
		for(int i=2; i<number; i++){
			if(number%i==0){
				return false;
			}
		}return true;

		// TODO Auto-generated method stub
	}
}
