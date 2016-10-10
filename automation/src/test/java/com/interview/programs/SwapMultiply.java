package com.interview.programs;

public class SwapMultiply {
	public static void main(String args []){
		int a = 5, b = 6;
		b = a * b; // a = 5, b = 30
		a = b / a; // a = 6, b = 30
		b = b / a; // a = 6, b = 5
		System.out.println("A = " + a + " B = " + b);
		
		int[] arr = new int[]{1, 3, 5, 6, 7}; // {630, 210, ...}
		
		int result = 1;
		for(int j= 0; j<arr.length; j++){
			result = result * arr[j];
		}
		
		for(int i=0; i<arr.length; i++){
			arr[i] = result / arr[i]; 
		}
		
		printArray(arr);
		
		
		/*int result = 1;
		for(int i=0; i<arr.length; i++){
			result *= arr[i];
			System.out.println(result);
		}*/
		
	}
	
	public static void printArray(int[] array){
		for(int i = 0 ; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
