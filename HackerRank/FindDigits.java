/*
Find Digits

An integer  is a divisor of an integer  if the remainder of .

Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

Note: Each digit is considered to be unique, so each occurrence of the same digit should be counted (e.g. for ,  is a divisor of  each time it occurs so the answer is ).

Function Description

Complete the findDigits function in the editor below. It should return an integer representing the number of digits of  that are divisors of .

findDigits has the following parameter(s):

n: an integer to analyze
Input Format

The first line is an integer, , indicating the number of test cases. 
The  subsequent lines each contain an integer, .

Constraints

 

Output Format

For every test case, count the number of digits in  that are divisors of . Print each answer on a new line.

Sample Input

2
12
1012
Sample Output

2
3
Explanation

The number  is broken into two digits,  and . When  is divided by either of those two digits, the remainder is  so they are both divisors.

The number  is broken into four digits, , , , and .  is evenly divisible by its digits , , and , but it is not divisible by  as division by zero is undefined.

*/

//Output:

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindDigits {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int cnt = 0;
        String s = String.valueOf(n);
        String[] a = s.split("");
        
        for(String str: a){
            if(Integer.parseInt(str) != 0){
                if(n%Integer.parseInt(str) == 0){
                    cnt++;
                }
            }   
        }
        
        return cnt;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
