package Animal;

public class Animal {
    private double speed;
    private int age;
    private String name;

    public double getSpeed(){
        return speed;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }


    public Animal(double speed, int age, String name){
        this.speed = speed;
        this.age = age;
        this.name = name;
    }

}
