/*
Lisa's Workbook

https://www.hackerrank.com/challenges/lisa-workbook/problem

Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters. Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. The format of Lisa's book is as follows:

There are  chapters in Lisa's workbook, numbered from  to .
The  chapter has  problems, numbered from  to .
Each page can hold up to  problems. Only a chapter's last page of exercises may contain fewer than  problems.
Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
The page number indexing starts at .
Given the details for Lisa's workbook, can you count its number of special problems?

For example, Lisa's workbook contains  problems for chapter , and  problems for chapter . Each page can hold  problems. The first page will hold  problems for chapter . Problem  is on page , so it is special. Page contains only Chapter , Problem , so no special problem is on page . Chapter  problems start on page  and there are problems. Since there is no problem  on page , there is no special problem on that page either. There is  special problem in her workbook.

Note: See the diagram in the Explanation section for more details.

Function Description

Complete the workbook function in the editor below. It should return an integer that represents the number of special problems in the workbook.

workbook has the following parameter(s):

n: an integer that denotes the number of chapters
k: an integer that denotes the maximum number of problems per page
arr: an array of integers that denote the number of problems in each chapter
Input Format

The first line contains two integers  and , the number of chapters and the maximum number of problems per page. 
The second line contains  space-separated integers  where  denotes the number of problems in the  chapter.

Constraints

Output Format

Print the number of special problems in Lisa's workbook.

Sample Input

5 3  
4 2 6 1 10
Sample Output

4
Explanation

The diagram below depicts Lisa's workbook with  chapters and a maximum of  problems per page. Special problems are outlined in red, and page numbers are in yellow squares.

bear_workbook.png

There are  special problems and thus we print the number  on a new line.

*/

//Output:

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LisasWorkbook {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
        int pageNum = 1;
        int cnt = 0;
        
        for(int i=0; i<arr.length; i++){
            int finalProblem = 0;
            for(int j=1; j<=arr[i]; j++){
                if(j==pageNum){
                    cnt++;
                }
                    
                if(j%k==0){
                    pageNum++;
                }
                finalProblem = j;
            }
            if(finalProblem%k!=0){
                pageNum++;
            }
        }
        System.out.println(cnt);
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
