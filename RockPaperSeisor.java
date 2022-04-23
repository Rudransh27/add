package com.company;
import java.util.Scanner;
import java.util.Random;
public class RockPaperSeisor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100);
        char comp='s';
        if(rand_int1<33)
        {
            comp='r';
        }
        else if(rand_int1>=33 && rand_int1<=66)
        {
            comp='p';
        }
        else if(rand_int1>66 && rand_int1<=99)
        {
            comp='s';
        }
        char user;
        int n;
        int draw=0, win=0, loose=0;
//        System.out.println("Enter r for rock");
//        System.out.println("Enter p for paper");
//        System.out.println("Enter s for seisor");
//        user = in.next().charAt(0);
        System.out.println("How many times you want to play");
        n=in.nextInt();
        while(n!=0)
        {
            System.out.println("Enter r for rock");
            System.out.println("Enter p for paper");
            System.out.println("Enter s for seisor");
            user = in.next().charAt(0);
            if (comp == 's' && user == 's' || comp == 'p' && user == 'p' || comp == 'r' && user == 'r') {
                System.out.printf("Computer choose %c and you choose %c\n", comp, user);
                System.out.println("Game draw");
                draw++;
            } else if (comp == 's' && user == 'r' || comp == 'r' && user == 'p' || comp == 'p' && user == 's') {
                System.out.printf("Computer choose %c and you choose %c\n", comp, user);
                System.out.println("You win :-)");
                win++;
            } else if (comp == 'r' && user == 's' || comp == 'p' && user == 'r' || comp == 's' && user == 'p') {
                System.out.printf("Computer choose %c and you choose %c\n", comp, user);
                System.out.println("Computer Win and You Loose :-(");
                loose++;
            } else {
                System.out.println("You play with invlaid object");
            }

            n--;
        }
        if(win>loose)
        {
            System.out.println("You win :-)");
        }
        else if(loose>win)
        {
            System.out.println("Computer Win and You Loose :-(");
        }
        else
        {
            System.out.println("Game draw");
        }
    }
}




