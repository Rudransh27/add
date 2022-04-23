package com;

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            String s=in.next();
            int countU=0;
            int countD=0;
            for(int i=1; i<n; i++)
            {
                if(s.charAt(i)!=s.charAt(i-1))
                {
                    if(s.charAt(i)=='U')
                    {
                        countU++;
                    }
                    else
                    {
                        countD++;
                    }
                }
            }

            if(s.charAt(0)=='U')
            {
                countU++;
            }
            else
            {
                countD++;
            }

            int ans= Math.min(countD, countU);
            System.out.println(ans);

        }
    }





