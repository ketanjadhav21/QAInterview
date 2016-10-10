package com.interview.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombineArrayJava {

		    public static void main(String args[]) {
		      
		        int [] first = {3,2,1,4};
		        int [] second = {4,6,7,8,9,11,21,25};
		      
		        // combine two arrays in Java using Apache commons ArrayUtils
		        int [] combined = new int[first.length+second.length];
		        int j = 0;
		        for(int i=0; i<first.length; i++){
		        	combined[j++] = first[i];
		        }
		        for(int i=0; i<second.length; i++){
		        	combined[j++] = second[i];
		        }
		     
		/*        System.out.println("First array : " + Arrays.toString(first));
		        System.out.println("Second array : " + Arrays.toString(second));
		        System.out.println("Combined array : " + Arrays.toString(combined));

		  */
		        for(int i=0; i<combined.length; i++){
		        	System.out.println(combined[i]);
		        }
		    
		       
		          // sorting array
      
		    }

}
