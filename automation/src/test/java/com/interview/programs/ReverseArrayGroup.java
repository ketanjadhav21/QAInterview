package com.interview.programs;

public class ReverseArrayGroup {
	public static void main(String[] args){
		int[] array = new int[] {1,2,3,4,5,6,7,8};
		int k = 3;
		int n = array.length;
		ReverseArrayGroup rsg = new ReverseArrayGroup();
		rsg.reverse(array, n, k);

		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}

	private void reverse(int[] array, int n, int k) {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i=i+k){
			int left = i;
			int right = Math.min(i+k-1, n-1);
			int temp;
			while(left<right){
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left = left + 1;
				right = right - 1;
			}
		}
	}
}