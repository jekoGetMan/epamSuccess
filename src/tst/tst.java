package tst;

import java.util.*;
import java.lang.*;
import java.lang.Integer;

public class tst {
    public static void main(String[] args) {
        Duck link = new Duck();
        link.eat();
        link.action();

        Ostrich link1 = new Ostrich();
        link1.eat();

        Dog link3 = new Dog();
        link3.eat();
        link3.action();

        Cat link4 = new Cat();
        link4.eat();
        link4.action();
    }
}

class baseClass{
    public double age = 99;
    public double weight = 99;
}


interface common{
    public void eat();
    public void action();
}

class Duck extends baseClass implements common {
    @Override
    public void eat() {
        System.out.println("I am  Duck and I can eat");
    }

    @Override
    public void action(){
        System.out.println("I am Duck and I can fly");
    }
}

class Ostrich extends baseClass {

    public void eat() {
        System.out.println("I am Ostrich and I can also eat");
    }
}

class Dog extends baseClass implements common{
    @Override
    public void eat() {
        System.out.println("I am Dog and I can also eat");
    }

    @Override
    public void action() {
        System.out.println("I am Dog and I I can gavkat");
    }
}

class Cat extends baseClass implements common{
    @Override
    public void eat() {
        System.out.println("I am Car and I can eat");
    }

    @Override
    public void action() {
        System.out.println("I am cat and I can mayukat");
    }
}


