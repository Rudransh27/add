package com.company;
class Karmachari{
    // Properties or Attributes
    int salary;
    String name;

    // Methods
    public int getSalary()
    {
        return salary;
    }

    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }

}
public class Practice8_1 {
    public static void main(String[] args) {
        // Problem 1
        Karmachari harry=new Karmachari();
        harry.setName("Harry");
        String naam= harry.getName();
        System.out.println(naam);
        harry.salary=123;
        int n= harry.getSalary();
        System.out.println(n);
    }
}
