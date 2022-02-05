package ApacheHttpClient;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. ClosableHttpClient 인스턴스를 생성
 * 2. HTTP request type에 따른 HttpGet/HttpPost 인스턴스 생성
 * 3. addHeader 메서드를 이용해 헤더정보 추가
 * 4. request를 execute해서 CloseableHttpResponse 얻기
 * 5. response 출력
 * 6. close 메서드를 통해 연결 종료
 */
public class Httpclient {

    private static final String USER_AGENT = "Mozila/5.0";
    private static final String GET_URL = "https://jsonplaceholder.typicode.com/posts";

    public static void sendGet() throws ClientProtocolException, IOException {

        //http client 생성
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //get 메서드와 URL 설정
        HttpGet httpGet = new HttpGet(GET_URL);

        //agent 정보 설정
        httpGet.addHeader("User-Agent", USER_AGENT);
        httpGet.addHeader("Content-type", "application/json"); //Json으로 응답 받기

        //get 요청
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);

        System.out.println("::GET Response Status::");

        //response의 status 코드 출력
        System.out.println(httpResponse.getStatusLine().getStatusCode());

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                httpResponse.getEntity().getContent()));

        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }

        reader.close();

        //Print result
        System.out.println(response.toString());
        httpClient.close();
    }

    public static void main(String[] args) throws IOException {
        Httpclient.sendGet();
    }
}
