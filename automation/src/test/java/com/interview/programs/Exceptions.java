package com.interview.programs;

import java.awt.Font;

public class Exceptions {
	public static void main(String[] args){
		int[] array = new int[5];		
		try{
			array[0] = 12;
			array[1] = 23;
			array[2] = 34;
			array[3] = 44;
			array[4] = 54;

			for(int i=0; i<array.length; i++) {
				System.out.println("Contents of the array are: "+array[i]+"\n");
			}
			System.out.println("length of the array is: "+array.length);

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Sorry!!! You crossed the limits");
		}


	}
}
