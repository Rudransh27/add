package com.company;
import java.util.Scanner;
public class Practice7_4 {
    static void printStars(int n)
    {
        for(int i=n; i>=0; i--)
        {
           for(int j=0; j<=i; j++)
           {
               System.out.print("*");
           }
            System.out.println();
        }

        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        printStars(n);
    }
}
