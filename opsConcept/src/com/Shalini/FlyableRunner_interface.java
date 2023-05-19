package com.Shalini;


interface Flyable{
    void fly();
}
class bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("With wings");

    }
}
class aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("With fuel");

    }
}
public class FlyableRunner_interface {
    public static void main(String[] args) {
       // bird b=new bird();
        //b.fly();
        Flyable[] flyables={new bird(), new aeroplane(), new bird()};
        for (Flyable f:flyables)
        {
            f.fly();
        }

    }
}
