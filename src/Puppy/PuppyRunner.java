package Puppy;

public class PuppyRunner{
    public static void main(String[] args){
    Puppy linkClassPuppy = new Puppy("Ralf");

        System.out.println("Name: " + linkClassPuppy.getName());
        System.out.println("Votes Cast: " + linkClassPuppy.voteCast());
        System.out.println("Jump: " + linkClassPuppy.jump());
        System.out.println("Run: " + linkClassPuppy.run());
        System.out.println("Bite: " + linkClassPuppy.bite());
    }
}