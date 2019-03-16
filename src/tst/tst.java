package tst;

import java.util.*;
import java.lang.*;
import java.lang.Integer;

public class tst {
    public static void main(String[] args) {
        Duck link = new Duck(9.9,9.9);
        link.eat();
        link.action();
        link.setAge(10.1);
        link.setWeight(10.1);
        link.output();

        System.out.println("******************************************************");

        Ostrich link1 = new Ostrich(10.1,10.1);
        link1.eat();
        System.out.println(link1.getAge());
        link1.setWeight(90);
        System.out.println(link1.getWeight());

        System.out.println("******************************************************");


        Dog link3 = new Dog(1.1, 2.1);

        link3.eat();
        link3.action();
        link3.setAge(101.1);
        link3.setWeight(101.3);
        link3.output1();


        System.out.println("******************************************************");

        Cat link4 = new Cat(1.1, 1.1);
        System.out.println(link4.getAge());
        System.out.println(link4.getWeight());
        link4.eat();
        link4.action();
    }
}


class baseClass11 {
    public double age = 99;
    public double weight = 99;
}

abstract class  baseClass2{
    abstract void action();
}


interface common{
    public void eat();

}

class Duck extends baseClass2 implements common {
    private double weight;
    private double age;

    public Duck(double age, double weight){
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public double getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void output() {
        System.out.println("Duck's weight: " + weight + "\n" + "Duck's age: " + age);
    }

    @Override
    public void eat() {
        System.out.println("I am  Duck and I can eat");
    }

    @Override
    public void action(){
        System.out.println("I am Duck and I can fly");
    }
}

class Ostrich implements common {
    private double weight;
    private double age;

    public Ostrich(double weight, double age){
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public double getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("I am Ostrich and I can also eat");
    }
}

class Dog extends baseClass2 implements common{
    private double weight;
    private double age;

    @Override
    public void eat() {
        System.out.println("I am Dog and I can also eat");
    }

    @Override
    public void action() {
        System.out.println("I am Dog and I I can gavkat");
    }

    public Dog(double weight, double age){
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public double getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void output1() {
        System.out.println("Age of dog is: " + this.age + "\n" + "Weight of dog is: " + this.weight);
    }
}

class Cat extends baseClass2 implements common{

    private double weight;
    private double age;

    public Cat(double weight, double age){
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public double getAge() {
        return age;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public void setAge() {
        this.weight = weight;
    }

    public void overall() {
        System.out.println("Cat's weight: " + this.weight + ", Cat's age: " + this.age);
    }

    @Override
    public void eat() {
        System.out.println("I am Car and I can eat");
    }

    @Override
    public void action() {
        System.out.println("I am cat and I can mayukat");
    }
}


