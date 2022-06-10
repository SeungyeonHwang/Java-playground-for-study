package deginePattern.builderPattern;

public class Builder {
    public static void main(String[] args) {
        //자바 빈즈 패턴
        Dog dog = new Dog();
        dog.setName("dog");
        dog.setAge(12);
        dog.setGender("male");
        //dog.setNickname("없음")

        //생성자 패턴
        Dog dog1 = new Dog("dog", 12, "male", null);

        //Builder 패턴
        Dog dog2 = new Dog.DogBuilder("dog", 12, "male", null).builder();

        UserBuilder userBuilder = new UserBuilder();
        User user = userBuilder
                .setName("홍길동")
                .setAge(28)
                .setHeight(178)
                .setIq(200)
                .build();

        System.out.println(user.toString());


    }
}
