package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class KaKaoBookSearch {
    public static void main(String[] args){
        //카카오 도서 검색 API
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //URL 만들기
                    //GET 방식에서 파라미터는 반드시 인코딩 되어야합니다.
                    String address = "https://dapi.kakao.com/v3/search/book?target=title";
                    address += "&query=";
                    address += URLEncoder.encode("삼국지", "utf-8");
                    //connection 민들기
                    URL url = new URL(address);
                    HttpURLConnection con = (HttpURLConnection)url.openConnection();
                    con.setConnectTimeout(30000);
                    con.setUseCaches(false);
                    con.setRequestMethod("GET");
                    //키설정
                    con.setRequestProperty("Authorization", "KakaoAK ceee0a1cea508755bb879075e0d060d7");
                    //데이터 읽어오기
                    BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    while (true){
                        String imsi = br.readLine();
                        if(imsi == null){
                            break;
                        }
                        sb.append(imsi+"\r\n");

                    }
                    String result = sb.toString();
                    System.out.println(result);
                    br.close();
                    con.disconnect();
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            }
        }).start();
    }
}
