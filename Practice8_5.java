package com.company;
class Tommy
{
    public void hit()
    {
        System.out.println("Hitting the enemy");
    }
    public void run()
    {
        System.out.println("Running towards the enemy");
    }
    public void fire()
    {
        System.out.println("Firing on the enemy");
    }
}
public class Practice8_5 {
    public static void main(String[] args) {
        Tommy fighter=new Tommy();
        fighter.run();
        fighter.hit();
        fighter.fire();
    }
}
