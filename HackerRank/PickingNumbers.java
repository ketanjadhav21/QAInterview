/*
Picking Numbers

https://www.hackerrank.com/challenges/picking-numbers/problem

Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is less than or equal to . For example, if your array is , you can create two subarrays meeting the criterion:  and . The maximum length subarray has  elements.

Function Description

Complete the pickingNumbers function in the editor below. It should return an integer that represents the length of the longest array that can be created.

pickingNumbers has the following parameter(s):

a: an array of integers
Input Format

The first line contains a single integer , the size of the array . 
The second line contains  space-separated integers .

Constraints

The answer will be .
Output Format

A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference between any two of the chosen integers is .

Sample Input 0

6
4 6 5 3 3 1
Sample Output 0

3
Explanation 0

We choose the following multiset of integers from the array: . Each pair in the multiset has an absolute difference (i.e.,  and ), so we print the number of chosen integers, , as our answer.

Sample Input 1

6
1 2 2 3 1 2
Sample Output 1

5
Explanation 1

We choose the following multiset of integers from the array: . Each pair in the multiset has an absolute difference  (i.e., , , and ), so we print the number of chosen integers, , as our answer.

*/

//Output:

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int result = 0;
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        
        for (int x: a){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            } else{
                map.put(x,1);
            }
        }
        
        Set<Integer> keys = map.keySet();
        int[] pairkeys = new int[keys.size()];
        int z = 0;
        for(int x: keys){
            pairkeys[z] = x;
            z++;
        }
        
        if(pairkeys.length == 1){
            result = map.get(pairkeys[0]);
        } else{
            for(int i=0; i<pairkeys.length; i++){
                for(int j=i+1; j<pairkeys.length; j++){
                    if(Math.abs(pairkeys[i]-pairkeys[j]) == 1){
                        pairs.add(pairkeys[i]);
                        pairs.add(pairkeys[j]);
                    }
                }
            }
            
            for(int i=0; i<pairs.size(); i+=2){
                int sizePairs = map.get(pairs.get(i)) + map.get(pairs.get(i+1));
                if(sizePairs > result){
                    result = sizePairs;
                }
            }
            
            for(int x: keys){
        	    if(map.get(x) > result){
        	   	   result = map.get(x);
        	   }
            } 
        }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
