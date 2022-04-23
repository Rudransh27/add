package com;
import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=1; i<=t; i++)
        {
            String s=in.next();
            if(s.endsWith("A")|| s.endsWith("E") || s.endsWith("I")|| s.endsWith("O") || s.endsWith("U")|| s.endsWith("a") || s.endsWith("e") || s.endsWith("i") || s.endsWith("o")|| s.endsWith("u"))
            {
                System.out.printf("Case #%d: %s is ruled by Alice.\n",i,s);
            }
            else if(s.endsWith("y"))
            {
                System.out.printf("Case #%d: %s is ruled by nobody.\n",i,s);
            }
            else
            {
                System.out.printf("Case #%d: %s is ruled by Bob.\n",i,s);
            }
        }
    }
}

