package com.company;
class Sphere
{
    private int radius;
    public Sphere(int r)
    {
        this.radius=r;
    }
    public int getRadius()
    {
        return radius;
    }
    public double volume()
    {
        return 4/3d*Math.PI*radius*radius*radius;
    }
    public double surfaceArea()
    {
        return 4*Math.PI*radius*radius;
    }
}
public class Practice9_5 {
    public static void main(String[] args) {
        Sphere ball=new Sphere(8);
        System.out.println(ball.getRadius());
        System.out.println(ball.surfaceArea());
        System.out.println(ball.volume());
    }
}
