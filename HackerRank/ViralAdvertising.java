/*
Viral Advertising

https://www.hackerrank.com/challenges/strange-advertising/problem

HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly  people on social media.

On the first day, half of those  people (i.e., ) like the advertisement and each shares it with  of their friends. At the beginning of the second day,  people receive the advertisement.

Each day,  of the recipients like the advertisement and will share it with  friends on the following day. Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day .

For example, assume you want to know how many have liked the ad by the end of the  day.

Day Shared Liked Cumulative
1      5     2       2
2      6     3       5
3      9     4       9
4     12     6      15
5     18     9      24
The cumulative number of likes is .

Function Description

Complete the viralAdvertising function in the editor below. It should return the cumulative number of people who have liked the ad at a given time.

viralAdvertising has the following parameter(s):

n: the integer number of days
Input Format

A single integer, , denoting a number of days.

Constraints

Output Format

Print the number of people who liked the advertisement during the first  days.

Sample Input

3
Sample Output

9
Explanation

This example is depicted in the following diagram:

strange ad.png

 people liked the advertisement on the first day,  people liked the advertisement on the second day and  people liked the advertisement on the third day, so the answer is .

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

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int shared = 0;
        int liked = 0;
        int cumulative = 0;
        
        for(int i=1; i<=n; i++){
            if(i==1){
                shared = 5;
                liked = 2;
                cumulative = 2;
            } else{
                shared = (liked)*3;
                liked = shared/2;
                cumulative += liked;
            }
        }
        
        return cumulative;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
