package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class LuxorPen extends Pen{
    void write()
    {
        System.out.println("Write with the pen.");
    }

    void refill()
    {
        System.out.println("Refill the pen.");
    }
    void changsNib()
    {
        System.out.println("Change the nib.");
    }
}
public class Practice13_1 {
    public static void main(String[] args) {
        LuxorPen lpen = new LuxorPen();
        lpen.write();
        lpen.refill();
        lpen.changsNib();
    }
}
