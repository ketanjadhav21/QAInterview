package com.interview.programs;

public class DuplicateNumberOneLoop {
	public static void main(String[] args){
		DuplicateNumberOneLoop dn = new DuplicateNumberOneLoop();
		int[] array = new int[] {2,3,2,4,3,4,5,5,6,2};
		int n = array.length;
		dn.duplicateNum(array,n);
	}

	private void duplicateNum(int[] array, int n) {
		// TODO Auto-generated method stub
		int count[] = new int[n];
		int i;
        System.out.println("Repeated elements are : "); 

		for(i=0; i<n; i++){
			int çountindexValue= array[i];
			if(count[çountindexValue] == 1){
				System.out.println(çountindexValue + " ");
			}else{
				count[çountindexValue]++;
			}
		}
	}	

}
