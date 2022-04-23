package com.company;

interface BasicAnimal
{
    void eat();
    void sleep();
}
class Monkey
{
    void jump()
    {
        System.out.println("Monkey jumps from one tree to another.");
    }
    void bite()
    {
        System.out.println("Monkey bites if you will attack on it.");
    }
}

class Human extends Monkey implements BasicAnimal
{
    void speak()
    {
        System.out.println("JAI HIND");
    }
     public void eat()
     {
         System.out.println("Animal gets energy by eating food.");
     }

     public void sleep()
     {
         System.out.println("Animals relax their body and mind by sleeping.");
     }
}
public class Practice13_2 {
    public static void main(String[] args) {
       Human motu =new Human();
       Monkey jaggu=new Human();
       BasicAnimal raju=new Human();

       motu.eat();
       motu.sleep();
       motu.speak();
       motu.bite();
       motu.jump();
       jaggu.jump();
       raju.eat();
       raju.sleep();
//     raju.speak(); THis will produce error.
    }
}
