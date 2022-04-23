package com.company;

public class PresidenceAsso {
     public static void main(String[] args){
         int f;
         f=34/2-4*3;
         System.out.println(f);
         /*    Here / and * have the same presidence hence they are evaluated on the basis of left to right associativity
               34/2 - 4*3
               17-4*3
               17-12
               =5
         */
         int g=4*2-34/2;
         // Quick quiz
         System.out.println(g);
         int x=8,y=2;
         int z=x/2-y/2;
         System.out.println(z);

         int a=1,b=7,c=12;
         int d=b*b/2/a-4*a*c/2/a;
         System.out.println(d);

         int v=4,u=3;
         int w=v*v-u*u;
         System.out.println(w);
         
         int p=3,q=1,s=2;
         int r=p*q-s;
         System.out.println(r);


}


}
