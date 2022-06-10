package deginePattern.builderPattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private int age;
    private int height;
    private int iq;

    public User(String name, int age, int height, int iq) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", iq=" + iq +
                '}';
    }
}
