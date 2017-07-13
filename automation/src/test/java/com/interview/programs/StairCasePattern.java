package com.interview.programs;

public class StairCasePattern {

	public static void main(String[] args) {
        System.out.println("Hello, world!");
        String[] arr = {"Intuit", "has", "best", "engineers", "you", "sagar","ketan","priyanka"};
        printPattern(arr);
   }
  


public static void printPattern(String[] arr) {
int space =0;
for(int i=0; i<arr.length-1;i=i+2)
{
String first = arr[i];
String second = arr[i+1];
if(i==0)
{
	  space= first.length();
}
else
{
space= space+(first.length()-1);
}
int len = first.length();
System.out.println(first);
char[] ch = second.toCharArray();
for(Character cha: ch)
{
    for(int j=1;j<space;j++)
    {
    System.out.print(" ");
    }
    System.out.println(cha);
}
for(int j=1;j<space;j++)
{
System.out.print(" ");
}

}	

}
}
