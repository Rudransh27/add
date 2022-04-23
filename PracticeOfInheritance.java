package com.company;

class Father
{
    int a;
    Father()
    {
        System.out.println("I am a constructor of Parent class");
    }
    Father(int a)
    {
        this.a=a;
        System.out.println("I am a overloaded constructor of Father class with value of a as "+a);
    }
    public int getA() {
        return a;
    }
}

class Children extends Father
{
    Children()
    {
        System.out.println("I am constructor of derived Children class");
    }
    Children(int x, int y)
    {
        super(x);
        System.out.println("I am a overloaded constructor of class Children with vlaue of y as "+y);
    }
}

class Children1 extends Children
{
    Children1(int a, int b, int c)
    {
        super(a,b);
        System.out.println("I am a constructor of Children1 class with value of c as "+c);
    }
}
public class PracticeOfInheritance {
    public static void main(String[] args) {
        Father fa= new Father();
        Children ch=new Children();
        Children chj=new Children(2,3);
        Children1 ch1=new Children1(5,6,7);
    }
}
