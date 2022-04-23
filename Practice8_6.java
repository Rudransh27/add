package com.company;
class Circle
{
    private int radius;
    public void setRadius(int a)
    {
        radius=a;
    }
    public int getRadius()
    {
        return radius;
    }
    public float area()
    {
        return 3.14f*radius*radius;
    }
    public float perimeter()
    {
        return 2f*3.14f*radius;
    }
}
public class Practice8_6 {
    public static void main(String[] args) {
        Circle cir= new Circle();
        cir.setRadius(5);
        System.out.println(cir.getRadius());
        System.out.println(cir.area());
        System.out.println(cir.perimeter());


    }
}
