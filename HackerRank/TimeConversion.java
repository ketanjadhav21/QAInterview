/*
Time Conversion

https://www.hackerrank.com/challenges/time-conversion/problem

Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in  hour format
Input Format

A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

Constraints

All input times are valid
Output Format

Convert and print the given time in -hour format, where .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45

*/

//Output:

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] a = s.split(":");
        String[] result = new String[3];
        
        int hour = Integer.parseInt(a[0]);
        
        if(a[2].charAt(2) == 'P'){
            if(hour!=12){
                hour += 12;
            }
            result[0] = Integer.toString(hour);
        } else{
                if(hour == 12){
                    result[0] = "00";
                } else{
                     result[0] = a[0];
                }
        }
        
        result[1] = a[1];
        result[2] = "" + a[2].charAt(0) + a[2].charAt(1);
        
        String output = result[0]+":"+result[1]+":"+result[2];
        return output;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

