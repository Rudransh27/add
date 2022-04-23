package com.company;
import java.util.Scanner;
public class Practice7_3 {
    static int successiveSum(int n)
    {
        if(n<=1)
            return n;
        else
            return n+successiveSum(n-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(successiveSum(n));
    }

}
