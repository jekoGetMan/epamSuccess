package Robot;

public class Main {
    public static void main(String[] args){

    Robot linkClassRobot = new Robot();
    CoffeeRobot linkClassCoffeeRotot = new CoffeeRobot();
    RobotCooker linkClassRobotCooker = new RobotCooker();
    RobotDancer linkClassRobotDancer = new RobotDancer();
//    Robot linkClassRobot = new Robot();

//        linkClassCoffeeRotot.work();
//        linkClassRobotCooker.work();
//        linkClassRobotDancer.work();

        System.out.println("Methods of Robots: ");
        Robot []robots = {linkClassCoffeeRotot, linkClassRobotCooker, linkClassRobotDancer, linkClassRobot};
//        for(int i = 0; i < robots.length; i++){
//            robots[i].work();
//        }
        for(Robot link: robots){
            link.work();
        }
    }


}
