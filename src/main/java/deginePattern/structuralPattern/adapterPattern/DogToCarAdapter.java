package deginePattern.structuralPattern.adapterPattern;

public class DogToCarAdapter implements Car {

    Dog dog;

    public DogToCarAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void move() {
        System.out.println("Car move");
    }
}
