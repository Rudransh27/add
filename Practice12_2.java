package com.company;
class Rectangle1
{
    int length, breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double area()
    {
        return this.breadth*this.length;
    }
}

class Cuboid extends Rectangle1
{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area1()
    {
        return 2*((length*breadth) + (breadth*height) + (height*length));
    }
}
public class Practice12_2 {
    public static void main(String[] args) {
         Cuboid cub=new Cuboid();
         cub.setBreadth(4);
         cub.setLength(3);
         cub.setHeight(7);
        System.out.println(cub.area());
        System.out.println(cub.area1());
    }
}
