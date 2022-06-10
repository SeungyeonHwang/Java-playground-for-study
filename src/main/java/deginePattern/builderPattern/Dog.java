package deginePattern.builderPattern;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String nickname;

    public Dog(String name, int age, String gender, String nickname) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
    }

    public Dog() {
        //null
    }

    public Dog(DogBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.nickname = builder.nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    //Builder Class
    public static class DogBuilder {
        private String name;
        private int age;
        private String gender;
        private String nickname;

        public DogBuilder(String name, int age, String gender, String nickname) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.nickname = nickname;
        }

        public Dog builder() {
            return new Dog(this);
        }
    }
}
