package deginePattern.factoryMethodPattern;

public class RobotFactory {
    //static 변수 -> 메모리 고정되어 프로그램 종료될때 해제 됨(자주 쓰면 퍼포먼스 악영향 있을 수 있음)
    public static Robot makeRobot(String type) {
        if (type.equals("dog")) return new DogRobot();
        if (type.equals("cat")) return new CatRobot();

        return null;
    }
}
