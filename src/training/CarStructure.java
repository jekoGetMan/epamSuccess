package training;

public class CarStructure{
    CarBody link = new CarBody(9,9,9);
    SteeringWheel link1 = new SteeringWheel(2,2,2);
    

    public void print(){
        System.out.println(link.lol());
        System.out.println(link1.toString());
    }

    public void changing(){
        System.out.println("Some changes...");
        link.changing();
        link1.changing();
    }
}