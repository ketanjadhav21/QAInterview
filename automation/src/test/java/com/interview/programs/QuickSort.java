package com.interview.programs;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] x = new int[]{ 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
 
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}
 
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		System.out.println("pivot"+pivot);
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;	
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println("After swapping "+Arrays.toString(arr));
		// recursively sort two sub parts
	//	System.out.println("low "+low + " j "+j);
		if (low < j){
		//	System.out.println("Called quick sort 1 ");
			quickSort(arr, low, j);
	//	System.out.println("1"+Arrays.toString(arr));
		}
		System.out.println("high "+high+ " i "+i);
		if (high > i){
			System.out.println("Called quick sort 2 "+i+" "+high);
			quickSort(arr, i, high);
		System.out.println("2"+Arrays.toString(arr));
		}
	}
}