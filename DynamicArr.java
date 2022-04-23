package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DynamicArr {
    public static void main(String[] args) {
        ArrayList<Integer> DynamicArray= new ArrayList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 5 elements :");
        for(int i=0; i<5; i++)
        {
            int temp=in.nextInt();
            if(!DynamicArray.contains(temp))
            {
                DynamicArray.add(temp);
            }
        }
        Collections.sort(DynamicArray);
        System.out.println(DynamicArray);

    }
}
