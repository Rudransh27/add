package com.company;

public class Rhombus {
    public static void main(String[] args) {
        bestRhombus(5);
        pyramid(5);
        diamond(5);
    }
    static void bestRhombus(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<n; j++)
            {
                System.out.print("* ");
            }
            for(int j=0; j<i; j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void pyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(i+" " );
            }
            System.out.println();
        }
    }

    static void diamond(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=2*(n-i)-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
