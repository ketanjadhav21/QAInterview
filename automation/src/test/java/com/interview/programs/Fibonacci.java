package com.interview.programs;

public class Fibonacci {
	

	public static void main(String[] args){
		int num = 10;
		fibo(num);
		
	}

	private static void fibo(int num) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int c = 1;
		
		for(int i = 1; i<=num; i++){
			b = a;
			a = c;
			c = a + b;
			System.out.println(b);
		}
	}
	
	
//	public static void main(String[] args) {
//        int i = 1, n = 10, t1 = 0, t2 = 1;
//        System.out.print("First " + n + " terms: ");
//        while (i <= n)
//        {
//            System.out.print(t1 + " + ");
//            int sum = t1 + t2;
//            t1 = t2;
//            t2 = sum;
//            i++;
//        }
//    }
}


