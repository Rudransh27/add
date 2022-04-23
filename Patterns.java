package com;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
         pattern1(4);
        System.out.println();
        System.out.println("Pattern 2");
         pattern2(5);
        System.out.println();
        System.out.println("Pattern 3");
        pattern3(5);
        System.out.println();
        System.out.println("Pattern 4");
        pattern4(5);
        System.out.println();
        System.out.println("Pattern 5");
        pattern5(5);
        System.out.println();
        System.out.println("Pattern 6");
        pattern6(6);
        System.out.println();
        System.out.println("Pattern 7");
        pattern7(6);
        System.out.println();
        System.out.println("Pattern 8");
        pattern8(6);
        System.out.println();
        System.out.println("Patter 28");
        pattern28(7);
    }
    static void pattern1(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=5; col++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern2(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern3(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n)
    {
        for(int i=1; i<=(2*n-1); i++)
        {
            if(i<=n)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int k=1; k<=2*n-i; k++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    static void pattern6(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n-row; col++)
            {
                System.out.print(" ");
            }
            for(int col1=1;col1<=row; col1++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int space=0; space<row-1; space++ )
            {
                System.out.print(" ");
            }

            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n)
    {
        for(int row=1; row<=2*n-1; row++)
        {
            int noOfCol=(row>n)? 2*n-row : row;
            for(int space=1; space<=n-noOfCol; space++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=noOfCol; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int spaces=1; spaces<=n-row; spaces++)
            {
                System.out.print("  ");
            }
            for(int col=row; col>=1; col--)
            {
                System.out.print(col+" ");
            }

            for(int col=2; col<=row; col++)
            {
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }
}


