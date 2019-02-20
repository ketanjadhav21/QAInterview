/*
Minimum Distances

https://www.hackerrank.com/challenges/minimum-distances/problem

We define the distance between two array values as the number of indices between the two values. Given , find the minimum distance between any pair of equal elements in the array. If no such value exists, print .

For example, if , there are two matching pairs of values: . The indices of the 's are  and , so their distance is . The indices of the 's are  and , so their distance is .

Function Description

Complete the minimumDistances function in the editor below. It should return the minimum distance between any two matching elements.

minimumDistances has the following parameter(s):

a: an array of integers
Input Format

The first line contains an integer , the size of array . 
The second line contains  space-separated integers .

Constraints

Output Format

Print a single integer denoting the minimum  in . If no such value exists, print .

Sample Input

6
7 1 3 4 1 7
Sample Output

3
Explanation 
Here, we have two options:

 and  are both , so .
 and  are both , so .
The answer is .


*/

//Output:

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumDistances {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<a.length; i++){
            if(map.containsKey(a[i])){
                if(min > i-map.get(a[i])){
                    min = i-map.get(a[i]);
                    map.put(a[i],i);
                }
            } else{
                map.put(a[i],i);
            }
        }
        
        if(min == Integer.MAX_VALUE){
            return -1;
        } else{
            return min;
        }

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

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
