package com.interview.programs;


public class BubbleSort {
	public static void main(String args[]){
		int[] number = new int[]{66, 22, 7, 10, 3, 55, 6};
		
	//	System.out.println("Before Sort");
		//printArray(array);
		
		for(int j = 1; j < number.length; j++){
			for(int i = 0 ; i < number.length - j; i++){
				int temp;
				//System.out.println(array[i] + " " + array[i + 1]);
				if(number[i] > number[i + 1]){
					temp = number[i];
					number[i] = number[i + 1];
					number[i + 1] = temp;
				}
			}
		//	System.out.println("On Iteraton " + j);
		//	printArray(array);
		}
		System.out.println("After Sort");
		printArray(number);
	}
	
	public static void printArray(int[] number){
		for(int i = 0 ; i < number.length; i++){
			System.out.println(number[i]);
		}
	}
}
