package com;
import java.util.Scanner;
public class CALENDER {

    public static void main(String[] args) {

        try {
            System.out.print("                                             ");System.out.println("------------------------------------------------------------------------------");
            System.out.print("                                             ");System.out.println("|                                    ASK US                                    |");
            System.out.print("                                             ");System.out.println("------------------------------------------------------------------------------");
            System.out.print("                                             ");System.out.println("|                               WHAT DAY IT IS ?                               |");
            System.out.print("                                             ");System.out.println("------------------------------------------------------------------------------");
            Scanner sc= new Scanner(System.in);
            System.out.print("                                             ");System.out.println("|                          **-DATE TO DAY CONVERTER-**                         |");
            System.out.print("                                             ");System.out.println("| 1) Enter date here:                                                          |");
            System.out.print("                                             ");System.out.print("|    ");int date=sc.nextInt();
            if(date<=31)
            {

                System.out.print("                                             ");System.out.println("| 2) Enter month here:                                                         |");
                System.out.print("                                             ");System.out.print("|    ");int month=sc.nextInt();
                if(month<=12)
                {

                    System.out.print("                                             ");System.out.println("| 3) Enter year here:                                                          |");
                    System.out.print("                                             ");System.out.print("|    ");int year=sc.nextInt();
                    if(year>=1000&&year<=9999)
                    {




                        int z=0;
                        int c=0;
                        int x=year%100;
                        int y=x+(x/4);

                        switch(month) {
                            case 1,10:
                                z=y+0+date;
                                break;
                            case 2,3,11:
                                z=y+3+date;
                                break;
                            case 4,7:
                                z=y+6+date;
                                break;
                            case 5:
                                z=y+1+date;
                                break;
                            case 6:
                                z=y+4+date;
                                break;
                            case 8:
                                z=y+2+date;
                                break;
                            case 9,12:
                                z=y+5+date;
                                break;
                        }

                        int key=z%7;

                        int a=year/100;
                        if(a%4==0)
                        {
                            key=key-1;
                        }
                        else if(a%4==1)
                        {
                            key=key+4;
                        }
                        else if(a%4==2)
                        {
                            key=key+2;
                        }
                        else if(a%4==3)
                        {
                            key=key+0;
                        }
                        if(year%400==0)
                        {
                            if(month<=2)
                            {
                                key=key-1;
                            }
                        }
                        if(year%400==0)
                        {
                            if(month<=2)
                            {
                                key=key-1;
                            }
                        }
                        else if(year%100==0)
                        {
                            key=key;
                        }
                        else if(year%4==0)
                        {
                            if(month<=2) {
                                key = key - 1;
                            }
                        }

                        switch(key) {

                            case 0:
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                System.out.print("                                             ");System.out.println("|                                   SUNDAY                                     |");
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                break;
                            case 1:
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                System.out.print("                                             ");System.out.println("|                                   MONDAY                                     |");
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                break;
                            case 2:
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                System.out.print("                                             ");System.out.println("|                                  TUESDAY                                     |");
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                break;
                            case 3:
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                System.out.print("                                            ");System.out.println("|                                   WEDNESDAY                                  |");
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                break;
                            case 4:
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                System.out.print("                                             ");System.out.println("|                                 THURSDAY                                     |");
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                break;
                            case 5:
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                System.out.print("                                             ");System.out.println("|                                   FRIDAY                                     |");
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                break;
                            case 6,-1:
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                System.out.print("                                             ");System.out.println("|                                 SATURDAY                                     |");
                                System.out.print("                                             ");System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
                                break;
                        }
                        System.out.print("                                             ");System.out.println("|                               (-: THANK YOU :-)                              |");
                        System.out.print("                                             ");System.out.println("------------------------------------------------------------------------------");
                    }

                    else{
                        System.out.println("Invalid input-->>Year");
                    }
                }

                else{
                    System.out.println("Invalid input-->>Month");
                }
            }

            else{
                System.out.println("Invalid input-->>Date");
            }





        }

        catch(Exception e){
            System.out.println("Invalid input-->>Required number format");
        }


    }
}