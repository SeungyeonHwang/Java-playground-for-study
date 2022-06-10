package deginePattern.builderPattern;

public class UserBuilder {
    private String name;
    private int age;
    private int height;
    private int iq;

    public UserBuilder setName(String name) {
        this.name = name;

        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;

        return this;
    }

    public UserBuilder setHeight(int height) {
        this.height = height;

        return this;
    }

    public UserBuilder setIq(int iq) {
        this.iq = iq;

        return this;
    }

    public User build() {
        User user = new User(name, age, height, iq);
        return user;
    }
}
