package ApacheHttpClient;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Httpclient2 {

    private static final String USER_AGENT = "Mozila/5.0";
    private static final String GET_URL = "https://jsonplaceholder.typicode.com/posts";

    public static void sendGet() throws ClientProtocolException, IOException {

        //http client 생성
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //get 메서드와 URL 설정
        HttpGet httpGet = new HttpGet(GET_URL);

        //agent 정보 설정
        httpGet.addHeader("User-Agent", USER_AGENT);
        httpGet.addHeader("Content-type", "application/json");

        //get 요청
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);

        System.out.println("GET Response Status");
        System.out.println(httpResponse.getStatusLine().getStatusCode());
        String json = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");

        System.out.println(json);

        httpClient.close();
    }

    public static void main(String[] args) throws IOException {
        Httpclient2.sendGet();
    }
}
