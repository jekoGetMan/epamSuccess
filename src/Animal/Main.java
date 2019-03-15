package Animal;



public class Main {


    public static void main(String[] args){
        Animal linkClassAnimal = new Animal(9.9, 1, "Baby");


        System.out.println("Age: " +  linkClassAnimal.getAge() + ", Speed: " + linkClassAnimal.getSpeed() + ", Name: " + linkClassAnimal.getName());

        System.out.println("Changing...");

        linkClassAnimal.setAge(19);
        linkClassAnimal.setSpeed(1.9);
        linkClassAnimal.setName("lol");

        System.out.println("Age: " +  linkClassAnimal.getAge() + ", Speed: " + linkClassAnimal.getSpeed() + ", Name: " + linkClassAnimal.getName());


    }

}
