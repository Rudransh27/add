package com.company;
class Circle1{
    public int radius;
    Circle1()
    {
        System.out.println("I am a non param constructor of circle1");
    }
    Circle1(int r)
    {
        System.out.println("I am a parameterised constructor of circle");
        this.radius=r;
    }
    public double area()
       {
           return Math.PI*radius*radius;
       }
}
class Cylinder1 extends Circle1
{
    public int height;
    Cylinder1(int r, int h)
    {
        super(r);
        this.height=h;
        System.out.println("I am parameterised constructor of cylinder1");
    }
    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Practice12_1 {
    public static void main(String[] args) {
        Circle1 c=new Circle1(5);
        Cylinder1 obj=new Cylinder1(4,3);
        System.out.println(obj.volume());
        System.out.println(obj.area());
    }
}
