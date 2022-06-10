package deginePattern.structuralPattern.adapterPattern;

public class Test {
    public static void main(String[] args) {
        Dog mydog = new Dog() {
            @Override
            public void run() {
                System.out.println("Dog run");
            }
        };
        Car dogCar = new DogToCarAdapter(mydog);

        movingTest(dogCar);
    }

    private static void movingTest(Car dogCar) {
        dogCar.move();
    }
}
