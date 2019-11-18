package com.interview.programs;

public class SecondSmallestArray {
	public static void main(String[] args){
		int[] array = new int[]{12,43,22,2,1};
		findSecondSmallest(array);
	}

	private static void findSecondSmallest(int[] array) {
		// TODO Auto-generated method stub
		int first;
		int second;
		if(array.length<2){
			System.out.println("Array is too small");
			return;
		}
		first = second = Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++){
			if(array[i] < first){
				second = first;
				first = array[i];
			} else if (array[i]<second && array[i]!=first){
				second = array[i];
				
			}
		}
		System.out.println("Second smallest:"+second);
		System.out.println("Smallest:"+first);

	}
}
