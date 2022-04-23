package com.company;
import java.util.Scanner;
public class Practice7_7 {
    static void printStar(int n)
    {
        if(n==1)
        {
            System.out.println("*");
            return ;
        }
        else
            for(int i=0;i<n; i++) {
                System.out.print("*");
            }
        System.out.println();
            printStar(n-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        printStar(n);
    }
}
