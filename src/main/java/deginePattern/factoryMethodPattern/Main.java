package deginePattern.factoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        Robot dog = RobotFactory.makeRobot("dog");
        Robot cat = RobotFactory.makeRobot("cat");

        dog.move();
        cat.move();
    }
}
