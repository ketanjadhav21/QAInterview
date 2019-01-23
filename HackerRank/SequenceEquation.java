/*
Sequence Equation

https://www.hackerrank.com/challenges/permutation-equation/problem

Given a sequence of  integers,  where each element is distinct and satisfies . For each where , find any integer  such that  and print the value of  on a new line.

For example, assume the sequence . Each value of  between  and , the length of the sequence, is analyzed as follows:

, so 
, so 
, so 
, so 
, so 
The values for  are .

Function Description

Complete the permutationEquation function in the editor below. It should return an array of integers that represent the values of .

permutationEquation has the following parameter(s):

p: an array of integers
Input Format

The first line contains an integer , the number of elements in the sequence. 
The second line contains  space-separated integers  where .

Constraints

, where .
Each element in the sequence is distinct.
Output Format

For each  from  to , print an integer denoting any valid  satisfying the equation  on a new line.

Sample Input 0

3
2 3 1
Sample Output 0

2
3
1
Explanation 0

Given the values of , , and , we calculate and print the following values for each  from  to :

, so we print the value of  on a new line.
, so we print the value of  on a new line.
, so we print the value of  on a new line.
Sample Input 1

5
4 3 5 1 2
Sample Output 1

1
3
5
4
2

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

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] q = new int[p.length];
        int[] r = new int[p.length];
        for(int i=1; i<=p.length; i++){
            for(int j=0; j<p.length; j++){
                if(p[j]==i){
                    q[i-1] = j+1;
                }
            }
        }
        for(int i=0; i<p.length; i++){
            System.out.print(q[i]);
        }
        System.out.println();
        
        for(int i=1; i<=p.length; i++){
            for(int j=0; j<p.length; j++){
                if(q[i-1]==p[j]){
                    r[i-1] = j+1;
                }
            }
        }
        for(int i=0; i<p.length; i++){
            System.out.print(r[i]);
        }
        return r;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

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
