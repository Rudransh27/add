package com.company;

public class Practice7_6 {
    static float average(int ...arr)
    {
        int sum=0;
        float avg;
        for(int x:arr)
        {
            sum+=x;
        }
        avg=sum/arr.length;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(average(1,2,3,4,5));
    }
}
