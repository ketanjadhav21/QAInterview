package com.interview.programs;

public class MoveZeros {
	public static void main(String[] args){
		int[] array = new int[]{4,2,10,6,5,0,8,0,7};
		for(int j=1; j<array.length; j++){
			for(int i=0; i<array.length-j; i++){
				int temp;
				if(array[i]<array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		
		System.out.println("After Sort");
		printArray(array);
		}
		
		public static void printArray(int[] array){
			for(int i = 0 ; i < array.length; i++){
				System.out.println(array[i]);
			}
		}

}
