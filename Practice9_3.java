package com.company;

class MyCylinder
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

    public MyCylinder(int r, int h)
    {
        this.radius= r;
        this.height= h;
    }
}
public class Practice9_3 {
    public static void main(String[] args) {
        MyCylinder water=new MyCylinder(9,12);
        System.out.println(water.getRadius());
        System.out.println(water.getHeight());


    }
}
