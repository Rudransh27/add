package com.company;
class Rectangle
  {
      int length,breadth;
      int area()
      {
          return length*breadth;
      }
      int perimeter()
      {
          return 2*length+2*breadth;
      }
  }
public class Practice8_4 {
    public static void main(String[] args) {
        Rectangle rect= new Rectangle();
        rect.length=3;
        rect.breadth=4;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}
