package com.company;
class CellPhone{
    public void ring()
    {
        System.out.println("Ringing");
    }
    public void vibrate()
    {
        System.out.println("Vibrating");
    }
    public void record()
    {
        System.out.println("Recording");
    }
    public void capture()
    {
        System.out.println("Capturing");
    }

}
public class Practice8_2 {
    public static void main(String[] args) {
        CellPhone samsung= new CellPhone();
        samsung.ring();
        samsung.vibrate();
        samsung.capture();
        samsung.record();

    }
}
