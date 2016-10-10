package com.interview.programs;

public class LargestAndSmallest {
	public static void main(String args []){
		int[] numbers = new int[]{2,22,55,33,54,29,49};
		
		int smallNum = numbers[0];
		int largeNum = numbers[0];
		
		for(int i=1; i<numbers.length; i++){
			if(numbers[i]>largeNum)
				largeNum = numbers[i];
			else if(numbers[i]<smallNum)
				smallNum=numbers[i];
		}
		
			System.out.println("Smallest number from Array is: " +smallNum);
			System.out.println("Largest number from Array is: " +largeNum);
				
			}
		
		
	

}
