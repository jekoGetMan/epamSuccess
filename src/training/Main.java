package training;


abstract class AbstractClass{
    public abstract void abstractMethod();

}

class ConcreteClass extends AbstractClass{
    public void abstractMethod(){
        System.out.println("Implementation");
    }
}

public class Main{
    public static void main(String[] args){
        AbstractClass link = new ConcreteClass();

        link.abstractMethod();
    }
}
