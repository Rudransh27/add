package com;
import java.util.Scanner;
public class Practice7_1 {
    static void table(int n)
    {
        for(int i=0; i<10; i++)
        {
            System.out.println(n+" X "+(i+1)+" = "+(n*(i+1)));
        }
    }
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       table(n);
    }
}
