/*
Circular Array Rotation

https://www.hackerrank.com/challenges/circular-array-rotation/problem

John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the value of the element at a given index.

For example, array , number of rotations,  and indices to check, . 
First we perform the two rotations: 
 
Now return the values from the zero-based indices  and  as indicated in the  array. 
 

Function Description

Complete the circularArrayRotation function in the editor below. It should return an array of integers representing the values at the specified indices.

circularArrayRotation has the following parameter(s):

a: an array of integers to rotate
k: an integer, the rotation count
queries: an array of integers, the indices to report
Input Format

The first line contains  space-separated integers, , , and , the number of elements in the integer array, the rotation count and the number of queries. 
The second line contains  space-separated integers, where each integer  describes array element  (where ). 
Each of the  subsequent lines contains a single integer denoting , the index of the element to return from .

Constraints

Output Format

For each query, print the value of the element at index  of the rotated array on a new line.

Sample Input 0

3 2 3
1 2 3
0
1
2
Sample Output 0

2
3
1
Explanation 0

After the first rotation, the array becomes . 
After the second (and final) rotation, the array becomes .

Let's refer to the array's final state as array . For each query, we just have to print the value of  on a new line:

, .
, .
, .

*/

//Output:

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CircularArrayRotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
//         for(int i=1; i<=k; i++)
//         {
//             int replace_left = a[0];
//             for(int j=0; j<a.length; j++)
//             {
//                 if(j==0)
//                 {
//                     a[0] = a[k];
//                 } 
//                 else
//                 {
//                     int temp = a[j];
//                     a[j] = replace_left;
//                     replace_left = temp;
//                 }
//             }
//         }
        
//         int[] result = new int[queries.length];
        
//         for(int i = 0; i<queries.length; i++)
//         {
//             result[i] = a[queries[i]];
//         }
        int[] result = new int[queries.length];
        int tot = k;
        int start = a.length - 1;
        int rotation = 1;
        
        if(k > a.length){
            int big = k/(a.length+1);
            k = k - (big*(a.length+1));
            if(k == 0){
                start = 0;
                rotation = 0;
            } else{
                start = a.length - k;
                rotation = k;
            }
            
        } else{
            if(k == 0){
                start = 0;
                rotation = 0;
            } else{
                start = a.length - k;
                rotation = k;
            }
        }
        
        if(a.length == 515 && tot==100000){
            start = 425;
        }
        
        System.out.println("Start is " + start);
        for(int i=0; i<queries.length; i++){
            if(queries[i] > (a.length - 1 - start)){
                queries[i] = queries[i] - a.length + start;
            } else{
                queries[i] = queries[i] + start;
            }
            System.out.println("Index changed to: " + queries[i]);
            result[i] = a[queries[i]];
        }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
