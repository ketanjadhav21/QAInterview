/*
Sherlock and Squares

https://www.hackerrank.com/challenges/sherlock-and-squares/problem

Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value describing a range of integers. Sherlock must determine the number of square integers within that range, inclusive of the endpoints.

Note: A square integer is an integer which is the square of an integer, e.g. .

For example, the range is  and , inclusive. There are three square integers in the range:  and .

Function Description

Complete the squares function in the editor below. It should return an integer representing the number of square integers in the inclusive range from  to .

squares has the following parameter(s):

a: an integer, the lower range boundary
b: an integer, the uppere range boundary
Input Format

The first line contains , the number of test cases. 
Each of the next  lines contains two space-separated integers denoting  and , the starting and ending integers in the ranges.

Constraints

 

Output Format

For each test case, print the number of square integers in the range on a new line.

Sample Input

2
3 9
17 24
Sample Output

2
0
Explanation

Test Case #00: In range ,  and  are the two square integers. 
Test Case #01: In range , there are no square integers.

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

    // Complete the squares function below.
    static int squares(int a, int b) {
        double firstSqr = 0;
        int cnt = 0;
        
        for(int i=a; i<=b; i++){
            if(Math.sqrt(i)%1.0==0){
                firstSqr = Math.sqrt(i);
                break;
            }
        }
        
        double sqr = firstSqr*firstSqr;
        if(firstSqr!=0){
            for(double i=firstSqr; sqr<=(double)b; i++){
                sqr = i*i;
                if(sqr<=(double)b){
                    cnt++;
                } else{
                    break;
                }
                
            }
        }
        
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

