package com.company;

interface TVremote{
    void next();
    void back();
    void increase();
    void decrease();
}
interface SmartTVremote extends TVremote
{
    void youtube();
    void music();
}

class TV implements SmartTVremote{
    public void youtube()
    {
        System.out.println("Play Youtube");
    }
    public void music()
    {
        System.out.println("Play music");
    }
    public void next()
    {
        System.out.println("Play next Channel");
    }
    public void back()
    {
        System.out.println("Play the previous Channel");
    }
    public void increase()
    {
        System.out.println("Increase the volume");
    }
    public void decrease()
    {
        System.out.println("Decrease the volume");
    }
}
public class Practice13_4 {
    public static void main(String[] args) {
       TVremote sony=new TV();
       SmartTVremote samsung=new TV();
       sony.back();
       sony.decrease();
       sony.next();
       sony.increase();
       samsung.music();
       samsung.youtube();
    }
}
