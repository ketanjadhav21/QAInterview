/*
Cut the sticks

https://www.hackerrank.com/challenges/cut-the-sticks/problem

You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left. At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer sticks and then discard all the pieces of that shortest length. When all the remaining sticks are the same length, they cannot be shortened so discard them.

Given the lengths of  sticks, print the number of sticks that are left before each iteration until there are none left.

For example, there are  sticks of lengths . The shortest stick length is , so we cut that length from the longer two and discard the pieces of length . Now our lengths are . Again, the shortest stick is of length , so we cut that amount from the longer stick and discard those pieces. There is only one stick left, , so we discard that stick. Our lengths are .

Function Description

Complete the cutTheSticks function in the editor below. It should return an array of integers representing the number of sticks before each cut operation is performed.

cutTheSticks has the following parameter(s):

arr: an array of integers representing the length of each stick
Input Format

The first line contains a single integer , the size of . 
The next line contains  space-separated integers, each an  where each value represents the length of the  stick.

Output Format

For each operation, print the number of sticks that are present before the operation on separate lines.

Constraints

Sample Input 0

6
5 4 4 2 2 8
Sample Output 0

6
4
2
1
Explanation 0

sticks-length        length-of-cut   sticks-cut
5 4 4 2 2 8             2               6
3 2 2 _ _ 6             2               4
1 _ _ _ _ 4             1               2
_ _ _ _ _ 3             3               1
_ _ _ _ _ _           DONE            DONE
Sample Input 1

8
1 2 3 4 3 3 2 1
Sample Output 1

8
6
4
1
Explanation 1

sticks-length         length-of-cut   sticks-cut
1 2 3 4 3 3 2 1         1               8
_ 1 2 3 2 2 1 _         1               6
_ _ 1 2 1 1 _ _         1               4
_ _ _ 1 _ _ _ _         1               1
_ _ _ _ _ _ _ _       DONE            DONE

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

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        int[] dup = arr.clone();
        Arrays.sort(dup);
        int flag = 0;
        int cnt = 0;
        int k=0;
        int j=0;
        
        ArrayList<Integer> uniq = new ArrayList<Integer>();
        int prev = dup[0];
        int curr = dup[0];
        for(int i=0; i<dup.length; i++){
            curr = dup[i];
            if(i==0){
                uniq.add(curr);
            } else{
                if(prev != curr){
                    uniq.add(curr);
                }
            }
            prev = curr;
        }
        
        int[] result = new int[uniq.size()];
        
        while(flag==0){
            cnt = 0;
            int newNum = 0;
            if(k!=0 && k<uniq.size()){
                newNum = uniq.get(k) - uniq.get(k-1);
            } else{
                newNum = uniq.get(0);
            }
            
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=0){
                    arr[i] = arr[i] - newNum;
                    cnt++;
                }
            }
            k++;
            
            if(cnt==0){
                flag = 1;
                break;
            } else{
                result[j] = cnt;
                j++;
            }
        }   

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

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
