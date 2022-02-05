import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileFindFilteringTest {

    /**
     * 파일 속성 조회
     */
    @Test
    void FileFindFilteringTest() throws IOException {
        String filePath = "/Users/hwangseungyeon/Desktop/projects-to-study-java/src/main/java/file_manipulation/wow.txt";
        BasicFileAttributes basicFileAttributes
                = Files.readAttributes(Paths.get(filePath), BasicFileAttributes.class);
        System.out.println("isRegularFile = " + basicFileAttributes.isRegularFile());
        System.out.println("creationTime = " + basicFileAttributes.creationTime());
        System.out.println("lastModifiedTime = " + basicFileAttributes.lastModifiedTime());
    }

    /**
     * Stream을 통한 파일 복제
     */
    @Test
    void testMe() {
        // 그냥 경로를 지정하는 코드다 신경쓰지 말자
        String realPath = "/Users/hwangseungyeon/Desktop/projects-to-study-java/src/main/java/file_manipulation/123.txt";
        String writePath = realPath.substring(0, realPath.lastIndexOf("/")) + "/wow.txt";

        // 여기서부터 집중
        try (
                InputStream is = Files.newInputStream(Paths.get(realPath));
                OutputStream os = Files.newOutputStream(Paths.get(writePath))
        ) {

            // 어떤 java 버전에서도 가능한 정석 코드
            byte[] buffer = new byte[8192];
            int read;
            while ((read = is.read(buffer)) >= 0) {
                os.write(buffer, 0, read);
            }

            // java 9 이상 사용시 Inputstream 의 transferTo(OutputStream out); 사용
            // is.transferTo(os);

            // Spring 을 사용 중이라면 아래 2가지 방식 모두 고려해보자.
            // StreamUtils.copy(is, os); // is, os 를 close 하지 않음, 내부 버퍼 4096 사용
            // FileCopyUtils.copy(is, os); // is, os 를 자동으로 close 함, 내부 버퍼 8192 사용

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 경로를 통한 파일 복제
     */
    public static void main(String[] args) throws IOException {
        String realPath = "/Users/hwangseungyeon/Desktop/projects-to-study-java/src/main/java/file_manipulation/123.txt";
        String writePath = realPath.substring(0, realPath.lastIndexOf("/")) + "/111.txt";
        Files.copy(Paths.get(realPath), Paths.get(writePath));
    }
}
