package JSON;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;

public class JasonExample {
    public void method1() {
        final JsonObject json = new JsonObject();
        json.add("name", "Bill");
        json.add("age", 24);
        System.out.println(json.toString());

        String name = json.getString("name", "");
        System.out.println(name);

        String age = json.get("age").toString();
        System.out.println(age);
    }


    public static void main(String[] args) {
        JasonExample jasonExample = new JasonExample();
        jasonExample.method1();

    }
}
