package com;

public class PatternAdv {
    public static void main(String[] args) {
        butterfly(4);
    }
    static void butterfly(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print("* ");
            }
            for(int j=1; j<=2*(i-1); j++)
            {
                System.out.print("  ");
            }
            for(int j=n; j>=i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
