package com.company;
import java.util.Scanner;
public class Practice7_5 {
    static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(fibonacci(n));
    }
}
