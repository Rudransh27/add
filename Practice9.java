package com.company;
import java.util.Scanner;
public class Practice9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=75;
        System.out.println("Enter the number ");
        int b=in.nextInt();
        if(b>a)
        {
            System.out.println(b+" is greater than "+a);
        }
        else
            System.out.println(a+" is greater than "+b);
    }
}
