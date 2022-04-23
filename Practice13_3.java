package com.company;
abstract class BasicPhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class GalaxySamsung extends BasicPhone{
    void ring()
    {
        System.out.println("Phone is ringing");
    }
    void lift()
    {
        System.out.println("Answered the call");
    }
    void disconnect()
    {
        System.out.println("Denied the call");
    }
}
public class Practice13_3 {
    public static void main(String[] args) {
     BasicPhone m=new GalaxySamsung();
     m.ring();
     m.lift();
     m.disconnect();
    }
}
