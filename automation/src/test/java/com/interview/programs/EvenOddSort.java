package com.interview.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class EvenOddSort {
	public static void main(String[] args){
		int[] array_sort = {1, 2, 3, 4, 5, 6, 7, 8, 9 };

		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		for (int i : array_sort) {
		    if ((i%2) == 1) {
		        odd.add(i);
		    } else {
		        even.add(i);
		    }
		}
		//Collections.sort(odd);
		//Collections.sort(even);
		System.out.println("Odd:" + odd);
		System.out.println("Even:" + even);
			}
		
	}


