/*
Halloween Sale

https://www.hackerrank.com/challenges/halloween-sale/problem

You wish to buy video games from the famous online video game store Mist.

Usually, all games are sold at the same price,  dollars. However, they are planning to have the seasonal Halloween Sale next month in which you can buy games at a cheaper price. Specifically, the first game you buy during the sale will be sold at dollars, but every subsequent game you buy will be sold at exactly  dollars less than the cost of the previous one you bought. This will continue until the cost becomes less than or equal to  dollars, after which every game you buy will cost  dollars each.

For example, if ,  and , then the following are the costs of the first  games you buy, in order:

You have  dollars in your Mist wallet. How many games can you buy during the Halloween Sale?

Input Format

The first and only line of input contains four space-separated integers , ,  and .

Constraints

Output Format

Print a single line containing a single integer denoting the maximum number of games you can buy.

Sample Input 0

20 3 6 80
Sample Output 0

6
Explanation 0

We have ,  and , the same as in the problem statement. We also have  dollars. We can buy  games since they cost  dollars. However, we cannot buy a th game. Thus, the answer is .

Sample Input 1

20 3 6 85
Sample Output 1

7
Explanation 1

This is the same as the previous case, except this time we have  dollars. This time, we can buy  games since they cost  dollars. However, we cannot buy an th game. Thus, the answer is .

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

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int cnt = 0;
        int cost = 0;
        int flag = 0;
        
        for(int i=p; i>=m; i=i-d){
            cost += i;
            if(cost>s){
                flag = 1;
                break;
            } else{
                cnt++;
            }
        }
        
        if(flag==0){
            while(cost<=s){
                cost += m;
                if(cost<=s){
                    cnt++;
                }
            }
        }
        
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
