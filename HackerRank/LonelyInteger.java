/*
Lonely Integer

https://www.hackerrank.com/challenges/lonely-integer/problem

You will be given an array of integers. All of the integers except one occur twice. That one is unique in the array.

Given an array of integers, find and print the unique element.

For example, , the unique element is .

Function Description

Complete the lonelyinteger function in the editor below. It should return the integer which occurs only once in the input array.

lonelyinteger has the following parameter(s):

a: an array of integers
Input Format

The first line contains a single integer, , denoting the number of integers in the array. 
The second line contains  space-separated integers describing the values in .

Constraints

It is guaranteed that  is an odd number and that there is one unique element.
, where .
Output Format

Print the unique integer in the array.

Sample Input 0

1
1
Sample Output 0

1
Explanation 0

There is only one element in the array, thus it is unique.

Sample Input 1

3
1 1 2
Sample Output 1

2
Explanation 1

We have two 's, and  is unique.

Sample Input 2

5
0 0 1 2 1
Sample Output 2

2
Explanation 2

We have two 's, two 's, and one .  is unique.

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

    // Complete the lonelyinteger function below.
    static int lonelyinteger(int[] a) {
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int x: a){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            } else{
                map.put(x,1);
            }
        }
        
        Set<Integer> keys = map.keySet();
        for(int k: keys){
            if(map.get(k)==1){
                result=k;
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

        int result = lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
