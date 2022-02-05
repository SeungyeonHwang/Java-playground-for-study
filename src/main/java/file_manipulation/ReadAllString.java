package file_manipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadAllString {
    //방법 1
    public static void main(String[] args) {
        String temp = "/Users/hwangseungyeon/Desktop/projects-to-study-java/src/main/java/file_manipulation/123.txt";

        try (BufferedReader br = Files.newBufferedReader(Paths.get(temp), StandardCharsets.UTF_8)) {

            StringBuilder builder = new StringBuilder();
            String str = null;
            while ((str = br.readLine()) != null) {
                builder.append(str).append("\n");
            }
            System.out.print(builder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


        //방법 2
        String temp1 = "/Users/hwangseungyeon/Desktop/projects-to-study-java/src/main/java/file_manipulation/123.txt";

        try (Stream<String> lines = Files.lines(Paths.get(temp1), StandardCharsets.UTF_8)) {

            StringBuilder builder = new StringBuilder();
            lines.forEach(s -> builder.append(s).append("\n"));
            System.out.println(builder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
