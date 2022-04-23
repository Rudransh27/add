package com.company;
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of rows we want
        // Outer for loop for printing the number of rows
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
