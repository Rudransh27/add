package com.company;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int num;
        int reverse=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int a=in.nextInt();
        while(a!=0)
        {
            reverse=(reverse*10) + a%10;
            a=a/10;
        }
        System.out.println("Number is reverse:"+reverse);
    }

}
