package com.company;
class Cylinder
{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea()
    {
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double Volume()
    {
        return Math.PI*radius*radius*height;
    }
}
public class Practice9_1 {
    public static void main(String[] args) {
        Cylinder gas=new Cylinder();
        gas.setRadius(9);
        System.out.println(gas.getRadius());
        gas.setHeight(8);
        System.out.println(gas.getHeight());
        System.out.println(gas.surfaceArea());
        System.out.println(gas.Volume());
    }
}
